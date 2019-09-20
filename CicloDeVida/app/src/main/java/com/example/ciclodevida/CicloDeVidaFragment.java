package com.example.ciclodevida;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class CicloDeVidaFragment extends Fragment {


    public CicloDeVidaFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("Ciclo","Fragment: Método onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Ciclo","Fragment: Método onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("Ciclo","Fragment: Método onCreateView()");
        return inflater.inflate(R.layout.fragment_ciclo_de_vida, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("Ciclo","Fragment: Método onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Ciclo","Fragment: Método onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Ciclo","Fragment: Método onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("Ciclo","Fragment: Método onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Ciclo","Fragment: Método onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Ciclo","Fragment: Método onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Ciclo","Fragment: Método onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("Ciclo","Fragment: Método onDetach()");
    }
}
