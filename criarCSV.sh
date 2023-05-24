#!/usr/bin/env bash

arquivo=carros.csv
if [[ -f "$arquivo" ]]; then
    echo "Arquivo $arquivo já existe"
else
    echo "Criando arquivo $arquivo"
    touch $arquivo
    echo "Ano,Modelo,Cor,Novo">$arquivo
fi

declare -a modelos=()
declare -a cores=("amarelo" "vermelho" "azul" "preto" \
"prata" "branco")
declare -a status=("novo" "usado")

echo "Criando tabela"
for (( i = 1; i <= 50; i++ )); do
ano=$(( RANDOM % 12 + 2011))
modeloVar=$(( RANDOM % 6 ))
corVar=$(( RANDOM % 6 ))
statusVar=$(( RANDOM % 2 ))
echo "">>$arquivo
done

echo "Tabela csv criada"