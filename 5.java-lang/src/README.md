# java.lang

O pacote *java.lang* é um pacote especial no mundo Java. É o único que não precisa ser importador em nenhuma classe. 

Como é impossível criar um sistema sem utilizar as classes do pacote *java.lang*, a JVM possui abstrai essa
informação para os desenvolvedores.

String e System são exemplos de classes do pacote *java.lang*. Você pode conferir a documentação oficial do pacote aqui:
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/package-summary.html.

Vamos entender mais a respeito da classe String....

### String

- Strings em Java são imutávels. Quando você altera uma String, na realidade, está criando outra. 
- Strings possuem sintaxe especial chamada Object Literal, isso traz a possibilidade de criar objetos sem utilizar o 
operador *new*.
- Strings são conjuntos de chars. A própria classe String implementa a interface *CharSequence*.
- A classe *StringBuilder* também implementa a interface *CharSequence*, porém cria String mutáveis. Então, o uso é
recomendado caso você precise concatenar várias Strings.
  
Doc oficial da classe String: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html