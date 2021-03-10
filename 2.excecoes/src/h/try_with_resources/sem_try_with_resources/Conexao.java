package h.try_with_resources.sem_try_with_resources;

public class Conexao {

    public Conexao() {
        System.out.println("Abrindo conexão...");
//        throw new IllegalArgumentException("Não foi possível ler os dados!");
    }

    public void lerDados() {
        System.out.println("Lendo os dados da conexão");
        throw new IllegalArgumentException("Não foi possível ler os dados!");
    }

    public void fechar() {
        System.out.println("Fechando conexão...");
    }
}
