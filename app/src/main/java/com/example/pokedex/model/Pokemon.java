package com.example.pokedex.model;

public class Pokemon {

    private String nome;
    private String tipo;
    private String descricao;
    private String imagem;

    public Pokemon(String nome, String tipo, String descricao, String imagem) {
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getImagem() {
        return imagem;
    }
}
