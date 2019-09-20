package com.example.projetoagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import static com.example.projetoagenda.MainActivity.NOME_KEY;
import static com.example.projetoagenda.MainActivity.TELEFONE_KEY;

public class HomeActivity extends AppCompatActivity {


    private TextView textNome;
    private TextView textNum;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textNome = findViewById(R.id.textNome);
        textNum = findViewById(R.id.textNum);
        btnBack = findViewById(R.id.btnBack);

        Intent intent = getIntent();
        if (getIntent() != null && intent.getExtras() != null){
            Bundle bundle = intent.getExtras();
            String nome = bundle.getString(NOME_KEY);
            String telefone = bundle.getString(TELEFONE_KEY);

            textNome.setText(nome);
            textNum.setText(telefone);
        }else{
            Snackbar.make(textNome,"Não há dados para serem exibidos!",Snackbar.LENGTH_LONG);
        }


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,MainActivity.class));
            }
        });

    }
}
