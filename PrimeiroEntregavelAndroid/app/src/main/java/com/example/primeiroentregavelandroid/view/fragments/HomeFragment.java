package com.example.primeiroentregavelandroid.view.fragments;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.primeiroentregavelandroid.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private static final String IMAGEM = "imagem";
    private static final String NOME = "nome";
    private static final String ENDERECO = "endereco";
    private static final String HORARIO = "horario";

    private ImageView imgRestaurante;
    private TextView txtNomeRestaurante;
    private TextView txtEnderecoRestaurante;
    private TextView txtHorariosFuncionamento;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static Fragment novaInstancia(int imagem, String nomeRestaurante, String enderecoRestaurante, String horarioFuncionamento){
        HomeFragment homeFragment = new HomeFragment();
        Bundle bundle = new Bundle();

        bundle.putInt(IMAGEM, imagem);
        bundle.putString(NOME, nomeRestaurante);
        bundle.putString(ENDERECO, enderecoRestaurante);
        bundle.putString(HORARIO, horarioFuncionamento);

        homeFragment.setArguments(bundle);

        return homeFragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        initViews(view);

        if(getArguments() != null){
            int imagemRecebida = getArguments().getInt(IMAGEM);
            String nomeRecebido = getArguments().getString(NOME);
            String enderecoRecebido = getArguments().getString(ENDERECO);
            String horarioRecebido = getArguments().getString(HORARIO);

            Drawable drawable = getResources().getDrawable(imagemRecebida);

            imgRestaurante.setImageDrawable(drawable);
            txtNomeRestaurante.setText(nomeRecebido);
            txtEnderecoRestaurante.setText(enderecoRecebido);
            txtHorariosFuncionamento.setText(horarioRecebido);

        }

        return view;
    }

    private void initViews(View view){
        txtNomeRestaurante = view.findViewById(R.id.txt_nome_restaurante_home);
        txtEnderecoRestaurante = view.findViewById(R.id.txt_endereco_restaurante);
        txtHorariosFuncionamento = view.findViewById(R.id.txt_hrarios_funcionamento);
        imgRestaurante = view.findViewById(R.id.img_restaurante_home);

    }

}
