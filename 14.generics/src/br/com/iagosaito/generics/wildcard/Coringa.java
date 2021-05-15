package br.com.iagosaito.generics.wildcard;

import java.util.List;

public class Coringa {

    // Coringas de Tipo Superior
    public static double somaDeListComCoringa(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }

    public static <T extends Number> double somaDeListComTypeParameter(List<T> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }

    // Coringas Ilimitados

    /*
        Não consegue imprimir List<Integer> ou List<String>, pq esses não são subtipos de List<Object>
     */
    public static void printList(List<Object> list) {
        list.forEach(System.out::println);
    }

    // Esse caso irá aceitar uma lista de qualquer tipo
    public static void printListGenerica(List<?> list) {
        System.out.println("Printando com lista genérica...");
        list.forEach(System.out::println);
    }

    public static <T> void printListTypeParameter(List<T> list) {
        System.out.println("Printando com Type Parameter...");
        list.forEach(System.out::println);
    }

    // Coringas de limite superior
    public static void printListDeNumerosOuSuperTipos(List<? super Number> list) {
        list.forEach(System.out::println);
    }

}
