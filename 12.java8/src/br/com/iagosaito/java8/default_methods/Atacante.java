package br.com.iagosaito.java8.default_methods;

public class Atacante implements Jogador {

    public Atacante(String nome, int idade, String clube) {
        this.nome = nome;
        this.idade = idade;
        this.clube = clube;
    }

    private String nome;
    private int idade;
    private String clube;
}
