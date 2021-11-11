package com.example.energi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // получаем элемент ListView
        ListView countriesList = findViewById(R.id.countriesList);

        // получаем ресурс
        String[] drinks = getResources().getStringArray(R.array.drinks);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, drinks);

        // устанавливаем для списка адаптер
        countriesList.setAdapter(adapter);
        // добавляем для списка слушатель
        countriesList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                // получаем выбранный элемент
                String selectedItem = drinks[position];
                Intent intentinfo = new Intent(MainActivity.this, SecondActiviti.class);
                intentinfo.putExtra("choice", selectedItem);
                startActivity(intentinfo);

                }
            }
        );

    }
}
