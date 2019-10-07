package com.example.primeiroentregavelandroid.view.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.primeiroentregavelandroid.R;
import com.example.primeiroentregavelandroid.adapter.HomeAdapter;
import com.example.primeiroentregavelandroid.model.ModelRestauranteHome;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HomeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.recyclerView_home);


        adapter = new HomeAdapter((listaRestaurante()));

        //Setando o adapter para o componente recyclerView
        recyclerView.setAdapter(adapter);

        //Definição do layout da lista utilizando a classe LayoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);

    }

    private List<ModelRestauranteHome> listaRestaurante(){
        List<ModelRestauranteHome> restaurantes = new ArrayList<>();

        restaurantes.add(new ModelRestauranteHome(R.drawable.churras,"Churrascaria 1","Av. Magalhães de Castro, 4800", "Fecha às 22:30"));
        restaurantes.add(new ModelRestauranteHome(R.drawable.churras,"Churrascaria 2","Av. Magalhães de Castro, 4800", "Fecha às 22:30"));
        restaurantes.add(new ModelRestauranteHome(R.drawable.churras,"Churrascaria 3","Av. Magalhães de Castro, 4800", "Fecha às 22:30"));


        return restaurantes;
    }
}
