package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);                 //  当前的页面布局采用的是res/layout/activity_main.xml
        TextView tv_hello = findViewById(R.id.tv_hello);        //  获取名叫tv_hello的TextView控件
        tv_hello.setText("今天天气真热啊，火辣辣的！");          //  设置TextView控件的文字内容
        tv_hello.setTextColor(Color.RED);                       //  设置TextView控件的文字颜色
        tv_hello.setTextSize(30);                               //  设置TextView控件的文字大小
    }
}
