package com.example.primeiroentregavelandroid.view.activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.primeiroentregavelandroid.R;
import com.example.primeiroentregavelandroid.adapter.HomeAdapter;
import com.example.primeiroentregavelandroid.adapter.RestauranteAdapter;
import com.example.primeiroentregavelandroid.interfaces.RecycleClickRestaurante;
import com.example.primeiroentregavelandroid.model.ModelRestauranteDetalhado;
import com.example.primeiroentregavelandroid.model.ModelRestauranteHome;

import java.util.ArrayList;
import java.util.List;

public class RestauranteActivity extends AppCompatActivity  implements RecycleClickRestaurante {

    private Toolbar toolbar;

    private RecyclerView recyclerView;
    private RestauranteAdapter adapter;

    private ImageView imagemRestaurante;
    private TextView nome;
    public static final String RESTAURNTE_KEY = "restaurante";
    public static final String DETALHES_KEY = "detalhes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);

        initViews();


    //Toolbar
        toolbar = findViewById(R.id.toolbar_restaurante);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back_white_24dp));
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);


    //Comunicação
        if (getIntent() != null && getIntent().getExtras() != null){

            ModelRestauranteHome restaurante = getIntent().getExtras().getParcelable(RESTAURNTE_KEY);

            Drawable drawable = getResources().getDrawable(restaurante.getImgRestaurante());
            imagemRestaurante.setImageDrawable(drawable);
            nome.setText(restaurante.getTxtNomeRestaurante());

        }


    //RecyclerView e Adapter
        recyclerView = findViewById(R.id.recyclerView_restaurante);

        adapter = new RestauranteAdapter(listaPratos(),this);

        //Setando o adapter para o componente recyclerView
        recyclerView.setAdapter(adapter);

        //Definição do layout da lista utilizando a classe LayoutManager

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);

        //LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
    }

    private void initViews(){
        imagemRestaurante = findViewById(R.id.image_restaurante);
        nome = findViewById(R.id.text_restaurante_nome);

    }

    private List<ModelRestauranteDetalhado> listaPratos(){
        List<ModelRestauranteDetalhado> pratos = new ArrayList<>();

        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato,"Salada com molho Gengibre "));
        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato,"Salada com molho Gengibre "));
        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato,"Salada com molho Gengibre "));
        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato,"Salada com molho Gengibre "));
        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato,"Salada com molho Gengibre "));
        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato,"Salada com molho Gengibre "));
        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato,"Salada com molho Gengibre "));
        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato,"Salada com molho Gengibre "));
        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato,"Salada com molho Gengibre "));
        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato,"Salada com molho Gengibre "));


        return pratos;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onclick(ModelRestauranteDetalhado detalhado) {
        //Envio do objeto para a tela de detalhe
        Intent intent = new Intent(RestauranteActivity.this, DetalhesDoPratoActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(DETALHES_KEY, detalhado);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
