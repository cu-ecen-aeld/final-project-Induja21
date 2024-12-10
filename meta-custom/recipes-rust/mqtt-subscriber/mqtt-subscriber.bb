# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo cargo-update-recipe-crates

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get mqtt_subscriber could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/mqtt_subscriber/0.1.0"
SRC_URI += "git://git@github.com/cu-ecen-aeld/final-project-shpr8875.git;protocol=ssh;nobranch=1;branch=main"
SRCREV = "d78a4bc82eb44fcf5c72ec34846137e344e00094"
S = "${WORKDIR}/git/rust-examples/mqtt-subscriber"
CARGO_SRC_DIR = ""
PV:append = ".AUTOINC+4bec6f9a3d"
#RUSTFLAGS += "-Z namespaced-features"
# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/async-channel/1.9.0 \
    crate://crates.io/autocfg/1.4.0 \
    crate://crates.io/cc/1.2.3 \
    crate://crates.io/cmake/0.1.52 \
    crate://crates.io/concurrent-queue/2.5.0 \
    crate://crates.io/crossbeam-channel/0.5.13 \
    crate://crates.io/crossbeam-utils/0.8.20 \
    crate://crates.io/event-listener/2.5.3 \
    crate://crates.io/futures-channel/0.3.31 \
    crate://crates.io/futures-core/0.3.31 \
    crate://crates.io/futures-executor/0.3.31 \
    crate://crates.io/futures-io/0.3.31 \
    crate://crates.io/futures-macro/0.3.31 \
    crate://crates.io/futures-sink/0.3.31 \
    crate://crates.io/futures-task/0.3.31 \
    crate://crates.io/futures-timer/3.0.3 \
    crate://crates.io/futures-util/0.3.31 \
    crate://crates.io/futures/0.3.31 \
    crate://crates.io/libc/0.2.167 \
    crate://crates.io/log/0.4.22 \
    crate://crates.io/memchr/2.7.4 \
    crate://crates.io/openssl-sys/0.9.104 \
    crate://crates.io/paho-mqtt-sys/0.9.0 \
    crate://crates.io/paho-mqtt/0.12.5 \
    crate://crates.io/pin-project-lite/0.2.15 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.31 \
    crate://crates.io/proc-macro2/1.0.92 \
    crate://crates.io/quote/1.0.37 \
    crate://crates.io/shlex/1.3.0 \
    crate://crates.io/slab/0.4.9 \
    crate://crates.io/syn/2.0.90 \
    crate://crates.io/thiserror-impl/1.0.69 \
    crate://crates.io/thiserror/1.0.69 \
    crate://crates.io/unicode-ident/1.0.14 \
    crate://crates.io/vcpkg/0.2.15 \
"

