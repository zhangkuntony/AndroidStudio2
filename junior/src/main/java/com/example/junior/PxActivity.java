package com.example.junior;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.junior.util.Utils;

public class PxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_px);
        int dip_10 = Utils.dip2px(this, 10L);       //  将10dp的尺寸大小转换为对应的px数值
        TextView tv_padding = findViewById(R.id.tv_padding);            //  从布局文件中获取名叫tv_padding的文本视图
        tv_padding.setPadding(dip_10, dip_10, dip_10, dip_10);
    }
}
