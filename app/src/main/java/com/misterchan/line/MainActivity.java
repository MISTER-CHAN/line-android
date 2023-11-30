package com.misterchan.line;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        var windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);

        var wmlp = new WindowManager.LayoutParams();
        wmlp.width = 1;
        wmlp.height = WindowManager.LayoutParams.MATCH_PARENT;
        wmlp.flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE | WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE | WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL;
        wmlp.format = PixelFormat.RGB_565;
        wmlp.gravity = Gravity.CENTER_HORIZONTAL;
        wmlp.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;

        var view = new View(this);
        view.setClickable(false);
        view.setBackgroundColor(Color.RED);

        windowManager.addView(view, wmlp);
    }
}