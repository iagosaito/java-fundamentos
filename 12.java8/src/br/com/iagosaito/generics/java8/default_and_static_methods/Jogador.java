package br.com.iagosaito.generics.java8.default_and_static_methods;

public interface Jogador {

    static void chutar(final String tipoDeChute) {
        if (tipoDeChute == null || "".equals(tipoDeChute)) {
            System.out.println("Chutando...");
        }

        System.out.println("Chutando... " + tipoDeChute);
    }

    default void chutePorCobertura() {
        chutar("por cobertura");
    }

    default void chuteRasteiro() {
        chutar("por cobertura");
    }

}
