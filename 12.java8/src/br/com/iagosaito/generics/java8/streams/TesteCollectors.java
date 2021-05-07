package br.com.iagosaito.generics.java8.streams;

import java.util.*;
import java.util.stream.Collectors;

class Ator {

    public Ator(String nome, int premiacoes) {
        this.nome = nome;
        this.premiacoes = premiacoes;
    }

    private String nome;
    private int premiacoes;

    public String getNome() {
        return nome;
    }

    public int getPremiacoes() {
        return premiacoes;
    }

    @Override
    public String toString() {
        return nome + " - " + premiacoes;
    }
}

public class TesteCollectors {

    public static void main(String[] args) {

        List<Ator> atores = new ArrayList<>();

        atores.add(new Ator("Leonardo Di Caprio", 12));
        atores.add(new Ator("Robert Downey Jr", 24));
        atores.add(new Ator("Will Smith", 10));
        atores.add(new Ator("Lázaro Ramos", 3));
        atores.add(new Ator("Seu Jorge", 7));

        final List<Ator> atoresPremiadosList = atores.stream()
                .filter(ator -> ator.getPremiacoes() > 0)
                .collect(Collectors.toList());

        final Set<Ator> atoresPremiadosSet = atores.stream()
                .filter(ator -> ator.getPremiacoes() > 0)
                .collect(Collectors.toSet());

        final Map<String, Integer> atoresPremiadosMap = atores.stream()
                .filter(ator -> ator.getPremiacoes() > 0)
                .collect(Collectors.toMap(Ator::getNome, Ator::getPremiacoes));

        final LinkedList<Ator> collect = atores.stream()
                .filter(ator -> ator.getPremiacoes() > 0)
//                .collect(Collectors.toCollection(() -> new ArrayList<>()));
                .collect(Collectors.toCollection(LinkedList::new));

        final String atoresConcatenadosPorVirgula = atores.stream()
                .map(Ator::getNome)
                .collect(Collectors.joining(", "));

        System.out.println(atoresConcatenadosPorVirgula);

        final Integer numeroDeAtoresPremiados = atores.stream()
                .filter(ator -> ator.getPremiacoes() > 0)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        List::size
                ));

        System.out.println(numeroDeAtoresPremiados);

        // aceita valores do tipo Double como entrada
        final Double mediaAritmeticaAtoresDouble = atores.stream()
                .filter(ator -> ator.getPremiacoes() > 0)
                .collect(Collectors.averagingDouble(Ator::getPremiacoes));

        System.out.println(mediaAritmeticaAtoresDouble);

        // Aceita apenas valores do tipo int como entrada
        final Double mediaAritmeticaAtoresInt = atores.stream()
                .filter(ator -> ator.getPremiacoes() > 0)
                .collect(Collectors.averagingInt(Ator::getPremiacoes));

        System.out.println(mediaAritmeticaAtoresInt);
    }
}
