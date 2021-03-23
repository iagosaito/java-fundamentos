package br.com.iagosaito;

public class TesteOrdenacaoClassesAnonimas {

    /*
        A classe PrintarAlgo atua como um Function Object. Uma classe utilizada apenas para encapsular
        a função printarAlgo().

        Estamos assim utilizando um truque para contornar a limitação do Java de não possuir 'first class functions'
     */
    public static void main(String[] args) {
        printarAlgo5x(new PrintarAlgo());
    }

    public static void printarAlgo5x(FunctionObject functionObject) {
        for (int i = 0; i < 5; i++) {
            functionObject.printarAlgo();
        }
    }
}

interface FunctionObject {
    void printarAlgo();
}

class PrintarAlgo implements FunctionObject {

    @Override
    public void printarAlgo() {
        System.out.println("Estou printando algo!!!");
    }
}
