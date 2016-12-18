package com.example.mettre.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends Activity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        String StringBuff = "";
        for (int i = 100; i > 1; i--) {
            boolean TYPE = false;
            for (int k = i - 1; k > 1; k--) {
                if (i % k == 0) {
                    TYPE = true;
                    break;
                }
            }
            if (!TYPE) {
                Log.d("质数：", "" + i);
                StringBuff += i + ",";
            }
        }
        int[] a = {1};
        for (int i = 2; i < 10; i++) {
            if (i == 2) {
                a = Arrays.copyOf(a, a.length + 1);
                a[a.length - 1] = 1;
                Log.d("你妹：", "" + 1);
            } else {
                a = Arrays.copyOf(a, a.length + 1);
                a[a.length - 1] = a[a.length - 2] +a[a.length - 3] ;
                Log.d("你妹：", "" + a[a.length - 1]);
            }
        }
        textView.setText("质数:" + StringBuff);
    }
}
