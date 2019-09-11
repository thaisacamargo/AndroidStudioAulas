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

public class HomeActivity extends AppCompatActivity {

    private TextInputLayout inputLayoutMusica;
    private FloatingActionButton btnAdd;
    private TextView txtNomeMusica;
    private Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        inputLayoutMusica = findViewById(R.id.textInputLayoutMusica);
        btnAdd = findViewById(R.id.floatingActionButtonAdd);
        txtNomeMusica = findViewById(R.id.textView);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeMusica = inputLayoutMusica.getEditText().getText().toString();

                if (nomeMusica.isEmpty() || nomeMusica == ""){
                    inputLayoutMusica.setError("O campo música deve ser preenchido");
                }else{
                    txtNomeMusica.setText(nomeMusica);
                    Snackbar.make(inputLayoutMusica,"Música adicionada",Snackbar.LENGTH_LONG).show();
                }
            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,TelaFinal.class));
            }
        });
    }
}
