package com.example.exercicioactivity;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class TrancosoFragment extends Fragment {

    private Button btnCuriosidadeTancoso;


    public TrancosoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_trancoso, container, false);



        btnCuriosidadeTancoso =  view.findViewById(R.id.btnCuriosidadeTrancoso);

        btnCuriosidadeTancoso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"Blá blá blá blá blá 123!", Snackbar.LENGTH_LONG).show();
            }
        });



        return view;
    }

}
