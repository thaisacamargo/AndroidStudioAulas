package com.example.recyclerinicial.Adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerinicial.Model.Aluno;
import com.example.recyclerinicial.R;

import java.util.ArrayList;
import java.util.List;

public class AlunoAdapter extends RecyclerView.Adapter<AlunoAdapter.ViewHolder> {
    
    private List listaAlunos = new ArrayList();
    

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        
    }

    @Override
    public int getItemCount() {
        return listaAlunos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nome;
        private TextView RA;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.textViewNome);
            RA = itemView.findViewById(R.id.textViewTelefone);
        }

        public void OnBind (Aluno aluno){
            nome.setText(aluno.getNome());
            RA.setText(aluno.getRA());

        }
    }
}
