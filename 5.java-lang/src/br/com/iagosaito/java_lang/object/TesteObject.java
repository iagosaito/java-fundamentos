package br.com.iagosaito.java_lang.object;

/*
    Por padrão, todas as classes extendem de Object.
 */
public class TesteObject extends Object {

    public static void main(String[] args) {

        /*
            Podemos realizar o polimorfismo criando referências da classe Pai (Object) para a classe Filha
            (QualquerClasse).

            Nesse caso estamos referenciando uma instância da classe "QualquerClasse" por um atributo do tipo Object.
            O compilador enxerga apenas os métodos baseados no tipo da referência, por isso só vamos conseguir acessar
            os métodos da classe Object.
         */
        Object qualquerClasse = new QualquerClasse();
    }
}
