package com.example.middle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RadioHorizontalActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private TextView tv_sex;                                                //  声明一个文本视图对象

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_horizontal);
        tv_sex = findViewById(R.id.tv_sex);                                 //  从布局文件中获取名叫tv_sex的文本视图
        RadioGroup rg_sex = findViewById(R.id.rg_sex);                      //  从布局文件中获取名叫rg_sex的单选组
        rg_sex.setOnCheckedChangeListener(this);                            //  给rg_sex设置单选监听器，一旦用户点击组内的单选按钮，就触发监听器的onCheckedChanged方法
        //  rg_sex.setOnCheckedChangeListener(new RadioListener());             //  给rg_sex设置单选监听器，一旦用户点击组内的单选按钮，就触发监听器的onCheckedChanged方法
    }

    //  在用户点击组内的单选按钮时触发
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (checkedId == R.id.rb_male) {
            tv_sex.setText("哇哦，你是个帅气的男孩");
        } else if (checkedId == R.id.rb_female) {
            tv_sex.setText("哇哦，你是个漂亮的女孩");
        }
    }

    class RadioListener implements RadioGroup.OnCheckedChangeListener {
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            Toast.makeText(RadioHorizontalActivity.this, "您选中了控件" + checkedId, Toast.LENGTH_LONG).show();
        }
    }
}
