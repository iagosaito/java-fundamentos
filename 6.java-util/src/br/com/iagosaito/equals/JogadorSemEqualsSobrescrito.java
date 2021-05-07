package br.com.iagosaito.equals;

public class JogadorSemEqualsSobrescrito {

    public JogadorSemEqualsSobrescrito(String nome, String clube) {
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
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", clube='" + clube + '\'' +
                '}';
    }
}
