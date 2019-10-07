package com.example.comunicaofragments.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.comunicaofragments.R;
import com.example.comunicaofragments.interfaces.Comunicador;
import com.example.comunicaofragments.model.ModeloPersonagem;

public class MainActivity extends AppCompatActivity implements Comunicador {

    public static final String SO_KEY = "MODELOPERSONAGEM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        replaceFragment(R.id.container2, new PrimeiroFragment());
    }

    @Override
    public void receberMensagem(ModeloPersonagem personagem) {
        setBundleToFragment(personagem, SO_KEY);
    }

    private void setBundleToFragment(ModeloPersonagem modeloPersonagem, String CHAVE){
        Bundle bundle = new Bundle();
        bundle.putParcelable(CHAVE,modeloPersonagem);

        Fragment segundoFragment = new SegundoFragment();
        segundoFragment.setArguments(bundle);

        replaceFragment(R.id.container1,segundoFragment);
    }

    private void replaceFragment(int container, Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(container, fragment);
        transaction.commit();


        // *******FORMA SIMPLIFICADA *******
        //getSupportFragmentManager().beginTransaction().replace(container,fragment).commit();
    }





}
