package com.example.primeiroentregavelandroid.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.primeiroentregavelandroid.R;
import com.example.primeiroentregavelandroid.interfaces.RecyclerClickHome;
import com.example.primeiroentregavelandroid.model.ModelRestauranteHome;

import java.util.List;

public class HomeAdapter  extends RecyclerView.Adapter<HomeAdapter.ViewHolderHome> {

    private List<ModelRestauranteHome> restaurantes;
    private RecyclerClickHome recyclerClick;

    public HomeAdapter(List<ModelRestauranteHome> restaurantes, RecyclerClickHome recyclerClick) {
        this.restaurantes = restaurantes;
        this.recyclerClick = recyclerClick;
    }

    @NonNull
    @Override
    public ViewHolderHome onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_home, viewGroup, false);
        return new ViewHolderHome(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderHome viewHolderHome, int i) {
        final ModelRestauranteHome restaurante = restaurantes.get(i);

        viewHolderHome.bind(restaurante);

        viewHolderHome.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerClick.onclick(restaurante);
            }
        });

    }

    @Override
    public int getItemCount() {
        return restaurantes.size();
    }

    public class ViewHolderHome extends RecyclerView.ViewHolder {
        private ImageView imgRestaurante;
        private  TextView txtNomeRestaurante;
        private TextView txtEnderecoRestaurante;
        private TextView txtHorariosFuncionamento;

        public ViewHolderHome(@NonNull View itemView) {
            super(itemView);

            txtNomeRestaurante = itemView.findViewById(R.id.txt_nome_restaurante_home);
            txtEnderecoRestaurante = itemView.findViewById(R.id.txt_endereco_restaurante);
            txtHorariosFuncionamento = itemView.findViewById(R.id.txt_hrarios_funcionamento);
            imgRestaurante = itemView.findViewById(R.id.img_restaurante_home);
        }


        public void bind(ModelRestauranteHome restauranteHome){
            Drawable drawable = itemView.getResources().getDrawable(restauranteHome.getImgRestaurante());
            txtNomeRestaurante.setText(restauranteHome.getTxtNomeRestaurante());
            txtEnderecoRestaurante.setText(restauranteHome.getTxtEnderecoRestaurante());
            txtHorariosFuncionamento.setText(restauranteHome.getTxtHorariosFuncionamento());
            imgRestaurante.setImageDrawable(drawable);
        }


    }
}
