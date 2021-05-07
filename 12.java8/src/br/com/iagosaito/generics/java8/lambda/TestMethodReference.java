package br.com.iagosaito.generics.java8.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestMethodReference {

    public static void main(String[] args) {

        List<String> jogadores = new ArrayList<>();

        jogadores.add("Ronaldo");
        jogadores.add("Amoroso");
        jogadores.add("Zico");
        jogadores.add("Pelé");

        jogadores.sort(Comparator.comparing(String::length));

        System.out.println(jogadores);

        jogadores.forEach(System.out::println);
    }
}