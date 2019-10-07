package com.example.primeiroentregavelandroid.view.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.primeiroentregavelandroid.R;
import com.example.primeiroentregavelandroid.adapter.HomeAdapter;
import com.example.primeiroentregavelandroid.adapter.RestauranteAdapter;
import com.example.primeiroentregavelandroid.model.ModelRestauranteDetalhado;
import com.example.primeiroentregavelandroid.model.ModelRestauranteHome;

import java.util.ArrayList;
import java.util.List;

public class RestauranteActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RestauranteAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);

        recyclerView = findViewById(R.id.recyclerView_restaurante);

        adapter = new RestauranteAdapter(listaPratos());

        //Setando o adapter para o componente recyclerView
        recyclerView.setAdapter(adapter);

        //Definição do layout da lista utilizando a classe LayoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
    }

    private List<ModelRestauranteDetalhado> listaPratos(){
        List<ModelRestauranteDetalhado> pratos = new ArrayList<>();

        pratos.add(new ModelRestauranteDetalhado(R.drawable.churras,"Churrasquinho 1"));
        pratos.add(new ModelRestauranteDetalhado(R.drawable.churras,"Churrasquinho 2"));
        pratos.add(new ModelRestauranteDetalhado(R.drawable.churras,"Churrasquinho 3"));

        return pratos;
    }
}
