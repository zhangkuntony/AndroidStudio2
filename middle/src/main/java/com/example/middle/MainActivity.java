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
        findViewById(R.id.btn_spinner_drapdown).setOnClickListener(this);
        findViewById(R.id.btn_spinner_dialog).setOnClickListener(this);
        findViewById(R.id.btn_spinner_icon).setOnClickListener(this);
        findViewById(R.id.btn_edit_simple).setOnClickListener(this);
        findViewById(R.id.btn_edit_cursor).setOnClickListener(this);
        findViewById(R.id.btn_edit_border).setOnClickListener(this);
        findViewById(R.id.btn_edit_hide).setOnClickListener(this);
        findViewById(R.id.btn_edit_jump).setOnClickListener(this);
        findViewById(R.id.btn_edit_auto).setOnClickListener(this);
        findViewById(R.id.btn_act_jump).setOnClickListener(this);
        findViewById(R.id.btn_act_rotate).setOnClickListener(this);
        findViewById(R.id.btn_act_home).setOnClickListener(this);
        findViewById(R.id.btn_act_uri).setOnClickListener(this);
        findViewById(R.id.btn_act_request).setOnClickListener(this);

        findViewById(R.id.btn_mortgage).setOnClickListener(this);
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
            case R.id.btn_switch_default:
                intent = new Intent(this, SwitchDefaultActivity.class);
                break;
            case R.id.btn_switch_ios:
                intent = new Intent(this, SwitchIOSActivity.class);
                break;
            case R.id.btn_radio_horizontal:
                intent = new Intent(this, RadioHorizontalActivity.class);
                break;
            case R.id.btn_radio_vertical:
                intent = new Intent(this, RadioVerticalActivity.class);
                break;
            case R.id.btn_spinner_drapdown:
                intent = new Intent(this, SpinnerDropdownActivity.class);
                break;
            case R.id.btn_spinner_dialog:
                intent = new Intent(this, SpinnerDialogActivity.class);
                break;
            case R.id.btn_spinner_icon:
                intent = new Intent(this, SpinnerIconActivity.class);
                break;
            case R.id.btn_edit_simple:
                intent = new Intent(this, EditSimpleActivity.class);
                break;
            case R.id.btn_edit_cursor:
                intent = new Intent(this, EditCursorActivity.class);
                break;
            case R.id.btn_edit_border:
                intent = new Intent(this, EditBorderActivity.class);
                break;
            case R.id.btn_edit_hide:
                intent = new Intent(this, EditHideActivity.class);
                break;
            case R.id.btn_edit_jump:
                intent = new Intent(this, EditJumpActivity.class);
                break;
            case R.id.btn_edit_auto:
                intent = new Intent(this, EditAutoActivity.class);
                break;
            case R.id.btn_act_jump:
                intent = new Intent(this, ActJumpActivity.class);
                break;
            case R.id.btn_act_rotate:
                intent = new Intent(this, ActRotateActivity.class);
                break;
            case R.id.btn_act_home:
                intent = new Intent(this, ActHomeActivity.class);
                break;
            case R.id.btn_act_uri:
                intent = new Intent(this, ActUriActivity.class);
                break;
            case R.id.btn_act_request:
                intent = new Intent(this, ActRequestActivity.class);
                break;
            case R.id.btn_mortgage:
                intent = new Intent(this, MortgageActivity.class);
                break;
                default:
                    break;
        }
        startActivity(intent);
    }
}
