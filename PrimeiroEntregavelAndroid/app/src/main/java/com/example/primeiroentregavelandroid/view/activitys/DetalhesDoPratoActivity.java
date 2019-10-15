package com.example.primeiroentregavelandroid.view.activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.primeiroentregavelandroid.R;
import com.example.primeiroentregavelandroid.model.ModelRestauranteDetalhado;
import com.example.primeiroentregavelandroid.model.ModelRestauranteHome;

public class DetalhesDoPratoActivity extends AppCompatActivity {

    public static final String DETALHES_KEY = "detalhes";
    Toolbar toolbar;

    private ImageView imagemPrato;
    private TextView nomePrato;
    private TextView descricaoPrato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_do_prato);

        initViews();

        setupToolbar();

        recebendoDados();

    }

    private void initViews(){
        imagemPrato = findViewById(R.id.img_detalhe_prato);
        nomePrato = findViewById(R.id.text_prato_nome);
        descricaoPrato = findViewById(R.id.txtDetalhePrato);
    }

    private void recebendoDados() {
        //Comunicação
        if (getIntent() != null) {
            ModelRestauranteDetalhado pratos = getIntent().getExtras().getParcelable(DETALHES_KEY);
            if (pratos != null) {
                Drawable drawable = getResources().getDrawable(pratos.getImgPrato());
                imagemPrato.setImageDrawable(drawable);
                nomePrato.setText(pratos.getNomePRato());
                descricaoPrato.setText(pratos.getDescricaoPrato());
            }
        }
    }


    private  void setupToolbar(){
        //Configurações toolbar
        toolbar = findViewById(R.id.toolbar_prato);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back_white_24dp));
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //Botão back
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
