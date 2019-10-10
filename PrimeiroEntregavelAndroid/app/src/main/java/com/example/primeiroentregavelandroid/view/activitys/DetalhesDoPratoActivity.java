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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_do_prato);

        initViews();

        toolbar = findViewById(R.id.toolbar_prato);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back_white_24dp));
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);

        //Comunicação
        if (getIntent() != null && getIntent().getExtras() != null){

            ModelRestauranteDetalhado prato = getIntent().getExtras().getParcelable(DETALHES_KEY);

            Drawable drawable = getResources().getDrawable(prato.getImgPrato());
            imagemPrato.setImageDrawable(drawable);
            nomePrato.setText(prato.getNomePRato());

        }


    }

    private void initViews(){
        imagemPrato = findViewById(R.id.img_prato);
        nomePrato = findViewById(R.id.txt_nome_prato);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
