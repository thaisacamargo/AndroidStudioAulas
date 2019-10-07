package com.example.viewpager.view.fragment;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.viewpager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FotoFragment extends Fragment {


    private static final String NOME = "nome";
    private static final String IMAGEM = "imagem";
    private TextView txtNomeModelo;
    private ImageView imgModelo;


    public FotoFragment() {
        // Required empty public constructor
    }


    public static Fragment novaInstancia(int imagem, String nomeAlbum){
        FotoFragment fotoFragment = new FotoFragment();
        Bundle bundle = new Bundle();

        bundle.putInt(IMAGEM, imagem);
        bundle.putString(NOME, nomeAlbum);

        fotoFragment.setArguments(bundle);

        return fotoFragment;

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_foto, container, false);


        initViews(view);

        if(getArguments() != null){
            int imagemRecebida = getArguments().getInt(IMAGEM);
            String nomeRecebido = getArguments().getString(NOME);

            Drawable drawable = getResources().getDrawable(imagemRecebida);

            imgModelo.setImageDrawable(drawable);
            txtNomeModelo.setText(nomeRecebido);

        }


        return view;
    }

    private void initViews(View view){
        txtNomeModelo = view.findViewById(R.id.txtFragment);
        imgModelo = view.findViewById(R.id.imageView_caju);

    }
}
