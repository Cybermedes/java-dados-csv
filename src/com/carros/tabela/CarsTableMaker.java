package com.carros.tabela;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

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
        String[] modelo = {"Strada", "Hb20", "Mobi", "Onix", "Gol",
                "Tracker", "Creta", "T-cross", "Compass", "Onix-plus",
                "Renegade", "Toro", "Pulse", "Kicks", "Corolla", "Hilux"};
        String[] cor = {"amarelo", "vermelho", "azul", "preto",
                "prata", "cinza", "bege", "verde"};
        String[] condicoes = {"novo", "usado"};

        try {
            Random random = new Random();
            FileWriter writer = new FileWriter(tabela);

            writer.write("Ano,Modelo,Cor,Condicoes\n");
            for (int i = 0; i < 100; i++) {
                ano = 2011 + random.nextInt(12);
                modeloVar = random.nextInt(17);
                corVar = random.nextInt(9);
                statusVar = random.nextInt(2);

                String fabricante = "";
                switch (modelo[modeloVar]) {
                    case "Strada", "Mobi", "Toro", "Pulse" -> fabricante = "Fiat";
                    case  "Hb20", "Creta" -> fabricante = "Hyundai";
                    case "Onix", "Tracker", "Onix-plus" -> fabricante = "Chevrolet";
                    case "Gol", "T-cross" -> fabricante = "Volkswagen";
                    case "Compass", "Renegade" -> fabricante = "Jeep";
                    case "Kicks" -> fabricante = "Nissa";
                    case "Corolla", "Hilux" -> fabricante = "Toyota";
                }

                String linha = fabricante + ","
                        + modelo[modeloVar] + ","
                        + ano + ","
                        + cor[corVar] + ","
                        + condicoes[statusVar];
                writer.append(linha).append("\n");
            }
            writer.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}