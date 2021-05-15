package br.com.iagosaito.generics.exercicios;

/*
    A classe a seguir será compilada? Se não, por quê?

    public final class Algoritmo {
        public static <T> T max (T x, T y) {
            return x> y? x: y;
        }
}
 */
public class Exercicio2 {

    // Não será compilada, pois não é possível comparar com > dois Type Parameters,
    // apenas para primitivos
}
