package br.com.iagosaito.collections.arraylist;

public class Jogador implements Comparable<Jogador>{

    public Jogador(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    private String nome;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return String.format("Jogador %s, %d anos", nome, idade);
    }

    @Override
    public int compareTo(Jogador jogador) {
        return Integer.compare(this.idade, jogador.idade);
    }
}
