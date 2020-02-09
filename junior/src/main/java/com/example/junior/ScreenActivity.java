package com.example.junior;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.junior.util.Utils;

@SuppressWarnings("DefaultLocale")
public class ScreenActivity extends AppCompatActivity {
    private TextView tv_screen;                                     //  声明一个文本视图对象

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        tv_screen = findViewById(R.id.tv_screen);                   //  从布局文件中获取名叫tv_screen的文本视图
        showScreenInfo();
    }

    //  显示当前手机的屏幕参数信息
    private void showScreenInfo() {
        int width = Utils.getScreenWidth(this);                 //  获取手机屏幕的宽度
        int height = Utils.getScreenHeight(this);               //  获取手机屏幕的高度
        float density = Utils.getScreenDensity(this);           //  获取手机屏幕的像素密度
        String info = String.format("当前屏幕的宽度是%dpx, 高度是%dpx, 像素密度是%f",
                width, height, density);                            //  拼接屏幕参数信息的内容文本
        tv_screen.setText(info);                                    //  设置文本视图tv_screen的文本内容
    }
}
