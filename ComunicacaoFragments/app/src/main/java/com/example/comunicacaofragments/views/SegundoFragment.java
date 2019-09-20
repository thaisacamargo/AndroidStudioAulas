package com.example.comunicacaofragments.views;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.comunicacaofragments.R;
import com.example.comunicacaofragments.models.SistemaOperacional;

import static com.example.comunicacaofragments.views.MainActivity.SO_KEY;


/**
 * A simple {@link Fragment} subclass.
 */
public class SegundoFragment extends Fragment {

    private ImageView imagem;
    private TextView textNome;

    public SegundoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_segundo, container, false);

        initView(view);

        if(!getArguments().isEmpty()){

            SistemaOperacional sistemaOperacional = getArguments().getParcelable(SO_KEY);

            if(sistemaOperacional != null){
                Drawable drawable = getResources().getDrawable(sistemaOperacional.getImagem());

                imagem.setImageDrawable(drawable);
                textNome.setText(sistemaOperacional.getNome());
            }
        }

        return view;
    }

    public void initView(View view){
        imagem = view.findViewById(R.id.imgAndroid);
        textNome = view.findViewById(R.id.textViewNomeAndroid);
    }

}
