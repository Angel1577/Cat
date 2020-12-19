package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button click;
    EditText text;
    EditText text1;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        click = findViewById(R.id.button);
        text = findViewById(R.id.editText);
        text1 = findViewById(R.id.editText1);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, text.getText().toString(), Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, text1.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}