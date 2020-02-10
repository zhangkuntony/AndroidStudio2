package com.example.junior;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ShapeActivity extends AppCompatActivity implements View.OnClickListener {
    private View v_content;                                             //  声明一个视图对象

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape);
        v_content = findViewById(R.id.btn_shape);                       //  从布局文件中获取名叫v_content的视图
        findViewById(R.id.btn_rect).setOnClickListener(this);           //  给btn_rect设置点击监听器
        findViewById(R.id.btn_oval).setOnClickListener(this);           //  给btn_oval设置点击监听器
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_rect) {                               //  点击了按钮btn_rect
            v_content.setBackgroundResource(R.drawable.shape_rect_gold);//  把矩形形状设置为v_content的背景
        } else if (v.getId() == R.id.btn_oval) {                        //  点击了按钮btn_oval
            v_content.setBackgroundResource(R.drawable.shape_oval_rose);//  把椭圆形状设置为v_content的背景
        }
    }
}
