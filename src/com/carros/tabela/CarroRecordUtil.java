package com.carros.tabela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarroRecordUtil {
    public static Carro parseCarro(String dataString) {
        List<String> campos = new ArrayList<>(Arrays.asList(dataString.split(",")));

        try {
            String fabricante = campos.get(0);
            String modelo = campos.get(1).trim();
            Integer ano = Integer.parseInt(campos.get(2).trim());
            String cor = campos.get(3).trim();
            String condicoes = campos.get(4).trim();

            return new Carro(fabricante, modelo, ano, cor, condicoes);
        } catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }
}