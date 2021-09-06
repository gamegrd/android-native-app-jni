package com.xgdebug.myapplication;

public class jni {
    {
        System.load("/data/local/tmp/libmyapplication.so");
    }
    public native String sayHello();
}
