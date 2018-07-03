package com.example.githook.githook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * @author author
 */
public class MainActivity extends AppCompatActivity {

    /**
     * 测试成员变量命名规则
     */
    private int mTest;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTest = 1;

        Log.e(TAG, String.format("%d", mTest));
    }
}
