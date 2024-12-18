#!/bin/bash
# Script to build image for qemu.
# Author: Siddhant Jajoo.
# Updated by: Induja Narayanan <Induja.Narayanan@colorado.edu>

git submodule init
git submodule sync
git submodule update

# Set up the build environment
source poky/oe-init-build-env

# Local.conf settings to append
CONFLINES=(
    'MACHINE ??= "raspberrypi3"'
    'TARGET_ARCH = "arm"'
    'DISTRO_FEATURES:append = " wifi systemd "'
    'VIRTUAL-RUNTIME_init_manager = "systemd"'
    'ENABLE_UART = "1"'
    'ENABLE_I2C = "1"'
    'ENABLE_WIFI = "1"'
)

# Append settings to local.conf if they don't already exist
for line in "${CONFLINES[@]}"; do
    grep -Fxq "$line" conf/local.conf || echo "$line" >> conf/local.conf
done

# Layers to add with bitbake-layers
BBLAYERS_ADD=(
    '../meta-raspberrypi'
    '../meta-openembedded/meta-oe'
    '../meta-openembedded/meta-python'
    '../meta-openembedded/meta-networking'
    '../meta-openembedded/meta-custom'
)

# Add each layer with bitbake-layers if not already present
for layer in "${BBLAYERS_ADD[@]}"; do
    bitbake-layers show-layers | grep "$(basename "$layer")" > /dev/null
    layer_info=$?
    if [ $layer_info -ne 0 ]; then
        echo "Adding $layer layer"
        bitbake-layers add-layer "$layer"
    else
        echo "$layer layer already exists"
    fi
done

# Exit on error and start the build
set -e
bitbake core-image-base

