package com.carros.tabela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarroUtilList {

    private static final int INDEX_FABRICANTE = 0;
    private static final int INDEX_MODELO = 1;
    private static final int INDEX_ANO = 2;
    private static final int INDEX_COR = 3;
    private static final int INDEX_CONDICOES = 4;

    public static Carro parseCarro(String dataString) {
        List<String> campos = new ArrayList<>(Arrays.asList(dataString.split(",")));

        try {
            String fabricante = campos.get(INDEX_FABRICANTE);
            String modelo = campos.get(INDEX_MODELO).trim();
            Integer ano = Integer.parseInt(campos.get(INDEX_ANO).trim());
            String cor = campos.get(INDEX_COR).trim();
            String condicoes = campos.get(INDEX_CONDICOES).trim();

            return new Carro(fabricante, modelo, ano, cor, condicoes);
        } catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }
}