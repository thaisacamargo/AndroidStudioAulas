package com.example.primeiroentregavelandroid.model;

import android.widget.ImageView;
import android.widget.TextView;

public class ModelRestauranteHome {

    private int imgRestaurante;
    private String txtNomeRestaurante;
    private String txtEnderecoRestaurante;
    private String txtHorariosFuncionamento;


    public ModelRestauranteHome(int imgRestaurante, String txtNomeRestaurante, String txtEnderecoRestaurante, String txtHorariosFuncionamento) {
        this.imgRestaurante = imgRestaurante;
        this.txtNomeRestaurante = txtNomeRestaurante;
        this.txtEnderecoRestaurante = txtEnderecoRestaurante;
        this.txtHorariosFuncionamento = txtHorariosFuncionamento;
    }

    public int getImgRestaurante() {
        return imgRestaurante;
    }

    public void setImgRestaurante(int imgRestaurante) {
        this.imgRestaurante = imgRestaurante;
    }

    public String getTxtNomeRestaurante() {
        return txtNomeRestaurante;
    }

    public void setTxtNomeRestaurante(String txtNomeRestaurante) {
        this.txtNomeRestaurante = txtNomeRestaurante;
    }

    public String getTxtEnderecoRestaurante() {
        return txtEnderecoRestaurante;
    }

    public void setTxtEnderecoRestaurante(String txtEnderecoRestaurante) {
        this.txtEnderecoRestaurante = txtEnderecoRestaurante;
    }

    public String getTxtHorariosFuncionamento() {
        return txtHorariosFuncionamento;
    }

    public void setTxtHorariosFuncionamento(String txtHorariosFuncionamento) {
        this.txtHorariosFuncionamento = txtHorariosFuncionamento;
    }
}
