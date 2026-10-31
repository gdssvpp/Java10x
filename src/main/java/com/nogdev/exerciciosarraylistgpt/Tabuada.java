package com.nogdev.exerciciosarraylistgpt;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        //Crie um programa que solicite ao usuário um número e apresente a tabuada dele, de 1 até 10.
        //Exemplo: se o usuário digitar 5, deverá apresentar as multiplicações de 5 × 1 até 5 × 10.
        //Objetivo: utilizar Scanner, for e operações matemáticas.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha seu número: ");
        int numeroUsuario = scanner.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(numeroUsuario + " x " + i + " = " + numeroUsuario * i ); // 1° PARAR DE DIFICULTAR COISA QUERENDO COLOCAR 2 FOR UM DENTRO DO OUTRO
        }
    }
}
