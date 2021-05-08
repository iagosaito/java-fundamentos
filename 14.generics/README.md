## Generics

### Por que utilizar Generics?

- Elimina Casts
- Verificação do tipo em tempo de compilação em vez de tempo de execução.

### Tipos Genéricos

Um *Generic Type* é uma classe ou interface que é parametrizada por tipos. Por exemplo:
    
    public class br.com.iagosaito.generics.Box<T1, T2, ..., Tn>

Os tipos definidos dentro dos <> são chamadas de Type Parameters(Variable).
As *Type Variable* podem ser de qualquer tipo desde que não sejam não-primitivo.

Pode ser uma classe, uma interface, um array ou até outro *Type Variable*.

### Convenção de Type Variables

Os nomes de *Types Variables* mais utilizadas são:
- E - Elemento
- K - Key
- N - Número
- T - Tipo
- V - Value
- S,U,V - Segundo, Terceiro ou Quarto tipos

### Instanciando um tipo genérico

Para instanciar um tipo genérico fazemos da seguinte maneira:

    Box<Integer> integerBox = new Box<Integer>();

Sendo *Integer* o *type parameter* da classe Box. Podemos também criar uma classe com multiplos *type parameters*, ex:

    Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);

### Raw Types

Raw Types é uma classe Generica que tem o seu *Type Argument* omitido, ex:

    Box rawBox = new Box();

Nesse caso, é inferido que você possui um Box que te retornar Object. O problema da utilização de Raw Types é que é 
impossível realizar checkagem de tipo usando raw types em tempo de compilação, apenas em tempo de execução.

### Métodos Genéricos
    
Métodos Genéricos são métodos que introduzem os seus próprios Type Parameters. O que muda de uma classe genérica para um
método genérico, é que no caso do método o escopo vai ser restringir ao método.

Como declarar um método genérico:

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
            p1.getValue().equals(p2.getValue());
    }

Note que na declaração do método genérico consta uma lista de *type parameters* dentro das <> antes do retorno do 
método.

### Delimitador de Type Parameters

Em ocasiões você deseja restringir os tipos de um *type parameter*. Por exemplo, talvez queremos que um método se limite
a aceitar tipos apenas de instâncias da classe Number ou de suas subclasses, para isso que foram criados os *bound type
parameters*.

Para criar um *bounded type parameter* utilize o operador *extends*, ex:

    public class NaturalNumber<T extends Number> 

Isso significa que o *type parameter* T só aceita argumentos que herdam da classes abstrata number. Por meio dessa
funcionalidade podemos acessar métodos que são definidos na nossa classe delimitadora - no caso do exemplo acima "Number".

Referencias...

https://docs.oracle.com/javase/tutorial/java/generics/index.html
https://docs.oracle.com/javase/tutorial/extra/generics/index.html