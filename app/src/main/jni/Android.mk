LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := JNIString
LOCAL_SRC_FILES := JNIString.cpp JNISound.cpp
LOCAL_LDLIBS := -llog

include $(BUILD_SHARED_LIBRARY)