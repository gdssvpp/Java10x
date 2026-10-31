package com.nogdev.exerciciosarraylistgpt;

public class SomaDosNumeros {
    public static void main(String[] args) {
        //Crie um programa que some todos os números de 1 até 100 e apresente o resultado final.
        //Objetivo: trabalhar com acumuladores, uma lógica muito utilizada em programação.

        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i; // mesma coisa que soma = soma + 1
            System.out.println(soma);
        }
    }
}
