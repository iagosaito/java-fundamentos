package br.com.iagosaito.generics;

public class TesteSubtiposHeranca {

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        Box<Integer> integerBox = new Box<>();
        // stringBox.boxTest(integerBox); // Box<Integer> não é um subtipo de Box<Number>

    }
}
