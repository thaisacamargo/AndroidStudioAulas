package com.example.primeiroentregavelandroid.model;


import android.os.Parcel;
import android.os.Parcelable;

public class ModelRestauranteDetalhado implements Parcelable {

    private int imgPrato;
    private String nomePRato;

    public ModelRestauranteDetalhado(int imgPrato, String nomePRato) {
        this.imgPrato = imgPrato;
        this.nomePRato = nomePRato;
    }

    protected ModelRestauranteDetalhado(Parcel in) {
        imgPrato = in.readInt();
        nomePRato = in.readString();
    }

    public static final Creator<ModelRestauranteDetalhado> CREATOR = new Creator<ModelRestauranteDetalhado>() {
        @Override
        public ModelRestauranteDetalhado createFromParcel(Parcel in) {
            return new ModelRestauranteDetalhado(in);
        }

        @Override
        public ModelRestauranteDetalhado[] newArray(int size) {
            return new ModelRestauranteDetalhado[size];
        }
    };

    public int getImgPrato() {
        return imgPrato;
    }

    public void setImgPrato(int imgPrato) {
        this.imgPrato = imgPrato;
    }

    public String getNomePRato() {
        return nomePRato;
    }

    public void setNomePRato(String nomePRato) {
        this.nomePRato = nomePRato;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imgPrato);
        dest.writeString(nomePRato);
    }
}
