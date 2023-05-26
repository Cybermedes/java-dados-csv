package com.carros.tabela;

import java.io.File;
import java.io.IOException;

public class CarsTableMaker {

    /*
    Metodo para checar se a tabela carros.csv já existe;
    caso negativo, criar um novo
     */
    public static void criarTabela() {
        System.out.println("Tabela carros.csv");

        String tabelaNome = "carros.csv";
        File tabela = new File(tabelaNome);

        if (tabela.exists()) {
            System.out.println("Arquivo existe e está na pasta"
                    + tabela.getAbsolutePath());
        } else {
            System.out.println("Arquivo não existe. Criando um novo...");
            try {
                tabela.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            preencherTabela(tabela);
        }
    }

    /*
    Metodo para popular a tabela carros.csv com dados aleatórios
     */
    public static void preencherTabela(File tabela) {

        int ano, modeloVar, corVar, statusVar;
    }
}
