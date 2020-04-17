git submodule update --init --recursive

source poky/oe-init-build-env

bitbake-layers add-layer ../meta-raspberrypi
bitbake-layers add-layer ../meta-openembedded/meta-oe
bitbake-layers add-layer ../meta-openembedded/meta-python
bitbake-layers add-layer ../meta-openembedded/meta-networking
bitbake-layers add-layer ../meta-openembedded/meta-filesystems
bitbake-layers add-layer ../meta-virtualization
bitbake-layers add-layer ../meta-rust
bitbake-layers add-layer ../meta-iotedge
bitbake-layers add-layer ../meta-iot-cloud
bitbake-layers add-layer ../meta-aesd
