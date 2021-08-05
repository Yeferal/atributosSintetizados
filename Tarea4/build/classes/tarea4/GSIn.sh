#!/bin/bash

nameFileCup='Sintactico.cup';
nameFileSimbols='Simbolos';
nameFileBack='AnalizadorSintactico';

dirCup='/home/yeferal/Documentos/Compi/java-cup-11a.jar'
comandJava='java -jar'
PARSER='-parser'
SYMBOLS='-symbols'
echo "$comandJava $dirCup $PARSER $nameFileBack $SYMBOLS $nameFileSimbols $nameFileCup"
$comandJava $dirCup $PARSER $nameFileBack $SYMBOLS $nameFileSimbols $nameFileCup


#MANERA #2
#nameFileCup='Sintactico.cup';
#nameFileSimbols='Simbolos';
#nameFileBack='AnalizadorSintactico';
#echo 'cup -parser '$nameFileBack' -symbols '$nameFileSimbols $nameFile;
#cup -parser $nameFileBack -symbols $nameFileSimbols $nameFileCup

