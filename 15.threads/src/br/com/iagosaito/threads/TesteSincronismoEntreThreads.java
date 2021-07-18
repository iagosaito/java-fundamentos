package br.com.iagosaito.threads;

public class TesteSincronismoEntreThreads {

    /*
        O problema aqui é que João e Maria estão entrando no banheiro ao mesmo tempo, o que é algo nojento
     */
    public static void main(String[] args) {
        final Banheiro banheiro = new Banheiro();

        new Thread(banheiro::fazNumero1, "João").start();
        new Thread(banheiro::fazNumero2, "Maria").start();
        new Thread(banheiro::fazNumero2, "Mário").start();
        new Thread(banheiro::fazNumero1, "Marcelo").start();
        new Thread(banheiro::fazNumero1, "Adriana").start();

    }
}

class Banheiro {

    public void fazNumero1() {

        final String name = Thread.currentThread().getName();

        System.out.println(name + " está batendo na porta no banheiro");

        synchronized (this) {
            System.out.println(name + ": entrando no banheiro");
            System.out.println(name + ": fazendo coisa rapida");

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + ": dando descarga");
            System.out.println(name + ": lavando a mao");
            System.out.println(name + ": saindo do banheiro");
        }

    }

    public void fazNumero2() {

        final String name = Thread.currentThread().getName();

        System.out.println(name + " está batendo na porta no banheiro");

        synchronized (this) {

            System.out.println(name + ": entrando no banheiro");
            System.out.println(name + ": fazendo coisa demorada");

            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + ": dando descarga");
            System.out.println(name + ": lavando a mao");
            System.out.println(name + ": saindo do banheiro");
        }

    }

}
