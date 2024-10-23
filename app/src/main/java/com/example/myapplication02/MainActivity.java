package com.example.myapplication02;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        // 查找打开第三个 Activity 的按钮并设置点击事件
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button buttonOpenThirdActivity = findViewById(R.id.buttonOpenThirdActivity);
        buttonOpenThirdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

        // 查找打开第四个 Activity 的按钮并设置点击事件
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonOpenFourthActivity = findViewById(R.id.buttonOpenFourthActivity); // 确保布局中有这个按钮
        buttonOpenFourthActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.myapplication02.FourthActivity.class);
                startActivity(intent);
            }
        });
    }
}
