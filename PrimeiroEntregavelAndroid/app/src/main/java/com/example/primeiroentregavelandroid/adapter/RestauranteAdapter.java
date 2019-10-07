package com.example.primeiroentregavelandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.primeiroentregavelandroid.R;
import com.example.primeiroentregavelandroid.model.ModelRestauranteDetalhado;
import com.example.primeiroentregavelandroid.model.ModelRestauranteHome;

import java.util.List;

public class RestauranteAdapter extends RecyclerView.Adapter<RestauranteAdapter.ViewHolderRestaurante> {

    private List<ModelRestauranteDetalhado> pratos;

    public RestauranteAdapter(List<ModelRestauranteDetalhado> pratos) {
        this.pratos = pratos;
    }

    @NonNull
    @Override
    public RestauranteAdapter.ViewHolderRestaurante onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_restaurante, viewGroup, false);
        return new RestauranteAdapter.ViewHolderRestaurante(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestauranteAdapter.ViewHolderRestaurante viewHolderRestaurante, int i) {
        ModelRestauranteDetalhado prato = pratos.get(i);

        viewHolderRestaurante.bind(prato);

    }

    @Override
    public int getItemCount() {
        return pratos.size();
    }

    public class ViewHolderRestaurante extends RecyclerView.ViewHolder {
        ImageView imgPrato;
        TextView txtNomePrato;

        public ViewHolderRestaurante(@NonNull View itemView) {
            super(itemView);

            txtNomePrato = itemView.findViewById(R.id.txt_nome_prato);
            imgPrato = itemView.findViewById(R.id.img_prato);
        }


        public void bind(ModelRestauranteDetalhado restaurante){
            txtNomePrato.setText(restaurante.getNomePRato());
           // imgPrato.setImageDrawable(restaurante.getImgPrato());

        }


    }
}
