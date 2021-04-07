package br.com.iagosaito.collections.remocao;

import java.util.*;

public class TesteRemocaoPorObjeto {

    private static final String RANDOM_STR = "Random";
    private static final int NUMBER_OF_ELEMENTS = 1000000;
    private static final String RANDOM_TO_BE_DELETED = "Random" + (NUMBER_OF_ELEMENTS - 1);

    public static void main(String[] args) {

        final List<String> arrayList = new ArrayList<>();
        final List<String> linkedList = new LinkedList<>();
        final Set<String> hashset = new HashSet<>();
        final Set<String> linkedHashSet = new LinkedHashSet<>();
        final Set<String> treeSet = new TreeSet<>();

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            String str = RANDOM_STR + i;
            arrayList.add(str);
            linkedList.add(str);
            hashset.add(str);
            linkedHashSet.add(str);
            treeSet.add(str);
        }

        long ini = System.currentTimeMillis();
        arrayList.remove(RANDOM_TO_BE_DELETED);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo Array List: " + (fim - ini));

        ini = System.currentTimeMillis();
        linkedList.remove(RANDOM_TO_BE_DELETED);
        fim = System.currentTimeMillis();
        System.out.println("Tempo Linked List: " + (fim - ini));

        ini = System.currentTimeMillis();
        hashset.remove(RANDOM_TO_BE_DELETED);
        fim = System.currentTimeMillis();
        System.out.println("Tempo Hash Set: " + (fim - ini));

        ini = System.currentTimeMillis();
        linkedHashSet.remove(RANDOM_TO_BE_DELETED);
        fim = System.currentTimeMillis();
        System.out.println("Tempo Linked Hash Set: " + (fim - ini));

        ini = System.currentTimeMillis();
        treeSet.remove(RANDOM_TO_BE_DELETED);
        fim = System.currentTimeMillis();
        System.out.println("Tempo Tree Set: " + (fim - ini));
    }

}
