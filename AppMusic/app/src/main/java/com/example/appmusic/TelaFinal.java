package com.example.appmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class TelaFinal extends AppCompatActivity {

    private TextInputLayout textInputNome;
    private FloatingActionButton btnCheck;
    private TextView txtGratidao;
    private Button btnAddNewMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_final);

        textInputNome = findViewById(R.id.textInputLayoutNome);
        btnCheck = findViewById(R.id.floatingActionButtonCheck);
        txtGratidao = findViewById(R.id.textViewObrigada);
        btnAddNewMusic = findViewById(R.id.buttonAddMusic);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = textInputNome.getEditText().getText().toString();

                if (nome.isEmpty() || nome == ""){
                    Snackbar.make(textInputNome,"O campo não pode ser vazio, preencha pufavô",Snackbar.LENGTH_LONG).show();
                }else{
                    txtGratidao.setText("Obrigado"+nome+"!");

                }
            }
        });

        btnAddNewMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TelaFinal.this,HomeActivity.class));
            }
        });
    }
}
