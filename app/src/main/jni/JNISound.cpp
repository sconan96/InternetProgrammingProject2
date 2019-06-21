#include <string.h>
#include <jni.h>
#include <stdio.h>
#include "com_example_jnitest_MainActivity.h"
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <termios.h>
#include <sys/mman.h>
#include <asm/unistd.h>
#include <errno.h>

ssize_t mywrite(int fd, const void *buf, ssize_t count)
{
    return syscall(__NR_write, fd, buf, count);
}

JNIEXPORT jstring JNICALL Java_com_example_jnitest_MainActivity_JNISound
        (JNIEnv *env, jobject jobj, jint value) {

    int fd;
    ssize_t ret;
    int data = value;

    fd = open("/dev/fpga_piezo", O_WRONLY);

    if(fd < 0) return reinterpret_cast<jstring>(-errno);

    ret = mywrite(fd, &data, 1);
    close(fd);

    if(ret==1) return 0;

}


