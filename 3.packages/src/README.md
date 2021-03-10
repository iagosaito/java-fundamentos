# Pacotes

Pacotes são diretórios especiais que servem para organizar melhor as classes ou interfaces de um projeto. 

Dentre as características de um pacote, podemos destacar:
- A definição de um pacote deve ser a primeira coisa numa classe.
- Para utilizar uma classe de um outro pacote, podemos seguir duas abordagens:
    - Utilização de FQN = Full Qualified Name, que consiste no PACKAGE.NOME_SIMPLES_CLASSE.
    - Importar os pacotes para dentro da classe. Lembrando que a declaração de um import deve ficar sempre 
      abaixo do package.
- A nomenclatura padrão é utilizar um nome de domínio da web ao contrário. Por exemplo: "www.siteinventado.com.br" 
  ficaria com a seguinte estrutura:
  - br
    - com
        - siteinventado
          - nome_do_produto
            - modelo
            - teste 
            - etc...
    
