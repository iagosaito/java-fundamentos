package br.com.iagosaito.array_list;

import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {

        /*
            Array List é uma estrutura de dados que possui um Array por debaixo dos panos.

            A vantagem de um ArrayList é que ele já possui métodos pré-definidos para manipulação, e ainda por cima,
            utiliza de Generics.

            Então podemos "tipar" o Array, como fizemos com o exemplo abaixo criando um ArrayList especifico de Strings.
         */
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Batata");
        strings.add("Cenoura");
        strings.add("Agrião");

        for (String s : strings) {
            System.out.println(s);
        }

    }
}
