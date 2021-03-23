package br.com.iagosaito.ordenacao_de_listas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenacaoDeListas {

    public static void main(String[] args) {
        Jogador j1 = new Jogador("Messi", 10_000_000.00);
        Jogador j2 = new Jogador("Neymar", 5_000_000.00);
        Jogador j3 = new Jogador("Cristiano Ronaldo", 8_000_000.00);
        Jogador j4 = new Jogador("Zizao", 100000.00);

        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(j1);
        jogadores.add(j2);
        jogadores.add(j3);
        jogadores.add(j4);

        for (Jogador j : jogadores) {
            System.out.println(j);
        }

        System.out.println("----------------------");
        System.out.println("Ordenado por Valor de Mercado");
        ClasseComparadoraDeJogador comparadorPorvalor = new ClasseComparadoraDeJogador();

        jogadores.sort(comparadorPorvalor);

        for (Jogador j : jogadores) {
            System.out.println(j);
        }

        System.out.println("----------------------");
        System.out.println("Ordenado Inversamente por Valor de Mercado");

        jogadores.sort(comparadorPorvalor.reversed());

        for (Jogador j : jogadores) {
            System.out.println(j);
        }

        System.out.println("----------------------");
        System.out.println("Ordem Alfabética");
        jogadores.sort(new Comparator<Jogador>() {
            @Override
            public int compare(Jogador j1, Jogador j2) {
                return j1.getNome().compareTo(j2.getNome());
            }
        });

        for (Jogador j : jogadores) {
            System.out.println(j);
        }
    }
}

class ClasseComparadoraDeJogador implements Comparator<Jogador> {

    @Override
    public int compare(Jogador j1, Jogador j2) {

//        if (j1.getValorDeMercado() < j2.getValorDeMercado()) {
//            return -1;
//        }
//
//        if (j1.getValorDeMercado() > j2.getValorDeMercado()) {
//            return 1;
//        }
//
//        return 0;

        return Double.compare(j1.getValorDeMercado(), j2.getValorDeMercado());
    }
}
