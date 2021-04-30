package br.com.iagosaito.java8.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteStream {

    public static void main(String[] args) {

        final List<Jogador> jogadores = new ArrayList<>();

        final Jogador romario = new Jogador("Romario", 1040, Arrays.asList("Mingau", "Basco"));
        final Jogador zico = new Jogador("Zico", 800, Arrays.asList("Mingau", "Udinese"));
        final Jogador adriano = new Jogador("Adriano", 240, Arrays.asList("Mingau", "Internazionale"));
        final Jogador amoroso = new Jogador("Amoroso", 330, Collections.singletonList("Cruzeiro"));
        final Jogador pele = new Jogador("Pele", 1100, Collections.singletonList("Santos"));

        jogadores.add(romario);
        jogadores.add(zico);
        jogadores.add(adriano);
        jogadores.add(amoroso);
        jogadores.add(pele);

        jogadores.forEach(jogador -> System.out.println(jogador.getNome()));

        final OptionalDouble avarage = jogadores.stream()
                .mapToInt(Jogador::getGols)
                .average();

        final int sum = jogadores.stream()
                .filter(jogador -> jogador.getNome().startsWith("A"))
                .mapToInt(Jogador::getGols)
                .sum();

        System.out.println(avarage.getAsDouble());
        System.out.println(sum);

        final List<Stream<String>> collect = jogadores.stream()
                .map(new Function<Jogador, Stream<String>>() {
                    @Override
                    public Stream<String> apply(Jogador jogador) {
                        return jogador.getClubes().stream();
                    }
        }).collect(Collectors.toList());

        final Set<String> clubes = jogadores.stream()
                .flatMap(new Function<Jogador, Stream<String>>() {
                    @Override
                    public Stream<String> apply(Jogador jogador) {
                        return jogador.getClubes().stream();
                    }
                })
                .collect(Collectors.toSet());

        System.out.println(clubes);
    }
}

class Jogador {

    public Jogador(String nome, Integer gols) {
        this.nome = nome;
        this.gols = gols;
    }

    public Jogador(String nome, Integer gols, List<String> clubes) {
        this.nome = nome;
        this.gols = gols;
        this.clubes = clubes;
    }

    private String nome;
    private Integer gols;
    private List<String> clubes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getGols() {
        return gols;
    }

    public void setGols(Integer gols) {
        this.gols = gols;
    }

    public List<String> getClubes() {
        return Collections.unmodifiableList(clubes);
    }

    public void adicionar(final String clube) {
        clubes.add(clube);
    }
}
