package br.com.iagosaito.generics;

import java.util.Arrays;
import java.util.List;

public class TesteRestricoesGenerics {

    public static void main(String[] args) throws Exception {

        // 1- Não é possível utilizar primitivos como Type Parameter
        //Box<int> box = new Box<int>();
        // Solução: Usar as classes Wrapper
        Box<Integer> integerBox = new Box<>();

        // 2- Não pode criar instâncias de um Type Parameter
        // Solução: podemos criar via reflection
        testeInstancia(Arrays.asList(12, 13));

        // 3- Não é possivel declarar atributos estáticos como Type Parameter


    }

    private static <T> void testeInstancia(List<T> t) throws Exception {
        // T elem = new T(); Não compila
    }

    private static <T> void testeInstancia(List<T> t, Class<T> clazz) throws Exception {
        final T newInstanceOfT = clazz.getDeclaredConstructor().newInstance();
        t.add(newInstanceOfT);
    }
}

