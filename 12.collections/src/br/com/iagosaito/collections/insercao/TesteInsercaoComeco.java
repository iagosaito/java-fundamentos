package br.com.iagosaito.collections.insercao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteInsercaoComeco {

    private static final int NUMBER_OF_ELEMENTS = 1_000_000;
    private static final String RANDOM_STRING = "Random String";

    public static void main(String[] args) {

        final List<String> arrayList = new ArrayList<>();
        final List<String> linkedList = new LinkedList<>();

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            String str = RANDOM_STRING + i;
            arrayList.add(str);
            linkedList.add(str);
        }

        long ini = System.nanoTime();

        arrayList.add(0, RANDOM_STRING);

        long fim = System.nanoTime();

        System.out.println("Tempo Array List: " + (fim - ini));

        ini = System.nanoTime();

        arrayList.add(0, RANDOM_STRING);

        fim = System.nanoTime();

        System.out.println("Tempo Linked List: " + (fim - ini));
    }

}
