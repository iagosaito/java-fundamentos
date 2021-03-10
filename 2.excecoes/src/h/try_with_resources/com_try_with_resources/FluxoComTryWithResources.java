package h.try_with_resources.com_try_with_resources;

public class FluxoComTryWithResources {

    public static void main(String[] args) {

        /*
            Try-with-resources cria automaticamente um bloco finally e trata erros
            na criação de um objeto automaticamente.


         */
        try (Conexao conexao = new Conexao()){
            conexao.lerDados();
        } catch (IllegalArgumentException ex) {
            System.out.println("Lançando exceção... " + ex);
        }
    }

}
