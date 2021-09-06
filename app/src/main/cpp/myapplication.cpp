// Write C++ code here.
//
// Do not forget to dynamically load the C++ library into your application.
//
// For instance,
//
// In MainActivity.java:
//    static {
//       System.loadLibrary("myapplication");
//    }
//
// Or, in MainActivity.kt:
//    companion object {
//      init {
//         System.loadLibrary("myapplication")
//      }
//    }

#include <stdio.h>
#include <stdlib.h>
#include <jni.h>
#include <string>

/*
*  jstring:  返回值
*  Java_全类名_方法名
*  JNIEnv: 里面有很多方法
* jobject: 谁调用了这个方法就是谁的事例
*/


extern "C" JNIEXPORT jstring JNICALL
Java_com_xgdebug_myapplication_jni_sayHello(JNIEnv *env, jobject thiz) {
    std::string text = "I am from c";
    return (*env).NewStringUTF(text.c_str() );
}


