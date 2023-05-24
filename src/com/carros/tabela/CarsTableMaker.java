package com.carros.tabela;

import java.io.File;

public class CarsTableMaker {

    /*
    Metodo para checar se a tabela carros.csv já existe;
    caso negativo, criar um novo
     */
    public static void criarTabela() {
        System.out.println("Tabela carros.csv");

        String tabelaNome = "carros.csv";
        File tabela = new File(tabelaNome);
    }

    /*
    Metodo para popular a tabela carros.csv com dados aleatórios
     */
    public static void preencherTabela() {
        int ano, modeloVar, corVar, statusVar;
    }
}
