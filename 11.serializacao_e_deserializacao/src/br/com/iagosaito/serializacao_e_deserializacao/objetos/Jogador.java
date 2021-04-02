package br.com.iagosaito.serializacao_e_deserializacao.objetos;

import java.io.Serializable;

public class Jogador implements Serializable {

    private static final long serialVersionUID = 1L;

    public Jogador(String nome, int idade, int gols) {
        this.nome = nome;
        this.idade = idade;
        this.gols = gols;
    }

    private String nome;
    private int idade;
    private int gols;

    public String getIdadeGols() {
        return "Idade: " + idade + " , Gols: " + gols;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    @Override
    public String toString() {
        return String.format("Jogador %s, Gols: %d, Idade: %d", nome, gols, idade);
    }
}
