# mosquitto_%.bbappend


do_install:append() {
    # Ensure the configuration directory exists

    # Copy the modified mosquitto.conf file
    install -m 0644 ${TOPDIR}/../meta-custom/recipes-connectivity/mosquitto/files/mosquitto.conf ${D}${sysconfdir}/mosquitto/mosquitto.conf

}

