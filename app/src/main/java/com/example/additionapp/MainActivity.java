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
        Button secondActivityBtn = findViewById(R.id.secondActivityBtn); //R = resource, use findViewById to get objects from the things you set up
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
                //launch and activity outside the app
                String googleAdress = "https://www.google.com/"; //webadress
                Uri webAdress = Uri.parse(googleAdress);

                Intent goGoogle = new Intent(Intent.ACTION_VIEW, webAdress);
                if(goGoogle.resolveActivity(getPackageManager()) != null) {//checks if anything anc open the uri we provided
                    startActivity(goGoogle); //if something can it will start the activity and open the uri called webAdress
                }
            }
        });
    }
}
