package br.com.iagosaito.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class TesteArrayList {

    public static void main(String[] args) {
        ArrayList<String> jogadores = new ArrayList<>();

        jogadores.add("Messi");
        jogadores.add("Neymar");
        jogadores.add("Cr7");

        jogadores.remove(0);
        jogadores.remove("Neymar");

        System.out.println(jogadores);

        jogadores.add("Messi");
        jogadores.add("Neymar");

        System.out.println(jogadores);

        final Iterator<String> iterator = jogadores.iterator();

        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        System.out.println(jogadores);
    }
}
