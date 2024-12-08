inherit cargo

SRC_URI = "git://github.com/cu-ecen-aeld/final-project-shpr8875.git;protocol=https;branch=main"
SRCREV="4e3ca7792cb4796dcef92a859c051dbace5b6dc2"


SUMMARY = "Hello World by Induja for Rust"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
# Set the source directory to the correct subfolder
S = "${WORKDIR}/git/rust-examples/hello-world"


BBCLASSEXTEND = "native"

