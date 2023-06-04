package com.carros.tabela;

public record Carro (String fabricante, String modelo, Integer ano, String cor, String condicoes) {

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