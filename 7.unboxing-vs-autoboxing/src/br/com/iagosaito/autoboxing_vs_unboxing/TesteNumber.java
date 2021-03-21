package br.com.iagosaito.autoboxing_vs_unboxing;

import java.util.ArrayList;
import java.util.List;

public class TesteNumber {

    /*
        A classe Number é a classe mãe de todos os Wrappers numéricos.

        No caso abaixo criamos uma lista que pode armazenar todos os tipos de números.
     */
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(10000000000L);
        numbers.add(29.90);
        numbers.add(22.90f);
    }
}
