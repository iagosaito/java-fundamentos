package br.com.iagosaito.generics.exercicios;

import java.util.Arrays;

/*
    Escreva um método genérico para trocar as posições de dois elementos diferentes em uma matriz.
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Integer[] inteiros = new Integer[4];
        inteiros[0] = 0;
        inteiros[1] = 1;
        inteiros[2] = 2;
        inteiros[3] = 3;

        System.out.println(Arrays.toString(inteiros));

        troca(inteiros, 0, 3);

        System.out.println(Arrays.toString(inteiros));
    }

    private static <T> void troca(T[] matriz, int pos1, int pos2) {
        final T tpos1 = matriz[pos1];

        matriz[pos1] = matriz[pos2];
        matriz[pos2] = tpos1;
    }
}
