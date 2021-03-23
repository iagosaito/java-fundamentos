package br.com.iagosaito;

public class TesteClassesAnonimas {

    /*
        Em vez de criar uma classe para servir como Function Object, podemos utilizar classes anônimas.

        Ao dar new InterfaceParaPrintarAlgo() pode parecer que estamos instanciando uma interface, mas, na realidade
        o Java cria uma classe(daí que vem o nome) anônima que representa a implementação dessa interface.

        Embora isso nos ajude a enxugar o código, a leitura é altamente prejudicada.
     */
    public static void main(String[] args) {
        printarAlgo5x(new InterfaceParaPrintarAlgo() {
            @Override
            public void printarAlgo() {
                System.out.println("Printando algo por meio de uma classe anônima");
            }
        });
    }

    public static void printarAlgo5x(InterfaceParaPrintarAlgo interfaceParaPrintarAlgo) {
        for (int i = 0; i < 5; i++) {
            interfaceParaPrintarAlgo.printarAlgo();
        }
    }

}

interface InterfaceParaPrintarAlgo {
    void printarAlgo();
}