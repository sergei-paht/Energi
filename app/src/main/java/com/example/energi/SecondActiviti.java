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
        TextView textView = findViewById(R.id.drinkName);
        WebView browser = (WebView) findViewById(R.id.webBrowser);

        String drinkInfo = getIntent().getStringExtra("choice");
        switch (drinkInfo) {
            case ("Monster_Energy"):

                textView.setText(drinkInfo);

                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://ru.wikipedia.org/wiki/Monster_Energy");
                break;
            case ("Tornado_Energy"):
                textView.setText(drinkInfo);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://ru.wikipedia.org/wiki/Tornado_Energy");
                break;
            case ("Burn"):
                textView.setText(drinkInfo);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://ru.wikipedia.org/wiki/Burn_(%D1%8D%D0%BD%D0%B5%D1%80%D0%B3%D0%B5%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%D0%B9_%D0%BD%D0%B0%D0%BF%D0%B8%D1%82%D0%BE%D0%BA)");
                break;
            case ("Red_Bull"):
                textView.setText(drinkInfo);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://ru.wikipedia.org/wiki/Red_Bull_(напиток)");
                break;
            case ("Flash_UP"):
                textView.setText(drinkInfo);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://corporate.baltika.ru/brands/flash-up/flash-up/");
                break;
            case ("E-ON black power"):
                textView.setText(drinkInfo);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("http://eon-energydrink.com/");
                break;

        }
    }
}