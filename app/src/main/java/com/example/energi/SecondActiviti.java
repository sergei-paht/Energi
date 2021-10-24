package com.example.energi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActiviti extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activiti);

        String drinkInfo = getIntent().getStringExtra("choice");
        switch (drinkInfo) {
            case ("Monster_Energy"):
                TextView textView = findViewById(R.id.drinkName);
                textView.setText(drinkInfo);
                WebView browser = findViewById(R.id.webBrowser);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://ru.wikipedia.org/wiki/Monster_Energy");
        }
    }
}