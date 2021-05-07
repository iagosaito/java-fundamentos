package br.com.iagosaito.array;

public class TestArrayReferencia {

    /*
        No exemplo abaixo temos um Array de Objetos, não de tipos primitivos.
        Sendo assim, cada posição do Array representa uma referência que aponta para um objeto no heap
     */
    public static void main(String[] args) {

        Clube[] clubes = new Clube[4];
        final Clube c1 = new Clube("Barcelona");
        final Clube c2 = new Clube("Bayern");
        final Clube c3 = new Clube("Milan");

        clubes[0] = c1;
        clubes[1] = c2;
        clubes[2] = c3;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }


}
