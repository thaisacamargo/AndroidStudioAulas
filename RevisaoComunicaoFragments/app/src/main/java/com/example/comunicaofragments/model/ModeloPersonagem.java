package com.example.comunicaofragments.model;

import android.os.Parcel;
import android.os.Parcelable;


public class ModeloPersonagem implements Parcelable {

        private int imagem;
        private String nome;

        //Construtor especifico
        public ModeloPersonagem(int imagem, String nome) {
            this.imagem = imagem;
            this.nome = nome;
        }

        //Construtor padrão
        public ModeloPersonagem() {

        }

        protected ModeloPersonagem(Parcel in) {
            imagem = in.readInt();
            nome = in.readString();
        }

        public static final Creator<ModeloPersonagem> CREATOR = new Creator<ModeloPersonagem>() {
            @Override
            public ModeloPersonagem createFromParcel(Parcel in) {
                return new ModeloPersonagem(in);
            }

            @Override
            public ModeloPersonagem[] newArray(int size) {
                return new ModeloPersonagem[size];
            }
        };

        public int getImagem() {
            return imagem;
        }

        public void setImagem(int imagem) {
            this.imagem = imagem;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(imagem);
            parcel.writeString(nome);
        }
}
