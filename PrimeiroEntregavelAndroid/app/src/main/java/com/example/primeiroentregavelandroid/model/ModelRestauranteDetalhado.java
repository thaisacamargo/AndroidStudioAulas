package com.example.primeiroentregavelandroid.model;


public class ModelRestauranteDetalhado {

    private int imgPrato;
    private String nomePRato;

    public ModelRestauranteDetalhado(int imgPrato, String nomePRato) {
        this.imgPrato = imgPrato;
        this.nomePRato = nomePRato;
    }

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
}
