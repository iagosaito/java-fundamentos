# Serialização e Deserialização

Serialização: Processo de transformar o estado de um objeto numa sequência de bytes. Pode serializar o
objeto para salvar o seu estado no HD, num banco de dados ou transportá-lo pela rede.

Deserialização: Processo de transformar os objetos persistidos em arquivos(em bytes) sejam recuperados
e seu valores de seu estado recriados em memória.

========================================

Para que uma classe consiga ser serializada, ela deve implementar a interface *Serializable*. Um detalhe interessante
sobre essa interface é que não possui nenhum método, serve apenas como uma marcação. 

Na época em que essa interface foi criada, no Java 1.1, não existia o recurso de Anotações. Possivelmenete, se já 
existisse, veríamos algo como *@Serializable*.

### E o tal do *serialVersionUID* ?

O *serialVersionUID* é um identificador único da classe, ou seja, por meio desse ID o Java consegue detectar no ato de
deserialização se a classe a ser deserializada sofreu alteração ou não. 

Quando não incluímos esse atributo nas classes que implementam a interface *Serializable*, o Java automaticamente
calcula esse valor baseado no nosso código da classe. 

Por exemplo: serialVersionUID = 1010917079538844149

O problema dessa abordagem é que as classes costumam sofrer alterações com o tempo. Pensando nisso, imagine que eu faça 
a serialização de um objeto hoje para um arquivo chamado *jogador.bin*. 

Três dias depois necessito recuperar o estado desse objeto, porém há um detalhe nesse período. Eu percebi que a minha
classe *Jogador* não tinha o método *toString()* e o implementei. 

Essa alteração feita agora deixaria o meu objeto **incompatível** para deserialização? Na teoria, não. Adicionar o 
método *toString()* não tem impacto nenhum na Deserialização de um objeto. 

Entretanto, note o que acontece quando eu tento fazer a deserialização: 

    Exception in thread "main" java.io.InvalidClassException: 
    ...local class incompatible: stream classdesc serialVersionUID = 1010917079538844149, 
    local class serialVersionUID = -2283415145897820568

Veja, mesmo as classes sendo compatíveis, o Java analisa o *serialVersionUID* e como eles são diferentes, pois são
gerados a partir do código da classe, a deserialização falha. 

A solução nesse caso é escrever o atributo na classe:

    private static final long serialVersionUID = 1L;

Dessa forma nós controlamos se a classe é compatível ou não para deserialização. Se as alterações mantiverem a classe
compatível, mantemos o número, caso contrário, alteramos manualmente. 

https://docs.oracle.com/javase/7/docs/api/java/io/Serializable.html