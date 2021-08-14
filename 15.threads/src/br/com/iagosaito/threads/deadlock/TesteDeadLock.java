package br.com.iagosaito.threads.deadlock;

class TesteDeadLock {

    public static void main(String[] args) {

        GerenciadorDeTransacao tx = new GerenciadorDeTransacao();
        PoolDeConexoes pool = new PoolDeConexoes();

        new Thread(new TarefaAcessaBanco(pool, tx)).start();
        new Thread(new TarefaAcessaBancoProcedure(pool, tx)).start();

    }

    private static class TarefaAcessaBanco implements Runnable {
        private PoolDeConexoes pool;
        private GerenciadorDeTransacao tx;

        public TarefaAcessaBanco(PoolDeConexoes pool, GerenciadorDeTransacao tx) {
            this.pool = pool;
            this.tx = tx;
        }

        @Override
        public void run() {

            synchronized (pool) {
                pool.getConnection();

                synchronized (tx) {
                    tx.begin();
                }
            }

        }
    }

    private static class TarefaAcessaBancoProcedure implements Runnable {
        private PoolDeConexoes pool;
        private GerenciadorDeTransacao tx;

        public TarefaAcessaBancoProcedure(PoolDeConexoes pool, GerenciadorDeTransacao tx) {
            this.pool = pool;
            this.tx = tx;
        }

        @Override
        public void run() {
            synchronized (tx) {
                tx.begin();

                synchronized (pool) {
                    pool.getConnection();
                }
            }
        }
    }
}
