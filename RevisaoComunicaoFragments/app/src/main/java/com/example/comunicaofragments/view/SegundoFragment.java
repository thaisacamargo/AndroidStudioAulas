package com.example.comunicaofragments.view;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.comunicaofragments.R;
import com.example.comunicaofragments.model.ModeloPersonagem;

import static com.example.comunicaofragments.view.MainActivity.SO_KEY;

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
        View view  = inflater.inflate(R.layout.fragment_segundo, container, false);

        initView(view);

        if(!getArguments().isEmpty()){

            ModeloPersonagem modeloPersonagem = getArguments().getParcelable(SO_KEY);

            if(modeloPersonagem != null){
                Drawable drawable = getResources().getDrawable(modeloPersonagem.getImagem());

                imagem.setImageDrawable(drawable);
                textNome.setText(modeloPersonagem.getNome());
            }
        }

        return view;
    }

    public void initView(View view){
        imagem = view.findViewById(R.id.imgPersonagem);
        textNome = view.findViewById(R.id.textViewNomePersonagem);
    }

}
