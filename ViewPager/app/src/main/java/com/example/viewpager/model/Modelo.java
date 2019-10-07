package com.example.viewpager.model;

import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class Modelo {
    private ImageView imagem;
    private String nome;
    private Fragment fragment;

    public Modelo(String nome, ImageView imagem, Fragment fragment) {
        this.imagem = imagem;
        this.nome = nome;
        this.fragment = fragment;
    }

    public Modelo(String nome, Fragment fragment) {
        this.nome = nome;
        this.fragment = fragment;
    }

    public ImageView getImagem() {
        return imagem;
    }

    public void setImagem(ImageView imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }
}
