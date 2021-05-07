package br.com.iagosaito.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class TesteLambda {

    public static void main(String[] args) {
        List<String> jogadores = new ArrayList<>();

        jogadores.add("Ronaldo");
        jogadores.add("Amoroso");
        jogadores.add("Zico");
        jogadores.add("Pelé");

        System.out.println(jogadores);

//        jogadores.sort(new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return Integer.compare(s1.length(), s2.length());
//            }
//        });

        jogadores.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println(jogadores);
    }
}
