package br.com.iagosaito.generics.javareflection.inversao_de_controle_e_injecao_de_dependencias;

public class TesteContainerIoc {

    public static void main(String[] args) {

        ContainerIoc containerIoc = new ContainerIoc();

        final Service service = (Service) containerIoc.gerarInstancia(Service.class);
        service.testService();

        final Controller controller = (Controller) containerIoc.gerarInstancia(Controller.class);
        controller.testeController();
    }
}
