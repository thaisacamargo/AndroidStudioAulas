package com.example.primeiroentregavelandroid.view.activitys;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.primeiroentregavelandroid.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout inputEmail;
    private TextInputLayout inputSenha;
    private Button btnLogin;
    private Button btnRegister;

    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9#_~!$&'()*+,;=:.\"(),:;<>@\\[\\]\\\\]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*$";
    private Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    private Matcher matcher;

    private String email, senha;

    public static final String EMAIL_KEY = "email";
    public static final String SENHA_KEY = "senha";

    @Override
    protected void onStart() {
        super.onStart();

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Digital House Foods");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initViews();

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, DetalhesDoPratoActivity.class));
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarCampos();
            }
        });


    }

    private void initViews(){
        inputEmail = findViewById(R.id.til_email_login);
        inputSenha = findViewById(R.id.til_password_login);
        btnLogin = findViewById(R.id.btn_login);
        btnRegister = findViewById(R.id.btn_register);
    }

    public void validarCampos(){
        inputEmail.setErrorEnabled(false);
        inputSenha.setErrorEnabled(false);

        email = inputEmail.getEditText().getText().toString().trim();
        senha = inputSenha.getEditText().getText().toString().trim();

        if (!validateEmail(email) && !validatePassword(senha)) {
            inputEmail.setError("Digite um e-mail válido");
            inputSenha.setError("Sua senha deve ter pelo menos 6 caractéres!");
        } else if (!validatePassword(senha)) {
            inputSenha.setError("Sua senha deve ter pelo menos 6 caractéres!");
            inputEmail.setErrorEnabled(false);
        } else if(!validateEmail(email)){
            inputEmail.setError("Digite um e-mail válido");
            inputSenha.setErrorEnabled(false);
        }else{

            inputEmail.setErrorEnabled(false);
            inputSenha.setErrorEnabled(false);

            startActivity(new Intent(LoginActivity.this, HomeActivity.class));

        }

    }

    public boolean validateEmail(String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validatePassword(String password) {
        return password.length() > 5;
    }
}
