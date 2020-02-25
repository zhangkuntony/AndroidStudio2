package com.example.middle;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SwitchIOSActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private CheckBox ck_status;                                     //  声明一个复选框对象
    private TextView tv_result;                                    //  声明一个文本视图对象

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_ios);
        ck_status = findViewById(R.id.ck_status);                   //  从布局文件中获取名叫ck_status的开关按钮
        tv_result = findViewById(R.id.tv_result);                   //  从布局文件中获取名叫tv_result的文本视图
        ck_status.setOnCheckedChangeListener(this);                 //  给开关按钮设置选择监听器，一旦用户点击它，就触发监听器的onCheckedChanged方法
        refreshResult();
    }

    //  刷新仿IOS按钮的开关状态说明
    private void refreshResult() {
        String result = String.format("仿IOS开关的状态是%s", ck_status.isChecked() ? "开" : "关");
        tv_result.setText(result);
    }

    //  选择事件的处理方法
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        refreshResult();
    }
}
