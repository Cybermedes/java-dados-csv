package com.carros.tabela;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class LeitorDeTexto {
    public static List<String> lerLinhas(String nomeArquivo) {

        List<String> linhas = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                linhas.add(linha);
            }
        } catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return linhas;
    }
}