#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <unistd.h>
#include "com_example_jnitest_MainActivity.h"
#include <asm/unistd.h>   // for __NR_write
#include <stdlib.h>       // for ssize_t

ssize_t wwrite(int fd, const void *buf, ssize_t count)
{
    return syscall(__NR_write, fd, buf, count);
}

short counter;

JNIEXPORT jstring JNICALL Java_com_example_jnitest_MainActivity_JNIString
  (JNIEnv *env, jobject jobj) {

    int fd = open("/dev/fpga_led", O_RDWR);
    int ret = wwrite(fd, &counter, sizeof(counter));
    close(fd);
    counter++;
    if (counter > 255) counter = 0;
    return env -> NewStringUTF("Turning on LED one by one.");
}
