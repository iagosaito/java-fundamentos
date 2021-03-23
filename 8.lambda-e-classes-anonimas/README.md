# Lambda e Classes Anônimas

## Function Object

Nome dado a objetos que criamos para encapsular uma função. A utilização de classes anônimas facilita a criação desses 
objetos.

Em Java não é possível passar uma função como parâmetro de outra função. Esse tipo de funcionalidade é chamado de
*first class functions*. Não existem *first class functions* em Java. 

Então, você não pode escrever algo assim: 

    public static void someFunction(Function f){
    for(int i = 0; i < 10; i++)
        f();
    }
    ...
    public static void main{
    ...
        someFunction(System.out.println("Olá, Mundo!"));
    ...
    }

O que podemos fazer é definir uma *interface* com um único método para definir o comportamento dessa função.

    public interface Runnable {
        public void facaAlgo();
    }

Agora podemos reescrever o exemplo acima:
    
    public class PrintHello implements Runnable {
        public void run {
            System.out.println("Olá, Mundo!")
        }
    }

    public static void someFunction(Runnable r){
    for(int i = 0; i < 10; i++)
        r.facaAlgo();
    }

    ...
    public static void main {
    ...
        someFunction(new PrintHello());
    ...
    }

Agora esse código compila!! Então a classe PrintHello é exatamente um **Function Object**. Classe criada apenas para
encapsular uma função, que no meu caso é um função para printar *Olá, Mundo*.


Veja: https://stackoverflow.com/questions/7369460/help-with-understanding-a-function-object-or-functor-in-java

## Classes Anônimas

Classe anônimas são classes criadas pelo próprio Java *anonimamente* quando precisamos obter instâncias de interfaces ou
classes abstratas.

Por exemplo, no exemplo anterior, em vez de criar uma classe chamada PrintHello e Implementar o método Runnable,
poderíamos simplificar o código e executá-lo da seguinte maneira:


    public static void someFunction(Runnable r){
        for(int i = 0; i < 10; i++) {
            r.facaAlgo();
        }
    }

    ...
    public static void main {
    ...
        someFunction(new Runnable() {
            @Override
            public void facaAlgo() {
                System.out.println("Printando algo por meio de uma classe anônima");
            }
        });
    ...
    }

Quando utilizamos o operador *new* temos a sensação de que estamos instanciando uma Interface, porém, isso não é 
possível. 

Na realidade *o Java cria uma classe anônima* para representar a implementação da interface Runnable e assim executar o 
código. Note que no exemplo acima não precisamos mais da classe PrintHello, visto que estamos utilizando uma classe 
anônima criada pelo próprio Java.

## Lambdas

Veja como podemos simplificar a abordagem anterior usando lambdas:

    public static void someFunction(Runnable r){
        for(int i = 0; i < 10; i++) {
            r.facaAlgo();
        }
    }

    ...
    public static void main {
    ...
        someFunction(() -> System.out.println("Printando algo por meio de uma classe anônima"));
    ...
    }
