package br.com.iagosaito.generics.exercicios;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
    Escreva um método genérico para contar o número de elementos em uma coleção que tem uma propriedade específica
    (por exemplo, números inteiros ímpares, números primos, palíndromos).
 */
public class Exercicio1 {

    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(1, 2, 3, 4, 5);
        final int contador = contador(inteiros, integer -> integer % 2 == 0);

        System.out.println(contador);
    }

    private static <E extends Number> int contador(Collection<E> collection, Predicate<E> predicate) {
        return collection
                .stream()
                .filter(predicate)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        List::size
                ));
    }
}
