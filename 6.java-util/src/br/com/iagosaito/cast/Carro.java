package br.com.iagosaito.cast;

public class Carro extends Veiculo {

    public Carro(String nome, String marca) {
        super(marca);
        this.nome = nome;
    }

    private String nome;

    public String getNome() {
        return nome;
    }
}
