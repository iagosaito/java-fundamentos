package br.com.iagosaito.generics.ordenacao_de_listas.ordem_natural;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteOrdenacaoOrdemNatural {

    public static void main(String[] args) {

        Clube c1 = new Clube("Barcelona", 200);
        Clube c2 = new Clube("Flamengo", 120);
        Clube c3 = new Clube("Bragatinho", 34);

        List<Clube> clubes = new ArrayList<>();
        clubes.add(c1);
        clubes.add(c2);
        clubes.add(c3);

        // Utiliza o método de ordenação natural definida na classe Clube
        Collections.sort(clubes);

        for (Clube clube : clubes) {
            System.out.println(clube);
        }

        System.out.println("--------------------");
        System.out.println("Bagunçando a lista...");

        Collections.shuffle(clubes);

        for (Clube clube : clubes) {
            System.out.println(clube);
        }

        System.out.println("--------------------");
        System.out.println("Reordenando...");

        // Ao utilizar o método dentro da Lista, passe null para obter a ordem natural
        clubes.sort(null);

        for (Clube clube : clubes) {
            System.out.println(clube);
        }

        System.out.println("--------------------");
        System.out.println("Rotacionando...");

        Collections.rotate(clubes, 1);
        for (Clube clube : clubes) {
            System.out.println(clube);
        }
    }
}
