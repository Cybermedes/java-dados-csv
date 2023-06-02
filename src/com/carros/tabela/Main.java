package com.carros.tabela;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        //Filtra todos os carros que são da Nissan
        System.out.println("=================================================================");
        long numero = veiculos.stream().filter(carro -> carro.getFabricante().equals("Nissan"))
                .count();
        System.out.println("Numero de veiculos Nissan: " + numero);

        //Filtra todos os carros fabricados após 2018
        System.out.println("=================================================================");
        int ano = 2018;
        long novos = veiculos.stream().filter(carro -> carro.getAno() > ano)
                .count();
        System.out.println("Numero de veiculos fabricados antes de " + ano + ": " + novos);

        //Filtra todos os carros fabricados em e antes de 2018
        System.out.println("=================================================================");
        long velhos = veiculos.stream().filter(carro -> carro.getAno() <= ano)
                .count();
        System.out.println("Numero de veiculos fabricados antes de " + ano + ": " + velhos);

        //Imprime todos os fabricantes contidos na lista
        System.out.println("=================================================================");
        Set<String> fabricantesSet = new HashSet<>();
        for (Carro carros : veiculos) {
            String montadora = carros.getFabricante();
            fabricantesSet.add(montadora);
        }
        System.out.println("As montadoras na tabela:\n" + fabricantesSet);

        //Imprime todos as cores contidas na lista
        System.out.println("=================================================================");
        Set<String> coresSet = new HashSet<>();
        for (Carro carros : veiculos) {
            String pintura = carros.getCor();
            coresSet.add(pintura);
        }
        System.out.println("As montadoras na tabela:\n" + coresSet);
    }
}
