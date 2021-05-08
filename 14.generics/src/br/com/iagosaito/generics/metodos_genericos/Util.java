package br.com.iagosaito.generics.metodos_genericos;

import br.com.iagosaito.generics.multiple_type_parameters.Pair;

public class Util {

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p2.getValue().equals(p2.getValue());
    }

}
