package br.com.iagosaito.threads;

public class TesteSincronismoEntreThreads {

    /*
        O problema aqui é que João e Maria estão entrando no banheiro ao mesmo tempo, o que é algo nojento.
        Para resolver este problema, é precisa deixar os métodos sincronizados
     */
    public static void main(String[] args) {
        final Banheiro banheiro = new Banheiro();

        new Thread(banheiro::fazNumero1, "João").start();
        new Thread(banheiro::fazNumero2, "Maria").start();
        final Thread limpezaThread = new Thread(() -> {
            while (true) {
                banheiro.limparBanheiro();
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Limpeza");
        limpezaThread.setDaemon(true);
        limpezaThread.start();
    }
}

class Banheiro {

    private boolean isSujo = true;

    public void fazNumero1() {

        final String name = Thread.currentThread().getName();

        System.out.println(name + " está batendo na porta no banheiro");

        synchronized (this) {
            System.out.println(name + ": entrando no banheiro");

            while (isSujo) {
                esperaBanheiroSerLimpo(name);
            }

            System.out.println(name + ": fazendo coisa rapida");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.isSujo = true;

            System.out.println(name + ": dando descarga");
            System.out.println(name + ": lavando a mao");
            System.out.println(name + ": saindo do banheiro");
        }

    }

    private void esperaBanheiroSerLimpo(String name) {
        System.out.println(name + ", eca!! Banheiro está sujo");
        System.out.println(name + " saindo do banheiro...");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fazNumero2() {

        final String name = Thread.currentThread().getName();

        System.out.println(name + " está batendo na porta no banheiro");

        synchronized (this) {

            System.out.println(name + ": entrando no banheiro");

            while (isSujo) {
                esperaBanheiroSerLimpo(name);
            }

            System.out.println(name + ": fazendo coisa demorada");

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.isSujo = true;

            System.out.println(name + ": dando descarga");
            System.out.println(name + ": lavando a mao");
            System.out.println(name + ": saindo do banheiro");
        }

    }

    public void limparBanheiro() {

        final String name = Thread.currentThread().getName();

        System.out.println(name + " está batendo na porta no banheiro");

        synchronized (this) {

            System.out.println(name + ": entrando no banheiro");

            if (!isSujo) {
                System.out.println("banheiro já está limpo");
                return;
            }

            System.out.println("limpando banheiro...");

            this.isSujo = false;
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + ": dando descarga");
            System.out.println(name + ": lavando a mao");
            System.out.println(name + ": saindo do banheiro");

            notifyAll();
        }

    }

}
