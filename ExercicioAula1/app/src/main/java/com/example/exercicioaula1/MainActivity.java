package com.example.exercicioaula1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView);
        textView3 = findViewById(R.id.textView);
        textView4 = findViewById(R.id.textView);
        textView5 = findViewById(R.id.textView);



    }
}
