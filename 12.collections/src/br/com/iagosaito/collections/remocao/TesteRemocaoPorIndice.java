package br.com.iagosaito.collections.remocao;

import java.util.*;

public class TesteRemocaoPorIndice {

    private static final String RANDOM_STR = "Random";
    private static final int NUMBER_OF_ELEMENTS = 1000000;

    public static void main(String[] args) {
        final List<String> arrayList = new ArrayList<>();
        final List<String> linkedList = new LinkedList<>();

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            String str = RANDOM_STR + i;
            arrayList.add(str);
            linkedList.add(str);
        }

        long ini = System.nanoTime();
        arrayList.remove(arrayList.size()-1);
        long fim = System.nanoTime();
        System.out.println("Tempo Array List (Último Elemento): " + (fim - ini));

        ini = System.nanoTime();
        linkedList.remove(linkedList.size()-1);
        fim = System.nanoTime();
        System.out.println("Tempo Linked List (Último Elemento): " + (fim - ini));

        ini = System.nanoTime();
        arrayList.remove(0);
        fim = System.nanoTime();
        System.out.println("Tempo Array List (Primeiro Elemento): " + (fim - ini));

        ini = System.nanoTime();
        linkedList.remove(0);
        fim = System.nanoTime();
        System.out.println("Tempo Linked List (Primeiro Elemento): " + (fim - ini));

        ini = System.nanoTime();
        arrayList.remove(NUMBER_OF_ELEMENTS/2);
        fim = System.nanoTime();
        System.out.println("Tempo Array List (Elemento do meio): " + (fim - ini));

        ini = System.nanoTime();
        linkedList.remove(NUMBER_OF_ELEMENTS/2);
        fim = System.nanoTime();
        System.out.println("Tempo Linked List (Elemento do meio): " + (fim - ini));


        final Iterator<String> iteratorArrayList = arrayList.iterator();
        ini = System.nanoTime();

        while (iteratorArrayList.hasNext()) {
            iteratorArrayList.next();
            iteratorArrayList.remove();
        }

        fim = System.nanoTime();
        System.out.println("Tempo Array List (Removendo 1/4 dos Elementos): " + (fim - ini));

        final Iterator<String> iteratorLinkedList = linkedList.iterator();
        ini = System.nanoTime();

        while (iteratorLinkedList.hasNext()) {
            iteratorLinkedList.next();
            iteratorLinkedList.remove();
        }

        fim = System.nanoTime();
        System.out.println("Tempo Array List (Removendo 1/4 dos Elementos): " + (fim - ini));

    }
}
