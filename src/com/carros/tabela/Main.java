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
                .map((line) -> CarroRecordUtil.parseCarro(line))
                .collect(Collectors.toList());

        veiculos.forEach((veiculo) -> System.out.println(veiculo));
    }
}
