package br.com.iagosaito.generics.bounded_type_parameters;

import java.util.Arrays;

public class ComparadorDeElementos {

    /*
        // Código não compila, pois n é possível comparar com > um tipo E
        public static <E> boolean contaMaioresQue(E[] arrayElementos, E elemento) {
            return Arrays.stream(arrayElementos).anyMatch(e -> e > elemento);
        }
     */

    public static <E extends Comparable<E>> boolean contaMaioresQue(E[] arrayElementos, E elemento) {
        return Arrays.stream(arrayElementos).anyMatch(e -> e.compareTo(elemento) > 0);
    }

}
