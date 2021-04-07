package br.com.iagosaito.collections.insercao;

import java.util.*;

public class TesteInsercaoFim {


    private static final String RANDOM_STR = "Random";
    private static final int NUMBER_OF_ELEMENTS = 1000000;

    public static void main(String[] args) {

        final List<String> arrayList = new ArrayList<>();
        final List<String> linkedList = new LinkedList<>();
        final Set<String> hashset = new HashSet<>();
        final Set<String> linkedHashSet = new LinkedHashSet<>();
        final Set<String> treeSet = new TreeSet<>();

        long ini = System.currentTimeMillis();

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            String str = RANDOM_STR + i;
            arrayList.add(str);
        }

        long fim = System.currentTimeMillis();
        System.out.println("Tempo Array List: " + (fim - ini));

        ini = System.currentTimeMillis();

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            String str = RANDOM_STR + i;
            linkedList.add(str);
        }

        fim = System.currentTimeMillis();
        System.out.println("Tempo Linked List: " + (fim - ini));

        ini = System.currentTimeMillis();

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            String str = RANDOM_STR + i;
            hashset.add(str);
        }

        fim = System.currentTimeMillis();
        System.out.println("Tempo Hash Set: " + (fim - ini));

        ini = System.currentTimeMillis();

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            String str = RANDOM_STR + i;
            linkedHashSet.add(str);
        }

        fim = System.currentTimeMillis();
        System.out.println("Tempo Linked Hash Set: " + (fim - ini));

        ini = System.currentTimeMillis();

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            String str = RANDOM_STR + i;
            treeSet.add(str);
        }

        fim = System.currentTimeMillis();
        System.out.println("Tempo Tree Set: " + (fim - ini));
    }

}
