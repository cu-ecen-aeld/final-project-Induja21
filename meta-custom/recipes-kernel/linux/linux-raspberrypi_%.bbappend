FILESEXTRAPATHS:prepend := "${TOPDIR}/../meta-custom/recipes-kernel/linux/files:"
SRC_URI += "file://i2c.cfg"
KERNEL_MODULE_AUTOLOAD:rpi += "i2c-dev"

