inherit core-image
IMAGE_INSTALL_append = " aesd-final-project iotedge-daemon iotedge-cli"
CORE_IMAGE_EXTRA_INSTALL += " openssh"
