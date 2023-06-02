package com.carros.tabela;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        CarsTableMaker tabelaCarros = new CarsTableMaker();
        tabelaCarros.criarTabela();

        //Imrpime todos os objetos
        List<String> lines = TextLoader.getLines("carros.csv");
        List<Carro> veiculos = lines.stream()
                .map(CarroRecordUtil::parseCarro)
                .toList();

        System.out.println("=================================================================");
        veiculos.forEach(System.out::println);

        //Imprime número total de veículos
        System.out.println("=================================================================");
        int total = veiculos.size();
        System.out.println("Numero de veiculos: " + total);
    }
}
