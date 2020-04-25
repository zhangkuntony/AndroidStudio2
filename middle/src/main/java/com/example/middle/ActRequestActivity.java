package com.example.middle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

import com.example.middle.util.DateUtil;

public class ActRequestActivity extends AppCompatActivity implements OnClickListener {
    private EditText et_request;                                            //  声明一个编辑框对象
    private TextView tv_request;                                            //  声明一个文本视图对象

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_request);
        findViewById(R.id.btn_act_request).setOnClickListener(this);
        et_request = findViewById(R.id.et_request);                         //  从布局文件中获取名叫et_request的编辑框
        tv_request = findViewById(R.id.tv_request);                         //  从布局文件中获取名叫tv_request的文本视图
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_act_request) {
            Intent intent = new Intent();                                   //  创建一个新意图
            intent.setClass(this, ActResponseActivity.class);       //  设置要跳转的活动类
            intent.putExtra("request_time", DateUtil.getNowTime()); //  往意图中存入名叫request_time的字符串
            intent.putExtra("request_content", et_request.getText().toString());    //  往意图中存入名叫request_content的字符串
            startActivityForResult(intent, 0);                  //  期望接收下个页面的返回数据
        }
    }

    //  从后一个页面携带参数返回当前页面时触发
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {     //  接收返回数据
        if (data != null) {
            String response_time = data.getStringExtra("response_time");        //  从意图中取出名叫response_time的字符串
            String response_content = data.getStringExtra("response_content");  //  从意图中取出名叫response_content的字符串
            String desc = String.format("收到返回消息：\n应答时间为%s\n应答内容为%s",
                    response_time, response_content);
            tv_request.setText(desc);                                                   //  把返回消息的详情显示在文本视图上
        }
    }
}
