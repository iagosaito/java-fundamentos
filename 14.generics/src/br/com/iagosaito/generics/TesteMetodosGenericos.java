package br.com.iagosaito.generics;

import br.com.iagosaito.generics.metodos_genericos.Util;
import br.com.iagosaito.generics.multiple_type_parameters.OrderedPair;
import br.com.iagosaito.generics.multiple_type_parameters.Pair;

public class TesteMetodosGenericos {

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<>("a", 1);
        Pair<String, Integer> p2 = new OrderedPair<>("b", 2);

        System.out.println(Util.compare(p1, p2));
    }
}
