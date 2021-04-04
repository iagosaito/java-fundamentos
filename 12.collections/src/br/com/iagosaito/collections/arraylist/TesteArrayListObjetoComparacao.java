package br.com.iagosaito.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteArrayListObjetoComparacao {

    public static void main(String[] args) {

        final ArrayList<Jogador> jogadores = new ArrayList<>();

        jogadores.add(new Jogador("Messi", 34));
        jogadores.add(new Jogador("Cr7", 36));
        jogadores.add(new Jogador("Neymar", 30));
        jogadores.add(new Jogador("Alaba", 29));
        jogadores.add(new Jogador("Mbappe", 23));

        jogadores.sort(Comparator.comparing(Jogador::getNome));

        System.out.println(jogadores);

        // Ordenação natural definida na classe pelo método compareTo();
        Collections.sort(jogadores);

        System.out.println(jogadores);

        jogadores.sort(new Comparator<Jogador>() {
            @Override
            public int compare(Jogador o1, Jogador o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        System.out.println(jogadores);
    }
}
