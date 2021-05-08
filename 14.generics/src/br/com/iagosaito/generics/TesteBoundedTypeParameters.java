package br.com.iagosaito.generics;

public class TesteBoundedTypeParameters {

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.set("Iago");
        stringBox.inspect(1L);
    }
}
