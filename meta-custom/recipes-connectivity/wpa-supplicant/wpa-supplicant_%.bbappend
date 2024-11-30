do_install:append() {
    install -m 0644 ${TOPDIR}/../meta-custom/recipes-connectivity/wpa-supplicant/files/wpa_supplicant.conf ${D}${sysconfdir}/wpa_supplicant.conf
}

