FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://i2c.cfg"
KERNEL_MODULE_AUTOLOAD:rpi += "i2c-dev"

