package br.com.iagosaito.generics;

import br.com.iagosaito.generics.multiple_type_parameters.OrderedPair;
import br.com.iagosaito.generics.multiple_type_parameters.Pair;

public class TesteGenerics {

    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<>();

        Pair<String, Integer> pair = new OrderedPair<>("iago", 100);
        Pair<String, Box<Integer>> pairParameterizedType = new OrderedPair<>("batata", new Box<>());

    }
}
