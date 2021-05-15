package br.com.iagosaito.generics.wildcardcapture_and_helper;

public class NumeroNatural {

    private int i;

    public NumeroNatural(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}
