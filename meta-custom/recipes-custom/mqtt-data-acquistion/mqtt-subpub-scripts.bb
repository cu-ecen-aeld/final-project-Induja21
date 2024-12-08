SUMMARY = "MQTT Publisher and Subscriber Scripts"
DESCRIPTION = "Fetches remote repository and installs MQTT publisher and subscriber scripts"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"


SRC_URI = "git://github.com/cu-ecen-aeld/final-project-shpr8875.git;branch=main;protocol=https;type=git"
#SRCREV = "26bb9634dfb84451abff303a8eb2555b2b157755"
SRCREV = "7d18105ce8d81b9a50f610103d89dea67558a851"

S = "${WORKDIR}/git"

do_install() {
    install -d ${D}${bindir}

    install -D ${S}/mqtt-data-acquistion/publisher.py ${D}${bindir}/publisher
    install -D ${S}/mqtt-data-acquistion/subscriber.py ${D}${bindir}/subscriber
    install -D ${S}/mqtt-data-acquistion/bmp180sensor.py ${D}${bindir}/bmp180sensor
    install -D ${S}/mqtt-data-acquistion/lcd_display.py ${D}${bindir}/lcd_display
}

FILES:${PN} = "${bindir}"

