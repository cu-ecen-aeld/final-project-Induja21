FILESEXTRAPATHS:prepend := "${TOPDIR}/../meta-custom/recipes-kernel/linux/files:"
SRC_URI += "file://i2c_uart_wifi.cfg"
# Append i2c-dev module to kernel modules
KERNEL_MODULES:append = " i2c-dev "

# Autoload i2c-dev module for Raspberry Pi
KERNEL_MODULE_AUTOLOAD:rpi += "i2c-dev"
