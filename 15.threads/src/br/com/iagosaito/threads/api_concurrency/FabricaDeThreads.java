package br.com.iagosaito.threads.api_concurrency;

import java.util.concurrent.ThreadFactory;

class FabricaDeThreads implements ThreadFactory {
    @Override
    public Thread newThread(Runnable runnable) {

        final Thread thread = new Thread();
        thread.setUncaughtExceptionHandler((thread1, throwable) -> {
            System.out.println("Erro tratado: " + throwable.getMessage());
        });

        return thread;
    }
}
