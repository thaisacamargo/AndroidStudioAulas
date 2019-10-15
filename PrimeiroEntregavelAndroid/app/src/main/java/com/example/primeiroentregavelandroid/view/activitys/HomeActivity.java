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
import com.example.primeiroentregavelandroid.model.ModelRestauranteDetalhado;
import com.example.primeiroentregavelandroid.model.ModelRestauranteHome;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements RecyclerClickHome {

    private Toolbar toolbar;
    private List<ModelRestauranteDetalhado> pratos;
    private RecyclerView recyclerView;
    private HomeAdapter adapter;

    public static final String RESTAURNTE_KEY = "restaurante";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setupToolbar();

        setupRecycler();
    }

    private void setupToolbar(){
        //Configurações Toolbar
        toolbar = findViewById(R.id.toolbar_home);
        toolbar.setTitle("Digital House Foods");
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        toolbar.setTitleMarginStart(8);
        setSupportActionBar(toolbar);
    }

    private void setupRecycler(){
        //RecyclerView e Adapter
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
        //Preenchendo restaurantes

        List<ModelRestauranteHome> restaurantes = new ArrayList<>();

        restaurantes.add(new ModelRestauranteHome(R.mipmap.restaurante1,"Tony Roma's","Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", pratos()));
        restaurantes.add(new ModelRestauranteHome(R.mipmap.restaurante2,"Aoyama - Moema","Alameda dos Arapanés, 532 - Moema", "Fecha às 00:00", pratos()));
        restaurantes.add(new ModelRestauranteHome(R.mipmap.restaurante3,"Outback - Moema","Av. Moaci, 187, 187 - Moema, São Paulo", "Fecha às 00:00", pratos()));
        restaurantes.add(new ModelRestauranteHome(R.mipmap.restaurante4,"Sí Señor!","Alameda Jauaperi, 626 - Moema", "Fecha às 01:00",pratos()));


        return restaurantes;
    }

    private List<ModelRestauranteDetalhado> pratos(){
        //Preenchendo pratos para os restaurante

        List<ModelRestauranteDetalhado> pratos = new ArrayList<>();

        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato, "Salada com molho de Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis descr descr descr ..."));
        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato, "Salada com molho de Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis descr descr descr ..."));
        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato, "Salada com molho de Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis descr descr descr ..."));
        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato, "Salada com molho de Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis descr descr descr ..."));
        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato, "Salada com molho de Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis descr descr descr ..."));
        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato, "Salada com molho de Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis descr descr descr ..."));
        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato, "Salada com molho de Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis descr descr descr ..."));
        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato, "Salada com molho de Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis descr descr descr ..."));
        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato, "Salada com molho de Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis descr descr descr ..."));
        pratos.add(new ModelRestauranteDetalhado(R.mipmap.prato, "Salada com molho de Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis descr descr descr ..."));

        return pratos;

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
        //Inflando Menu
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //Click Menu item
        int id = item.getItemId();
        if (id == R.id.item_menu) {
            Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
