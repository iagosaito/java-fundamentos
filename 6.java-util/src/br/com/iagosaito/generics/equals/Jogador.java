package br.com.iagosaito.generics.equals;

public class Jogador {

    public Jogador(String nome, String clube) {
        this.nome = nome;
        this.clube = clube;
    }

    private String nome;
    private String clube;

    public String getNome() {
        return nome;
    }

    public String getClube() {
        return clube;
    }

    @Override
    public boolean equals(Object o) {
        Jogador jogador = (Jogador) o;

        if (this.clube != jogador.clube) return false;
        if (this.nome != jogador.nome) return false;

        return true;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", clube='" + clube + '\'' +
                '}';
    }
}
