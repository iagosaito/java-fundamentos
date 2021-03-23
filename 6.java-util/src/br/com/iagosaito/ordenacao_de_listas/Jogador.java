package br.com.iagosaito.ordenacao_de_listas;

public class Jogador {

    public Jogador(String nome, Double valorDeMercado) {
        this.nome = nome;
        this.valorDeMercado = valorDeMercado;
    }

    private String nome;
    private Double valorDeMercado;

    public String getNome() {
        return nome;
    }

    public Double getValorDeMercado() {
        return valorDeMercado;
    }

    @Override
    public String toString() {
        return "Jogador: " + nome + ", Valor: " + valorDeMercado;
    }
}