SRC_URI[async-channel-1.9.0.sha256sum] = "81953c529336010edd6d8e358f886d9581267795c61b19475b71314bffa46d35"
SRC_URI[autocfg-1.4.0.sha256sum] = "ace50bade8e6234aa140d9a2f552bbee1db4d353f69b8217bc503490fc1a9f26"
SRC_URI[cc-1.2.3.sha256sum] = "27f657647bcff5394bf56c7317665bbf790a137a50eaaa5c6bfbb9e27a518f2d"
SRC_URI[cmake-0.1.52.sha256sum] = "c682c223677e0e5b6b7f63a64b9351844c3f1b1678a68b7ee617e30fb082620e"
SRC_URI[concurrent-queue-2.5.0.sha256sum] = "4ca0197aee26d1ae37445ee532fefce43251d24cc7c166799f4d46817f1d3973"
SRC_URI[crossbeam-channel-0.5.13.sha256sum] = "33480d6946193aa8033910124896ca395333cae7e2d1113d1fef6c3272217df2"
SRC_URI[crossbeam-utils-0.8.20.sha256sum] = "22ec99545bb0ed0ea7bb9b8e1e9122ea386ff8a48c0922e43f36d45ab09e0e80"
SRC_URI[event-listener-2.5.3.sha256sum] = "0206175f82b8d6bf6652ff7d71a1e27fd2e4efde587fd368662814d6ec1d9ce0"
SRC_URI[futures-channel-0.3.31.sha256sum] = "2dff15bf788c671c1934e366d07e30c1814a8ef514e1af724a602e8a2fbe1b10"
SRC_URI[futures-core-0.3.31.sha256sum] = "05f29059c0c2090612e8d742178b0580d2dc940c837851ad723096f87af6663e"
SRC_URI[futures-executor-0.3.31.sha256sum] = "1e28d1d997f585e54aebc3f97d39e72338912123a67330d723fdbb564d646c9f"
SRC_URI[futures-io-0.3.31.sha256sum] = "9e5c1b78ca4aae1ac06c48a526a655760685149f0d465d21f37abfe57ce075c6"
SRC_URI[futures-macro-0.3.31.sha256sum] = "162ee34ebcb7c64a8abebc059ce0fee27c2262618d7b60ed8faf72fef13c3650"
SRC_URI[futures-sink-0.3.31.sha256sum] = "e575fab7d1e0dcb8d0c7bcf9a63ee213816ab51902e6d244a95819acacf1d4f7"
SRC_URI[futures-task-0.3.31.sha256sum] = "f90f7dce0722e95104fcb095585910c0977252f286e354b5e3bd38902cd99988"
SRC_URI[futures-timer-3.0.3.sha256sum] = "f288b0a4f20f9a56b5d1da57e2227c661b7b16168e2f72365f57b63326e29b24"
SRC_URI[futures-util-0.3.31.sha256sum] = "9fa08315bb612088cc391249efdc3bc77536f16c91f6cf495e6fbe85b20a4a81"
SRC_URI[futures-0.3.31.sha256sum] = "65bc07b1a8bc7c85c5f2e110c476c7389b4554ba72af57d8445ea63a576b0876"
SRC_URI[libc-0.2.167.sha256sum] = "09d6582e104315a817dff97f75133544b2e094ee22447d2acf4a74e189ba06fc"
SRC_URI[log-0.4.22.sha256sum] = "a7a70ba024b9dc04c27ea2f0c0548feb474ec5c54bba33a7f72f873a39d07b24"
SRC_URI[memchr-2.7.4.sha256sum] = "78ca9ab1a0babb1e7d5695e3530886289c18cf2f87ec19a575a0abdce112e3a3"
SRC_URI[openssl-sys-0.9.104.sha256sum] = "45abf306cbf99debc8195b66b7346498d7b10c210de50418b5ccd7ceba08c741"
SRC_URI[paho-mqtt-sys-0.9.0.sha256sum] = "5e482419d847af4ec43c07eed70f5f94f87dc712d267aecc91ab940944ab6bf4"
SRC_URI[paho-mqtt-0.12.5.sha256sum] = "b8367868d51cef74c28da328ed8f60529ddd3f04dca1867dd825fcc3085a4308"
SRC_URI[pin-project-lite-0.2.15.sha256sum] = "915a1e146535de9163f3987b8944ed8cf49a18bb0056bcebcdcece385cece4ff"
SRC_URI[pin-utils-0.1.0.sha256sum] = "8b870d8c151b6f2fb93e84a13146138f05d02ed11c7e7c54f8826aaaf7c9f184"
SRC_URI[pkg-config-0.3.31.sha256sum] = "953ec861398dccce10c670dfeaf3ec4911ca479e9c02154b3a215178c5f566f2"
SRC_URI[proc-macro2-1.0.92.sha256sum] = "37d3544b3f2748c54e147655edb5025752e2303145b5aefb3c3ea2c78b973bb0"
SRC_URI[quote-1.0.37.sha256sum] = "b5b9d34b8991d19d98081b46eacdd8eb58c6f2b201139f7c5f643cc155a633af"
SRC_URI[shlex-1.3.0.sha256sum] = "0fda2ff0d084019ba4d7c6f371c95d8fd75ce3524c3cb8fb653a3023f6323e64"
SRC_URI[slab-0.4.9.sha256sum] = "8f92a496fb766b417c996b9c5e57daf2f7ad3b0bebe1ccfca4856390e3d3bb67"
SRC_URI[syn-2.0.90.sha256sum] = "919d3b74a5dd0ccd15aeb8f93e7006bd9e14c295087c9896a110f490752bcf31"
SRC_URI[thiserror-impl-1.0.69.sha256sum] = "4fee6c4efc90059e10f81e6d42c60a18f76588c3d74cb83a0b242a2b6c7504c1"
SRC_URI[thiserror-1.0.69.sha256sum] = "b6aaf5339b578ea85b50e080feb250a3e8ae8cfcdff9a461c9ec2904bc923f52"
SRC_URI[unicode-ident-1.0.14.sha256sum] = "adb9e6ca4f869e1180728b7950e35922a7fc6397f7b641499e8f3ef06e50dc83"
SRC_URI[vcpkg-0.2.15.sha256sum] = "accd4ea62f7bb7a82fe23066fb0957d48ef677f6eeb8215f372f52e48bb32426"

# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    "

SUMMARY = "A simple MQTT subscriber for receiving messages"
HOMEPAGE = "https://github.com/cu-ecen-aeld/final-project-Induja21"
LICENSE = "CLOSED"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include mqtt_subscriber-${PV}.inc
include mqtt_subscriber.inc
