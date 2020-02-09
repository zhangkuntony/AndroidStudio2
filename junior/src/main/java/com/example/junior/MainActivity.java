package com.example.junior;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_px).setOnClickListener(this);
        findViewById(R.id.btn_color).setOnClickListener(this);
        findViewById(R.id.btn_screen).setOnClickListener(this);
        findViewById(R.id.btn_margin).setOnClickListener(this);
        findViewById(R.id.btn_gravity).setOnClickListener(this);
        findViewById(R.id.btn_scroll).setOnClickListener(this);
        findViewById(R.id.btn_marquee).setOnClickListener(this);
        findViewById(R.id.btn_bbs).setOnClickListener(this);
        findViewById(R.id.btn_click).setOnClickListener(this);
        findViewById(R.id.btn_scale).setOnClickListener(this);
        findViewById(R.id.btn_capture).setOnClickListener(this);
        findViewById(R.id.btn_icon).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.btn_px:
                intent = new Intent(this, PxActivity.class);
                break;
            case R.id.btn_color:
                intent = new Intent(this, ColorActivity.class);
                break;
            case R.id.btn_screen:
                intent = new Intent(this, ScreenActivity.class);
                break;
            case R.id.btn_margin:
                intent = new Intent(this, MarginActivity.class);
                break;
            case R.id.btn_gravity:
                intent = new Intent(this, GravityActivity.class);
                break;
            case R.id.btn_scroll:
                intent = new Intent(this, ScrollActivity.class);
                break;
            case R.id.btn_marquee:
                intent = new Intent(this, MarqueeActivity.class);
                break;
            case R.id.btn_bbs:
                intent = new Intent(this, BbsActivity.class);
                break;
            case R.id.btn_click:
                intent = new Intent(this, ClickActivity.class);
                break;
            case R.id.btn_scale:
                intent = new Intent(this, ScaleActivity.class);
                break;
            case R.id.btn_capture:
                intent = new Intent(this, CaptureActivity.class);
                break;
            case R.id.btn_icon:
                intent = new Intent(this, IconActivity.class);
                break;
                default:
                    break;
        }
        startActivity(intent);
    }
}
