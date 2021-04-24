package br.com.iagosaito.javareflection;

public class Jogador extends Pessoa {

    public Jogador(String nome, int idade, String clube, int golsMarcados) {
        super(nome, idade);
        this.clube = clube;
        this.golsMarcados = golsMarcados;
    }

    public Jogador(String clube, int golsMarcados) {
        this.clube = clube;
        this.golsMarcados = golsMarcados;
    }

    public Jogador() {}

    private String clube;
    private int golsMarcados;

    public int getGolsMarcados() {
        return golsMarcados;
    }

    private void adicionarGols(int qtdGols) {
        this.golsMarcados += qtdGols;
    }
}
