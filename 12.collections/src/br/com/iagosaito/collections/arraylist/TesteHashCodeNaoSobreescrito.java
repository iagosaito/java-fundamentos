package br.com.iagosaito.collections.arraylist;

public class TesteHashCodeNaoSobreescrito {

    public static void main(String[] args) {

        final Jogador j1 = new Jogador("Iago", 200);
        final Jogador j2 = new Jogador("Iago", 200);

        // Os HashCodes são diferentes para cada objeto
        System.out.println(j1.hashCode());
        System.out.println(j2.hashCode());
    }
}
