package br.com.iagosaito.generics;

public class TesteRawTypes {

    public static void main(String[] args) {
        Box box = new Box(); // Isso é um raw type

        Box rawBox = new Box<String>();
        rawBox.set(1234);
        System.out.println(rawBox.get());


        Box<Integer> intBox = new Box();
        intBox.set(123);
        System.out.println(intBox.get());
    }
}
