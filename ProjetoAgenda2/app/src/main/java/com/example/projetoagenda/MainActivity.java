package com.example.projetoagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout InputNome;
    private TextInputLayout InputNum;
    private FloatingActionButton btnAdd;

    public static final String NOME_KEY = "nome";
    public static final String TELEFONE_KEY = "telefone";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputNome = findViewById(R.id.textInputLayout);
        InputNum = findViewById(R.id.textInputLayout2);
        btnAdd = findViewById(R.id.floatingActionButton);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = InputNome.getEditText().getText().toString();
                String telefone = InputNum.getEditText().getText().toString();

                if( !nome.isEmpty() && !telefone.isEmpty()){

                    //Criando Intent
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);

                    //Criando uma nova instância do tipo Bundle
                    Bundle bundle = new Bundle();

                    //Passando os dados para o bundle
                    bundle.putString(NOME_KEY,nome);
                    bundle.putString(TELEFONE_KEY,telefone);

                    //Passando o bundle para a intent
                    intent.putExtras(bundle);

                    //Passando a intent para a startActivity
                    startActivity(intent);

                }else {

                        InputNome.setError("Preencha o campo nome");
                        InputNum.setError("Preencha o campo telefone");

                }
            }
        });
    }
}
