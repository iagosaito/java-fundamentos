package h.try_with_resources.sem_try_with_resources;

public class FluxoSemTryWithResources {

    public static void main(String[] args) {

        Conexao conexao = null;

        /*
            Caso haja uma exception na hora de construir o objeto conexão,
            é preciso verificar dentro do bloco finally se o objeto for criado para evitar
            NullPointerException
         */
        try {
            conexao = new Conexao();
            conexao.lerDados();
        } catch(IllegalArgumentException ex) {
            System.out.println("Lançando exceção... " + ex);
        } finally {
            if (conexao != null) {
                conexao.fechar();
            }
        }

    }
}
