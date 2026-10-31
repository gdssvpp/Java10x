package com.nogdev.exerciciosarraylistgpt;

public class NumerosPares {
    public static void main(String[] args) {
        // Crie um programa que imprima todos os números pares de 0 até 20.
        //Objetivo: praticar o for junto com o operador de módulo (%).

        for(int i = 0; i <= 20; i += 2){ // (i += 2) = incrementa de 2 em 2, nunca vai passar por um número ímpar
            System.out.println(i); // Basicamente = 0 + 2 = 2; 2 + 2 = 4; 4 + 2 = 6...
                                   // se o i começasse em 1, seria para números ímpares, 1 + 2 = 3; 3 + 2 = 5; 5 + 2 = 7...
        }

        /*
        * for(int i = 0; i <= 20; i++){
        *  if(i % 2 == 0){  → forma utilizando o (%) que foi solicitado
        *       sout(i)
        *   }
        * }
        * */

        // o chatgpt estava esperando um if no objetivo para trazer o i % 2 == 0 -> par
        // porém fazendo com i += 2 a gente tem o mesmo resultado economizando linha
        // basicamente
    }
}
