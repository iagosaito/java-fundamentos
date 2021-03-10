package h.try_with_resources.com_try_with_resources;

public class Conexao implements AutoCloseable {

    public Conexao() {
        System.out.println("Abrindo conexão...");
//        throw new IllegalArgumentException("Não foi possível abrir uma conexão!");
    }

    public void lerDados() {
        System.out.println("Lendo os dados da conexão");
        throw new IllegalArgumentException("Não foi possível ler os dados!");
    }

    @Override
    public void close() {
        System.out.println("Fechando conexão...");
    }
}
