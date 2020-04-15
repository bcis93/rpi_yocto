inherit core-image
IMAGE_INSTALL_append = " packagegroup-cloud-azure aesd-final-project iotedge-daemon iotedge-cli"
CORE_IMAGE_EXTRA_INSTALL += " openssh"
