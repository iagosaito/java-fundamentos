package br.com.iagosaito.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Clube {

    public Clube(String nome) {
        this.nome = nome;
    }

    private String nome;
    private List<Jogador> jogadores = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public List<Jogador> getJogadores() {
        return Collections.unmodifiableList(jogadores);
    }

    public void adiciona(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    @Override
    public String toString() {
        return "Clube{" +
                "nome='" + nome + '\'' +
                ", jogadores=" + jogadores +
                '}';
    }
}
