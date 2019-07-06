package com.example.additionapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button secondActivityBtn = findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Launch activity in our own app
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startIntent.putExtra("inputText", "Hello World");
                startActivity(startIntent);
            }
        });
        Button googleBtn = findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googleAdress = "https://www.google.com/";
                Uri webAdress = Uri.parse(googleAdress);

                Intent goGoogle = new Intent(Intent.ACTION_VIEW, webAdress);
                if(goGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(goGoogle);
                }
            }
        });
    }
}
