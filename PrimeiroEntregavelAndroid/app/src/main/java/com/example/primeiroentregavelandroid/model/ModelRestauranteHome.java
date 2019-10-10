package com.example.primeiroentregavelandroid.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;

public class ModelRestauranteHome implements Parcelable {

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

    protected ModelRestauranteHome(Parcel in) {
        imgRestaurante = in.readInt();
        txtNomeRestaurante = in.readString();
        txtEnderecoRestaurante = in.readString();
        txtHorariosFuncionamento = in.readString();
    }

    public static final Creator<ModelRestauranteHome> CREATOR = new Creator<ModelRestauranteHome>() {
        @Override
        public ModelRestauranteHome createFromParcel(Parcel in) {
            return new ModelRestauranteHome(in);
        }

        @Override
        public ModelRestauranteHome[] newArray(int size) {
            return new ModelRestauranteHome[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imgRestaurante);
        dest.writeString(txtNomeRestaurante);
        dest.writeString(txtEnderecoRestaurante);
        dest.writeString(txtHorariosFuncionamento);
    }
}
