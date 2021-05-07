package br.com.iagosaito.generics.cast;

public class TestCastImplicitoVsExplicito {


    public static void main(String[] args) {

        /*
            Cast Implícito.
            Todo int cabe dentro de um double.
         */
        int i = 50;
        double d = i;

        /*
            Cast explícito.
            A variável d que é um double não cabe dentro de um int. Por isso, precisamos deixar explícito que queremos
            fazer um cast de double para int. Caso tenha casas decimais, elas serão cortadas.
         */
        int num = (int) d;

        Object[] obj = new Object[10];

        Carro carro = new Carro("Uno", "Fiat");
        obj[0] = carro;

        Veiculo novoCarro = (Carro) obj[0];

        System.out.println(carro.getNome());
        System.out.println(novoCarro.getMarca());
    }
}
