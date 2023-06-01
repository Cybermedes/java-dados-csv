#!/usr/bin/env bash

# Checa se o arquivo csv já existe e não cria um novo caso contrário
# Se o arquivo existir e o script rodar novamente, novos dados serão adicionados
arquivo=carros.csv
if [[ -f "$arquivo" ]]; then
    echo "Arquivo $arquivo já existe"
else
    echo "Criando arquivo $arquivo"
    touch $arquivo
    echo "Fabricante,Modelo,Ano,Cor,Condicoes">$arquivo
fi

# Declara as arrays que irão conter os dados que irão preencher as tabelas
declare -a modelos=("Strada" "Hb20" "Mobi" "Onix" "Gol"
        "Tracker" "Creta" "T-cross" "Compass" "Onix-plus"
        "Renegade" "Toro" "Pulse" "Kicks" "Corolla" "Hilux")
declare -a cores=("amarelo" "vermelho" "azul" "preto"
        "prata" "cinza" "bege" "verde")
declare -a status=("novo" "usado")

# Loop para criar linhas contendo dados aleatorios
echo "Criando tabela"
for (( i = 0; i < 100; i++ )); do
ano=$(( RANDOM % 12 + 2011))
modeloVar=$(( RANDOM % 6 ))
corVar=$(( RANDOM % 6 ))
statusVar=$(( RANDOM % 2 ))

echo "$ano,\
${modelos[$modeloVar]},\
${cores[$corVar]},\
${status[$statusVar]}">>$arquivo
done

# Mensagem para indicar que o script finalizou
echo "Tabela csv criada"
