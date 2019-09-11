package com.example.exercicioproduto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private EditText preco;
    private EditText desconto;
    private Double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = findViewById(R.id.button);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                preco = findViewById(R.id.editTextPreco);
                String p = preco.getText().toString();

                desconto = findViewById(R.id.editTextPercent);
                String d = desconto.getText().toString();

                Double total = parseDouble(p) * (1 - (parseDouble(d)/100));

                Toast.makeText(MainActivity.this, "Valor total é:" + total , Toast.LENGTH_SHORT).show();

            }
        });

    }
}
