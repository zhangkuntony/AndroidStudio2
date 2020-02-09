package com.example.junior;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

//  页面类直接实现点击监听器的接口View.OnClickListener
public class ScaleActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView iv_scale;                             //  声明一个图像视图的对象

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
        iv_scale = findViewById(R.id.iv_scale);             //  从布局文件中获取名叫iv_scale的图像视图
        //  下面通过七个按钮，分别演示不同拉伸类型的图片拉伸效果
        findViewById(R.id.btn_center).setOnClickListener(this);
        findViewById(R.id.btn_fitCenter).setOnClickListener(this);
        findViewById(R.id.btn_centerCrop).setOnClickListener(this);
        findViewById(R.id.btn_centerInside).setOnClickListener(this);
        findViewById(R.id.btn_fitXY).setOnClickListener(this);
        findViewById(R.id.btn_fitStart).setOnClickListener(this);
        findViewById(R.id.btn_fitEnd).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {                           //  一旦监听到点击动作，就触发监听器的onClick方法
        if (v.getId() == R.id.btn_center) {
            iv_scale.setScaleType(ImageView.ScaleType.CENTER);      //  将拉伸类型设置为“按照原尺寸居中显示”
        } else if (v.getId() == R.id.btn_fitCenter) {
            iv_scale.setScaleType(ImageView.ScaleType.FIT_CENTER);  //  将拉伸类型设置为“保持宽高比例，拉伸图片使其位于视图中间”
        } else if (v.getId() == R.id.btn_centerCrop) {
            iv_scale.setScaleType(ImageView.ScaleType.CENTER_CROP); //  将拉伸类型设置为“拉伸图片使其充满视图，并位于视图中间”
        } else if (v.getId() == R.id.btn_centerInside) {
            iv_scale.setScaleType(ImageView.ScaleType.CENTER_INSIDE);   //  将拉伸类型设置为“保持宽高比例，缩小图片使之位于视图中间（只缩小不放大）”
        } else if (v.getId() == R.id.btn_fitXY) {
            iv_scale.setScaleType(ImageView.ScaleType.FIT_XY);      //  将拉伸类型设置为“拉伸图片使其正好填满视图（图片可能被拉伸变形）”
        } else if (v.getId() == R.id.btn_fitStart) {
            iv_scale.setScaleType(ImageView.ScaleType.FIT_START);   //  将拉伸类型设置为“保持宽高比例，拉伸图片使其位于视图上方或左侧”
        } else if (v.getId() == R.id.btn_fitEnd) {
            iv_scale.setScaleType(ImageView.ScaleType.FIT_END);     //  将拉伸类型设置为“保持宽高比例，拉伸图片使其位于视图下方或右侧”
        }
    }
}
