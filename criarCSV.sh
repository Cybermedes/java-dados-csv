#!/usr/bin/env bash

arquivo=carros.csv
if [[ -f "$arquivo" ]]; then
    echo "Arquivo $arquivo já existe"
else
    echo "Criando arquivo $arquivo"
    touch $arquivo
    echo "Ano,Modelo,Cor,Novo">$arquivo
fi

echo "Criando tabela"
for (( i = 1; i <= 30; i++ )); do
ano=$(( RANDOM % 20 + 2002))
modeloVar=$(( RANDOM % 6 ))
corVar=$(( RANDOM % 6 ))
statusVar=$(( RANDOM % 2 ))
echo "">>$arquivo
done