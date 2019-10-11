package com.example.primeiroentregavelandroid.view.activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.primeiroentregavelandroid.R;
import com.example.primeiroentregavelandroid.adapter.HomeAdapter;
import com.example.primeiroentregavelandroid.interfaces.RecyclerClickHome;
import com.example.primeiroentregavelandroid.model.ModelRestauranteHome;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements RecyclerClickHome {

    private Toolbar toolbar;

    private RecyclerView recyclerView;
    private HomeAdapter adapter;

    public static final String RESTAURNTE_KEY = "restaurante";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar = findViewById(R.id.toolbar_home);
        toolbar.setTitle("Digital House Foods");
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        toolbar.setTitleMarginStart(8);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recyclerView_home);


        adapter = new HomeAdapter((listaRestaurante()), this);

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

    @Override
    public void onclick(ModelRestauranteHome restaurante) {
        //Envio do objeto para a tela de detalhe
        Intent intent = new Intent(HomeActivity.this, RestauranteActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(RESTAURNTE_KEY, restaurante);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.item_menu) {
            Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
