package br.com.iagosaito.generics.ordenacao_de_listas.ordem_natural;

public class Clube implements Comparable<Clube> {

    public Clube(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Clube: " + nome + ", idade: " + idade;
    }

    @Override
    public int compareTo(Clube outro) {
        return Integer.compare(this.idade, outro.idade);
    }
}
