package com.nogdev.java10x;

public class ArrayList {
    public static void main(String[] args) {
        String[] ninja = new String[3];

        int numeroMaximoClones = 40;
        int quantidadeClones = 1;
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";

        //System.out.println(ninja[1]); --> Mostra apenas 1 ninja, sendo escolhido via índice

        while(quantidadeClones <= numeroMaximoClones){
            //quantidadeClones++; aqui aparesenta um comportamento "estranho"/diferente do for
            System.out.println("Naruto fez " + quantidadeClones + " clones.");
            quantidadeClones++; // esse aqui faz mais sentido.
        }

        /*for (int quantidadeClones= 1; quantidadeClones <= numeroMaximoClones; quantidadeClones++) { // for convencional e é isso
            System.out.println("Naruto fez " + quantidadeClones + " clones.");
        }*/
    }

    /*
    * eu tava moscando quando vi que tava com condições diferentes no while e no for
    * o negócio é onde eu tava colocando o "quantidadeClones++;" a ordem onde ele é colocado faz total diferença
    * Resumindo:
        - while: coloquei o incremento antes do println, então imprime a partir de 1.
        - for: o incremento acontece depois do bloco de código, então imprime a partir de 0.
    *  */
}
