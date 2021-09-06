package com.xgdebug.myapplication;
import android.os.Build;
import android.util.Log;

import java.lang.reflect.Field;

/*
1. 编译APK
2. 编译 到dex
D:\Android\ENV\build-tools\30.0.3\dx.bat --dex --no-strict --output R:\\xgcv.dex D:\Android\Project\MyApplication\app\build\intermediates\javac\debug\classes\com\xgdebug\myapplication
3. adb push arm64-v8a/libmyapplication.so /data/local/tmp
4. adb push R:\\xgcv.dex /data/local/tmp
5. adb shell "app_process -Djava.class.path=/data/local/tmp/xgcv.dex  /data/local/tmp com.xgdebug.myapplication.xgcv"

*/
public class xgcv
{
    private static final String ACTIVITY_TAG="LogDemo";
    public static void main(String[] args) {
            System.out.println("helloworld");
            System.out.println( Build.VERSION.RELEASE );
            System.out.println("helloworld222");
            System.setProperty("java.library.path", System.getProperty("java.library.path") + ":/data/local/tmp");
            try {


                    System.out.println(System.getProperty("java.library.path"));
                    String result = new jni().sayHello();
                    System.out.println(result);
                    // 打印JNI本地方法返回的字符串。
                    Log.d(xgcv.ACTIVITY_TAG, "the string from JNC C '"+result + "'");
            } catch (Exception e) {
                    e.printStackTrace();
            }


            Log.v(xgcv.ACTIVITY_TAG, "This is Verbose.");
            Log.d(xgcv.ACTIVITY_TAG, "This is Debug.");
            Log.i(xgcv.ACTIVITY_TAG, "This is Information");
            Log.w(xgcv.ACTIVITY_TAG, "This is Warnning.");
            Log.e(xgcv.ACTIVITY_TAG, "This is Error.");

    }
}