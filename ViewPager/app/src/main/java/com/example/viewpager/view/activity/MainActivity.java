package com.example.viewpager.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Display;
import android.view.View;

import com.example.viewpager.R;
import com.example.viewpager.adapter.ModeloAdapter;
import com.example.viewpager.model.Modelo;
import com.example.viewpager.view.fragment.FotoFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Modelo> listaModelo = new ArrayList<>();

        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabs);



        listaModelo.add(new Modelo("Exagerado",FotoFragment.novaInstancia(R.drawable.caju,"Exagerado")));
        listaModelo.add(new Modelo("Ideologia",FotoFragment.novaInstancia(R.drawable.caju2,"Ideologia")));
        listaModelo.add(new Modelo("Por ai",FotoFragment.novaInstancia(R.drawable.caju3,"Por ai")));

        ModeloAdapter adapter = new ModeloAdapter(getSupportFragmentManager(), listaModelo);


        viewPager.setAdapter(adapter);



        viewPager.setOffscreenPageLimit(listaModelo.size());

        tabLayout.setupWithViewPager(viewPager);

    }
}
