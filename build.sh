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
    'KERNEL_MODULES:append = " i2c-dev "'
    'KERNEL_MODULE_AUTOLOAD:rpi += "i2c-dev"'
    'ENABLE_I2C = "1"'
    'IMAGE_INSTALL:append = " python3 python3-pip python3-setuptools python3-paho-mqtt "'
    'IMAGE_INSTALL:append = " mosquitto i2c-tools kernel-modules  "'
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
bitbake core-image-minimal

