package br.com.iagosaito.generics;

import br.com.iagosaito.generics.wildcard.Coringa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TesteCoringa {

    public static void main(String[] args) {

        List<Number> numberList = Arrays.asList(10, 10.01, 10.02);
        List<Integer> integersList = Arrays.asList(10, 11, 12);

        double soma = Coringa.somaDeListComCoringa(integersList);
        double outraSoma = Coringa.somaDeListComTypeParameter(integersList);
        System.out.println("Soma com coringa: " + soma);
        System.out.println("Soma com Type Parameter: " + outraSoma);

        // Coringa.printList(numberList); Código falha
        Coringa.printListGenerica(numberList); // Código compila
        Coringa.printListTypeParameter(numberList);

        // Teste Coringa de Limite Superor
        Coringa.printListDeNumerosOuSuperTipos(numberList);
        // Coringa.printListDeNumerosOuSuperTipos(integersList); // Falha pq Integer não é um super tipo de Number
        Coringa.printListDeNumerosOuSuperTipos(Collections.singletonList(new Object()));

        // Integer integer = 20;
        // Number number = integer;
        // List<Integer> integers = new ArrayList<>();
        // List<Number> numbers = integers; // Não existe relacionamento entre List<Number> com List<Integer>

        // Criando relacionamento entre classes genéricas.
        List<? extends Integer> integers = new ArrayList<>();
        List<? extends Number> numbers = integers;

        List<? super Number> numbersSuper = new ArrayList<>();
        List<? super Integer> integersSuper = numbersSuper;
    }
}
