package br.com.iagosaito.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Jogador {

    public Jogador(String nome, int golsNaCarreira) {
        this.nome = nome;
        this.golsNaCarreira = golsNaCarreira;
    }

    private String nome;
    private int golsNaCarreira;

    public String getNome() {
        return nome;
    }

    public int getGolsNaCarreira() {
        return golsNaCarreira;
    }
}

public class TesteStream {

    public static void main(String[] args) {
        List<Jogador> jogadores = new ArrayList<>();

        jogadores.add(new Jogador("Ronaldo", 400));
        jogadores.add(new Jogador("Pelé", 1050));
        jogadores.add(new Jogador("Zico", 800));
        jogadores.add(new Jogador("Romário", 1007));

        final List<Character> primeiraLetra = jogadores.stream()
                .map(j -> j.getNome().charAt(0))
                .collect(Collectors.toList());

        System.out.println(primeiraLetra);

        final Map<String, Integer> jogadoresMap = jogadores.stream()
                .filter(j -> j.getNome().startsWith("R"))
                .collect(Collectors.toMap(Jogador::getNome, Jogador::getGolsNaCarreira));

        System.out.println(jogadoresMap);

        final long count = jogadores.stream()
                .mapToInt(Jogador::getGolsNaCarreira)
                .count();

        System.out.println(count);

        jogadores.stream()
                .mapToInt(Jogador::getGolsNaCarreira)
                .average()
                .ifPresent(System.out::println);
    }



}
