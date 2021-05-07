package br.com.iagosaito.generics.java8.default_and_static_methods;

public class TesteDefaultMethod {

    public static void main(String[] args) {

        Atacante atacante = new Atacante("Messi", 32, "Barcelona");

        atacante.chutePorCobertura();
        atacante.chuteRasteiro();
        Jogador.chutar("de trivela");

    }
}
