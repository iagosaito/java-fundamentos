package br.com.iagosaito.generics.javareflection.inversao_de_controle_e_injecao_de_dependencias;

public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    public void testeController() {
        System.out.println("Imprimindo controller...");
    }
}
