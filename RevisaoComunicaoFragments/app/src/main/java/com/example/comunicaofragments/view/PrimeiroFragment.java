package com.example.comunicaofragments.view;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.comunicaofragments.R;
import com.example.comunicaofragments.interfaces.Comunicador;
import com.example.comunicaofragments.model.ModeloPersonagem;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrimeiroFragment extends Fragment {

    public Comunicador comunicador;
    private Button btnDog;
    private Button btnCat;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        try {
            comunicador = (Comunicador) context;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_primeiro, container, false);

        initViews(view);

        btnDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ModeloPersonagem dog = new ModeloPersonagem(R.drawable.dog,"Scoob");

                comunicador.receberMensagem(dog);
            }
        });

        btnCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ModeloPersonagem cat = new ModeloPersonagem(R.drawable.cat, "Salem");

                comunicador.receberMensagem(cat);
            }
        });

        return view;
    }

    public void initViews(View view){
        btnDog = view.findViewById(R.id.btnDog);
        btnCat = view.findViewById(R.id.btnCat);
    }

}
