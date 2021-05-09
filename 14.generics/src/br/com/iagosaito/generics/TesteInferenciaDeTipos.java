package br.com.iagosaito.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TesteInferenciaDeTipos {

    public static void main(String[] args) {
        Serializable s = pick("d", new ArrayList<String>());

        /*
            Java consegue inferir que o X representa um Integer e
            o T representa uma String.
         */
        MinhaClasse<Integer> classe = new MinhaClasse<>("a");
    }

    static <T> T pick(T a1, T a2) {
        return a2;
    }
}

class MinhaClasse<X> {

    <T> MinhaClasse(T t) {
        return;
    }

    void processStringList(List<String> stringList) {
        // process stringList
    }
}
