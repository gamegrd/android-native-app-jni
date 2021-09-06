/*
1. 编译APK
2. 编译 到dex
D:\Android\ENV\build-tools\30.0.3\dx.bat --dex --no-strict --output R:\\xgcv.dex D:\Android\Project\MyApplication\app\build\intermediates\javac\debug\classes\com\xgdebug\myapplication
3. adb push arm64-v8a/libmyapplication.so /data/local/tmp
4. adb push R:\\xgcv.dex /data/local/tmp
5. adb shell "app_process -Djava.class.path=/data/local/tmp/xgcv.dex  /data/local/tmp com.xgdebug.myapplication.xgcv"

*/

