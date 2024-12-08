SUMMARY = "MQTT Publisher and Subscriber Scripts"
DESCRIPTION = "Fetches remote repository and installs MQTT publisher and subscriber scripts"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"


SRC_URI = "git://github.com/cu-ecen-aeld/final-project-shpr8875.git;branch=main;protocol=https;type=git"
SRCREV = "4bec6f9a3d124a8f5014b4b39462d47e02eec052"

S = "${WORKDIR}/git"

do_install() {
    install -d ${D}${bindir}

    install -D ${S}/mqtt-data-acquistion/publisher.py ${D}${bindir}/publisher
    install -D ${S}/mqtt-data-acquistion/subscriber.py ${D}${bindir}/subscriber
    install -D ${S}/bmp180sensor/bmp180sensor.py ${D}${bindir}/bmp180sensor
    install -D ${S}/lcd_interface/lcd_display.py ${D}${bindir}/lcd_display
}

FILES:${PN} = "${bindir}"

