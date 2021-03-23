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

    public interface Runnable{
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