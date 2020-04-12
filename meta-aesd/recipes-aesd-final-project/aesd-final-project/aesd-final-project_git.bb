# See http://git.yoctoproject.org/cgit.cgi/poky/tree/meta/files/common-licenses
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# TODO: Set this  with the path to your assignments rep.  Use ssh protocol and see lecture notes
# about how to setup ssh-agent for passwordless access
SRC_URI = "git://git@github.com/atharvanan1/aesd_linux_app.git;protocol=ssh;branch=master"

PV = "1.0+git${SRCPV}"
# TODO: set to reference a specific commit hash in your assignment repo
SRCREV = "ad3f45688d1714438460c7a72ffff302e1bf1b0f"

# This sets your staging directory based on WORKDIR, where WORKDIR is defined at 
# https://www.yoctoproject.org/docs/latest/ref-manual/ref-manual.html#var-WORKDIR
S = "${WORKDIR}/git"

# TODO: Add the aesdsocket application and any other files you need to install
# See http://git.yoctoproject.org/cgit.cgi/poky/plain/meta/conf/bitbake.conf?h=warrior for yocto path prefixes
#FILES_${PN} += "${bindir}/azure_app"
FILES_${PN} += "${bindir}/hello_world"

# TODO: customize these as necessary for any libraries you need for your application
TARGET_LDFLAGS += ""

#inherit update-rc.d

#INITSCRIPT_PACKAGES = "${PN}"

#INITSCRIPT_NAME_${PN} = "aesdsocket-start-stop"

do_configure () {
	:
}

do_compile () {
	oe_runmake
}

do_install () {
	install -d ${D}${bindir}
	#install -m 0755 ${S}/azure/azure_app ${D}${bindir}/
	install -m 0755 ${S}/hello_world ${D}${bindir}/
}
