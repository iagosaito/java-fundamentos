package br.com.iagosaito;

public class TesteLambda {

    public static void main(String[] args) {
        printarAlgo5x(new InterfaceQualquer() {

            @Override
            public void printarAlgo(String nome) {
                System.out.println("Printando algo com o nome: " + nome);
            }
        }, "Iago");

        System.out.println("------------------------");
        System.out.println("Agora com Lambda...");

        printarAlgo5x((nome) -> {
                System.out.println("Printando algo com o nome: " + nome);
        }, "Iago");

        System.out.println("------------------------");
        System.out.println("Simplificando mais as coisas...");

        printarAlgo5x(System.out::println, "Iago Saito");

    }

    public static void printarAlgo5x(InterfaceQualquer interfaceQualquer, String nome) {
        for (int i = 0; i < 5; i++) {
            interfaceQualquer.printarAlgo(nome);
        }
    }

}

interface InterfaceQualquer {
    void printarAlgo(String nome);
}