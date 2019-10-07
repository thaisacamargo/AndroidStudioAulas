package com.example.primeiroentregavelandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.primeiroentregavelandroid.R;
import com.example.primeiroentregavelandroid.model.ModelRestauranteHome;

import java.util.List;

public class HomeAdapter  extends RecyclerView.Adapter<HomeAdapter.ViewHolderHome> {

    private List<ModelRestauranteHome> restaurantes;

    public HomeAdapter(List<ModelRestauranteHome> restaurantes) {
        this.restaurantes = restaurantes;
    }

    @NonNull
    @Override
    public ViewHolderHome onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_home, viewGroup, false);
        return new ViewHolderHome(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderHome viewHolderRestaurante, int i) {
        ModelRestauranteHome restaurante = restaurantes.get(i);

        viewHolderRestaurante.bind(restaurante);

    }

    @Override
    public int getItemCount() {
        return restaurantes.size();
    }

    public class ViewHolderHome extends RecyclerView.ViewHolder {
        ImageView imgRestaurante;
        TextView txtNomeRestaurante;
        TextView txtEnderecoRestaurante;
        TextView txtHorariosFuncionamento;

        public ViewHolderHome(@NonNull View itemView) {
            super(itemView);

            txtNomeRestaurante = itemView.findViewById(R.id.txt_nome_restaurante_home);
            txtEnderecoRestaurante = itemView.findViewById(R.id.txt_endereco_restaurante);
            txtHorariosFuncionamento = itemView.findViewById(R.id.txt_hrarios_funcionamento);
            imgRestaurante = itemView.findViewById(R.id.img_restaurante_home);
        }


        public void bind(ModelRestauranteHome restauranteHome){
            txtNomeRestaurante.setText(restauranteHome.getTxtNomeRestaurante());
            txtEnderecoRestaurante.setText(restauranteHome.getTxtEnderecoRestaurante());
            txtHorariosFuncionamento.setText(restauranteHome.getTxtHorariosFuncionamento());
           // imgRestaurante.setImageDrawable(restauranteHome.getImgRestaurante());
        }


    }
}
