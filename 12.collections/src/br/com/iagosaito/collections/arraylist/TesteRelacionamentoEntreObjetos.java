package br.com.iagosaito.collections.arraylist;

public class TesteRelacionamentoEntreObjetos {

    public static void main(String[] args) {

        Clube clube = new Clube("Arsenal");

        clube.adiciona(new Jogador("Auba", 31));

        System.out.println(clube.getJogadores());
    }
}
