package com.example.middle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioVerticalActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private TextView tv_marry;                                              //  声明一个文本视图对象

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_vertical);
        tv_marry = findViewById(R.id.tv_marry);                             //  从布局文件中获取名叫tv_marry的文本视图
        RadioGroup rg_marry = findViewById(R.id.rg_marry);                  //  从布局文件中获取名叫rg_marry的单选组
        rg_marry.setOnCheckedChangeListener(this);                          //  给rg_marry设置单选监听器，一旦用户点击组内的单选按钮，就触发监听器的onCheckedChanged方法
    }

    //  在用户点击组内的单选按钮时触发
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(checkedId == R.id.rb_married) {
            tv_marry.setText("哇哦，祝你早生贵子");
        } else if (checkedId == R.id.rb_unmarried) {
            tv_marry.setText("哇哦，你的前途不可限量");
        }
    }
}
