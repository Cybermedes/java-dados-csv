#!/usr/bin/env bash

arquivo=carros.csv
if [[ -f "$arquivo" ]]; then
    echo "Arquivo $arquivo já existe"
else
    echo "Criando arquivo $arquivo"
    touch $arquivo
    echo "Ano,Modelo,Cor,Novo">$arquivo
fi