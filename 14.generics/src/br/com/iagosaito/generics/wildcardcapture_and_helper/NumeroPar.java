package br.com.iagosaito.generics.wildcardcapture_and_helper;

import java.util.Arrays;
import java.util.List;

public class NumeroPar extends NumeroNatural {

    public NumeroPar(int i) {
        super(i);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Teste {

    public static void main(String[] args) {

        List<NumeroPar> pares = Arrays.asList(new NumeroPar(2), new NumeroPar(4));
        List<? extends NumeroNatural> naturais = pares;

        helper(naturais, 2);
        naturais.forEach(System.out::println);
//        naturais.add(new NumeroPar(23)); Não compila! Não é possível definir o tipo do Array em tempo de execução
    }

    private static <T> void helper(List<T> numerosNaturais, int position) {
        numerosNaturais.set(position, numerosNaturais.get(0));
    }
}
