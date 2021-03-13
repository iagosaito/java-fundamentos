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

### Destrinchando o System.out.println()

Podemos inferir várias coisas a respeito do método System.out.println. Para começar, podemos dizer de cara que System é 
uma classe public, pois começa com letra maiúscula e podemos utilizá-la em nosso pacote. 

Agora vamos os System.out... Bem, podemos dizer que o *out* não é uma classe, pois começa com letra minúscula. Também
podemos dizer que não é um método, pois não estava chamando *out()*. 

Então, por eliminação, sabemos que *out* é um atributo da classe *System. Ok, mas um atributo de qual tipo? int? String?
long?

Vamos pensar um pouco...

Depois do *out* temos uma chamada ao método *println*. Opa! Para chamar um método precisamos de um objeto. Então, o 
*out* é um atributo de referência a um objeto, e como não precisamos do operador *new*, sabemos que é um atributo 
estático.

### Object

- Todas as classes em Java herdam da classe Object no Java, mesmo que você não faça isso diretamente.
- Podemos utilizar de polimorfismo para criar um objeto qualquer utilizando a classe Object como tipo da variável de 
referência.
- A classe Object possui métodos como toString(), hashCode() e equals().
