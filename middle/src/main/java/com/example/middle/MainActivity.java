package com.example.middle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_relative_xml).setOnClickListener(this);
        findViewById(R.id.btn_relative_code).setOnClickListener(this);
        findViewById(R.id.btn_frame).setOnClickListener(this);
        findViewById(R.id.btn_checkbox).setOnClickListener(this);
        findViewById(R.id.btn_switch_default).setOnClickListener(this);
        findViewById(R.id.btn_switch_ios).setOnClickListener(this);
        findViewById(R.id.btn_radio_horizontal).setOnClickListener(this);
        findViewById(R.id.btn_radio_vertical).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch(v.getId()) {
            case R.id.btn_relative_xml:
                intent = new Intent(this, RelativeXmlActivity.class);
                break;
            case R.id.btn_relative_code:
                intent = new Intent(this, RelativeCodeActivity.class);
                break;
            case R.id.btn_frame:
                intent = new Intent(this, FrameActivity.class);
                break;
            case R.id.btn_checkbox:
                intent = new Intent(this, CheckboxActivity.class);
                break;
                default:
                    break;
        }
        startActivity(intent);
    }
}
