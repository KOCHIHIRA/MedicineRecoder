package com.example.medicinerecoder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton left;
    private ImageButton right;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        left = (ImageButton) findViewById(R.id.Left_Button);
        right = (ImageButton) findViewById(R.id.Right_Button);
        left.setOnClickListener(this);
        right.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent;
        switch(v.getId()) {
            case R.id.Left_Button:
                intent = new Intent(this, ProjectList.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_left);
                break;
            case R.id.Right_Button:
                intent = new Intent(this, CreateProject.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_right);
                break;
        }
    }
}