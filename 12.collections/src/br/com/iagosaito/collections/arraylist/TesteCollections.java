package br.com.iagosaito.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCollections {

    public static void main(String[] args) {

        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Auba", 31));
        jogadores.add(new Jogador("Xhaka", 33));
        jogadores.add(new Jogador("Lacazette", 32));

        Collections.sort(jogadores);

        System.out.println(jogadores);

        Collections.reverse(jogadores);
        System.out.println(jogadores);

        Collections.shuffle(jogadores);
        System.out.println(jogadores);

        final List<Jogador> juanMata = Collections.singletonList(new Jogador("Juan Mata", 35));
        System.out.println(juanMata);

        final List<Jogador> henry = Collections.nCopies(100, new Jogador("Henry", 47));
        System.out.println(henry);
    }
}
