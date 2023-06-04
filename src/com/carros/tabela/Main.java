package com.carros.tabela;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        CarsTableMaker carsTable = new CarsTableMaker();
        carsTable.criarTabela();

        //Imrpime todos os objetos
        List<String> lines = TextLoader.getLines("carros.csv");
        List<Carro> vehicles = lines.stream()
                .map(CarroRecordUtil::parseCarro)
                .toList();

        tableSeparator();
        vehicles.forEach(System.out::println);

        //Imprime número total de veículos
        tableSeparator();
        int total = vehicles.size();
        System.out.println("Numero de veiculos: " + total);

        //Filtra todos os carros que são da Nissan
        tableSeparator();
        long numberOfNissanVehicles = vehicles.stream().filter(carro -> carro.fabricante().equals("Nissan")).count();
        System.out.println("Numero de veiculos Nissan: " + numberOfNissanVehicles);

        //Filtra todos os carros fabricados após 2018
        tableSeparator();
        int ano = 2018;
        long vehiclesAfter2018 = vehicles.stream().filter(carro -> carro.ano() > ano).count();
        System.out.println("Numero de veiculos fabricados antes de " + ano + ": " + vehiclesAfter2018);

        //Filtra todos os carros fabricados em e antes de 2018
        tableSeparator();
        long vehiclesBefore2018 = vehicles.stream().filter(carro -> carro.ano() <= ano).count();
        System.out.println("Numero de veiculos fabricados antes de " + ano + ": " + vehiclesBefore2018);

        //Imprime todos os fabricantes contidos na lista
        tableSeparator();
        Set<String> manufacturers = vehicles.stream().map(Carro::fabricante).collect(Collectors.toSet());
        System.out.println("As montadoras na tabela:\n" + manufacturers);

        //Imprime todos as cores contidas na lista
        tableSeparator();
        Set<String> colors = vehicles.stream().map(Carro::cor).collect(Collectors.toSet());
        System.out.println("As montadoras na tabela:\n" + colors);
    }

    private static void tableSeparator() {
        System.out.println("=================================================================");
    }
}
