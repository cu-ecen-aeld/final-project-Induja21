inherit core-image
CORE_IMAGE_EXTRA_INSTALL += "python3 python3-pip python3-setuptools python3-paho-mqtt python3-smbus"
CORE_IMAGE_EXTRA_INSTALL += "mosquitto i2c-tools kernel-modules net-tools wpa-supplicant dnsmasq hostapd avahi-daemon iptables linux-firmware-bcm43430  rust-hello-world apt mqtt-subpub-scripts"
inherit extrausers
# See https://docs.yoctoproject.org/singleindex.html#extrausers-bbclass
# We set a default password of root to match our busybox instance setup
# Don't do this in a production image
# PASSWD below is set to the output of
# printf "%q" $(mkpasswd -m sha256crypt root) to hash the "root" password
# string
PASSWD = "\$5\$2WoxjAdaC2\$l4aj6Is.EWkD72Vt.byhM5qRtF9HcCM/5YpbxpmvNB5"
EXTRA_USERS_PARAMS = "usermod -p '${PASSWD}' root;"
