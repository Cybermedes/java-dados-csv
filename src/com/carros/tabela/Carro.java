package com.carros.tabela;

public class Carro {

    public final String fabricante;
    public final String modelo;
    public final Integer ano;
    public final String cor;
    public final String condicoes;

    public Carro(String fabricante, String modelo, Integer ano, String cor, String condicoes) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.condicoes = condicoes;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public String getCondicoes() {
        return condicoes;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                ", condicoes='" + condicoes + '\'' +
                '}';
    }
}