package br.com.iagosaito.java8.default_methods;

public class TesteDefaultMethod {

    public static void main(String[] args) {

        Atacante atacante = new Atacante("Messi", 32, "Barcelona");

        atacante.chutePorCobertura();
        atacante.chuteRasteiro();
        Jogador.chutar("de trivela");

    }
}
