package br.com.iagosaito.cast;

public abstract class Veiculo {

    public Veiculo(String marca) {
        this.marca = marca;
    }

    private String marca;

    public String getMarca() {
        return marca;
    }
}
