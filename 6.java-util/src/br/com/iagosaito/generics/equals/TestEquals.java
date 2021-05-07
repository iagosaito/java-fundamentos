package br.com.iagosaito.generics.equals;

public class TestEquals {

    public static void main(String[] args) {

        Jogador j1 = new Jogador("Messi", "Barcelona");
        Jogador j2 = new Jogador("Messi", "Barcelona");

        System.out.println("São iguais? " + j1.equals(j2));

        JogadorSemEqualsSobrescrito js1 = new JogadorSemEqualsSobrescrito("Messi", "Barcelona");
        JogadorSemEqualsSobrescrito js2 = new JogadorSemEqualsSobrescrito("Messi", "Barcelona");

        System.out.println("São iguais? " + js1.equals(js2));

        /*
            Quando não definimos condições para definir se um objeto é igual ou outro, por padrão ele compara apenas as
            referências dos dois objetos. É por isso que no segundo print o resultado foi "false".

            Quando não damos @Override no método equals() estamos utilizando a implementação dentro da classe object
            Esta implementação apenas compara as referências.

            A classe Jogador acima mostra um exemplo de implementação. Ou seja, para um jogador ser igual ao outro,
            basta ele ter o mesmo nome e estar no mesmo clube, mesmo que sejam referências a objetos diferentes.

            Estamos comparando o CONTEÚDO do objeto.
         */
    }
}
