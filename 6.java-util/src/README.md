# Pacote java.util

###Arrays

Arrays são objetos dinamicamente criados - isso significa que eles são criados em tempo de execução do
código, não em tempo de compilação - que são armazenados sequencialmente em memória. 

    int i = new int[10];

O código acima demonstra a criação de um array de int's. Perceba que para criar um Array utilizamos um
operador *new*, por isso um Array é antes de tudo, um objeto. 

Mas qual é a sua definição de classe?

São classes especiais definidas internamente na JVM. Baseando-se no código acima, se executarmos: 

    System.out.println(i.getClass());

O retorno que nós temos é: 

    class [I

**"[I"** equivale a uma assinatura de objeto da classe *Class* "predefinida" na JVM. Não existem arquivos .class correspondentes. 
Todo Array estende a classe Object e implementa internamente as interfaces Clonable e Serializable.

Links para referências:

- https://www.geeksforgeeks.org/arrays-in-java/
- https://docs.oracle.com/javase/specs/jls/se8/html/jls-10.html#jls-10.8
- https://stackoverflow.com/questions/8546500/why-isnt-there-a-java-lang-array-class-if-a-java-array-is-an-object-shouldnt

Além dos tipos primitivos, os Arrays também podem armazenar referências de objetos, por exemplo:

    Clube[] clubes = new Clube[4]

Nesse caso, cada posição do Array é inicializada com o valor default *null*. Caso um objeto do tipo Clube seja 
inicializado e inserido no Array, sua referência ficará armazenada.