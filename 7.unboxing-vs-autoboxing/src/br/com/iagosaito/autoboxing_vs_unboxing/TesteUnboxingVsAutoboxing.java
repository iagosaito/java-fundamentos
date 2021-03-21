package br.com.iagosaito.autoboxing_vs_unboxing;

public class TesteUnboxingVsAutoboxing {

    public static void main(String[] args) {

        // Autoboxing
        Integer i1 = 10;

        // Internamente atua da seguinte maneira...
        Integer i2 = Integer.valueOf(10);


        Integer i3 = new Integer(10);

        // Unboxing
        int i4 = i3;
    }
}
