package br.com.iagosaito.javaio;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteCurrentTimeMillis {

    public static void main(String[] args) throws FileNotFoundException {

        long ini = System.currentTimeMillis();
        List<Integer> integersArrayList = new ArrayList<>();
        List<Integer> integersLinkedList = new LinkedList<>();

        for (int i = 0; i < 300000; i++) {
            integersArrayList.add(0, i);
        }

        long fim = System.currentTimeMillis();

        System.out.println(String.format("Tempo final com ArrayList: %d", (fim - ini) ));


        ini = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            integersLinkedList.add(0, i);
        }

        fim = System.currentTimeMillis();

        System.out.println(String.format("Tempo final com ArrayList: %d", (fim - ini) ));

        ini = System.currentTimeMillis();

        PrintStream printStream = new PrintStream("lorem2.txt");
        printStream.print("Escrevendo caracteres em um arquivo");
        printStream.println();
        printStream.println();
        printStream.print("Escrevendo mais caracteres");

        printStream.close();

        fim = System.currentTimeMillis();

        System.out.println(String.format("Tempo final de escrita de um arquivo: %d", (fim - ini) ));
    }
}
