package com.example.energi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActiviti extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activiti);

        String drinkInfo = getIntent().getStringExtra("choice");
        switch (drinkInfo){
            case ("Monster_Energy"){
                WebView browser=findViewById(R.id.webBrowser);
                browser.loadUrl("https://metanit.com");
            }
        }




    }
}