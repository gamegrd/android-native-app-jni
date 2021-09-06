package com.xgdebug.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import com.xgdebug.myapplication.jni;
import android.util.Log;

import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String TAG="xgdebug";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "This is Information");
        Log.w(TAG, "This is Warnning.");
        String result = new jni().sayHello();
        System.out.println(result);
        Log.d(TAG, "the string from JNC C '"+result + "'");

    }
}