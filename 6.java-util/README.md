# Pacote java.util

##Arrays

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

### Tipos por referência

Além dos tipos primitivos, os Arrays também podem armazenar referências de objetos, por exemplo:

    Clube[] clubes = new Clube[4]

Nesse caso, cada posição do Array é inicializada com o valor default *null*. Caso um objeto do tipo Clube seja 
inicializado e inserido no Array, sua referência ficará armazenada.

### Array Genérico e Cast

Podemos criar um Array genérico da seguinte maneira:

    Object[] obj = new Object[10];

Nesse caso, podemos inserir qualquer elemento no Array, visto que todas as classes em Java estendem de object. O exemplo
a seguir exemplifica o caso:

    Carro c1 = new Carro("Uno");
    obj[0] = c1;

Como qualquer todo objeto da classe Carro é sempre estende um Object, podemos atribuir um carro ao Array. 

Mas e se quisermos instanciar um novo carro com a mesma referência de obj[0]?

    Carro novoCarro = (Carro) obj[0];

Neste caso, precisamos utilizar um recurso adicional chamado Cast. Cast nada mais é do que garantir para o compilador 
que a nossa referência de *obj[0]* é um carro. 

OBS: Temos que tomar cuidado com o cast, visto que ao utilizar esse recurso podemos dar de cara com a famosa exceção
ClassCastException. Essa exceção ocorre quando tentamos fazer Cast para objetos de tipos diferentes. 

Por exemplo, sabemos que no Array obj[0] temos uma referência para um objeto da classe Carro. Se fizermos isso:

    Moto moto = (Moto) obj[0]

Resultará em um ClassCastException.

Para saber se vai ser preciso fazer um Cast, sempre pense na seguinte regra... 

Se o elemento depois do sinal de atribuição *=* for mais genérico que o da esquerda, o Cast será obrigatório. Caso 
contrário, não.

## E o tal do *public static void main(String[] args)?*

Sabemos que *String[]* representa um Array de Strings. Esse Array de String no método Main da aplicação java representam
nada mais do que parâmetro - popularmente conhecidos como *flags* - muito utilizados para habilitar ou desabilitar 
funcionalidades específicas dentro da sua aplicação.

|---------------------------------------------------------------------------------------------------------------------|
## ArrayList

Array List é uma estrutura de dados que possui um Array por debaixo dos panos.

A vantagem de um ArrayList é que ele possui métodos pré-definidos para manipulação, além disso,
utiliza de Generics.

Então podemos "tipar" o Array, por exemplo:
    
    ArrayList<Conta> contas = new ArrayList<Contas>();

Agora o nosso ArrayList só vai aceitar a inserção de referências do tipo Contas.

Big O Notation para Arrays:

    get() -> O(1)
    remove() -> O(n)
    add() -> O(1)
    add(int index, e element) -> O(n)
    contains() -> O(n)

Toda vez que removermos um elemento do Array, vai ser preciso mover todos a frente para a esquerda.

OBS: Quando utilizamos o método contains(), ele executa o método equals() para cada objeto do ArrayList. 

## Equals

Quando não definimos condições para definir se um objeto é igual ou outro, por padrão ele compara apenas as
referências dos dois objetos. 

Quando não damos @Override no método equals() utilizamos a implementação dentro da classe Object.
Esta implementação apenas compara as referências.

Quando queremos comparar realmente o conteúdo dos objetos, devemos sobreescrever o método equals e inserir dentro dele 
as condições de comparação de um objeto e outro. Assim a comparação será feita com base nas comparações e não nas 
referências.

## Linked List

Estrutura de dados que não possuem um Array por debaixo dos panos.

Uma LinkedList utiliza uma Lista Duplamente Encadeada, ou seja, cada elemento possui uma referência para o próximo 
elemento e para o elemento anterior. 

Big O Notation para LinkedList:

    add() -> O(1)
    add() -> O(N) OBS: Porém, podemos considerar N/2 visto que pode partir tanto do fim como do começo.
    remove() -> O(1)
    get() -> O(N)
    contains() -> O(N)

## Vector

Além do ArrayList e do LinkedList e classe Vector é uma outra implementação da interface List. Sua implementação é muito
similar a do ArrayList, a única diferença é que ela foi criada para trabalhar com programação concorrente.

## Collections

Interface mãe de todas as coleções. Divido em dois tipos: Set e List

List -> Interface que define Listas, ou seja, possuem acesso a algum índice e aceitam valores repetidos.
Set -> Interface que define Conjuntos, ou seja, não aceitam valores repetidos e não possuem acesso a elementos através
de índices.

## Como ordenar Listas?

Para ordenar uma lista precisamos implementar a *interface* *Comparator*.

A *interface Comparator* disponibiliza um método chamado *Compare* que recebe dois parâmetros: o1 e o2. É neste método 
que você deve estabelecer o seu critério de comparação. 

Sendo assim, se com base no seu critério, o *o1* é maior que o *o2*, você deve retornar um valor positivo. 
Se *o2* for maior que *o1*, retorne um valor negativo. Se forem iguais, retorne 0. 