package com.example.additionapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent().hasExtra("inputText")) {
            TextView tv = findViewById(R.id.secondActivityTextView);
            String text = getIntent().getExtras().getString("inputText");
            tv.setText(text);
        }
    }
}
