# Pacote Java.io

Este pacote lida com o fluxo de entrada e saída de dados.

https://docs.oracle.com/javase/7/docs/api/java/io/package-summary.html

## Entrada (Input)

Podemos receber um fluxo de entrada de dados nas nossas aplicações por diversas maneiras. Pode ser através de um 
arquivo, pela web ou pelo teclado. 

O exemplo a seguir demonstra como podemos ler um arquivo .txt com Java.

        FileInputStream fileInputStream = new FileInputStream("lorem.txt");

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = bufferedReader.readLine();

        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

#### FileInputStream -> Cria um fluxo para entrada de dados de um arquivo.
#### InputStreamReader -> Ponte para transformar um fluxo de bytes para fluxo de caracteres.
#### BufferedReader -> Lê caracteres a partir de um fluxo de caracteres.

## Saída (Output)

Da mesma maneira que podemos receber um fluxo de dados das mais variadas fontes, nós também podemos criar fluxos de
saída de dados. Os fluxos de saída podem ser: Arquivo de texto, a rede e o console. 

O exemplo a seguir demonstra como podemos escrever um arquivo .txt com Java.

    FileOutputStream fileOutputStream = new FileOutputStream("lorem2.txt");
    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
    BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

    bufferedWriter.write("Esta linha está sendo criada pelo Java\n");
    bufferedWriter.newLine();
    bufferedWriter.write("E esta também!!");

    bufferedWriter.close();

#### FileOutputStream -> Cria um fluxo para saída de dados binários de um arquivo.
#### OutputStreamWriter -> Ponte para transformar um fluxo de caracteres num Fluxo de Bytes.
#### BufferedWriter -> Escrever caracteres a partir de um fluxo de caracteres.

Veja que muito similar a leitura de arquivos. Tudo que é *Input* vira *Output*. Tudo que é *Reader* vira *Writer*. 

## System.in e System.out

Não é apenas em arquivos que temos entrada e saída de dados. 

*System.In e System.Out* são métodos estáticos que criam uma instância de InputStream e OutputStream, respectivamente. 

O System.In vai criar uma InputStrem que ficará escutando as entradas do teclado, e o OutputStream, por sua vez, lança
um fluxo de dados de saída no console. 

## FileWriter

Classe de mais alto nível para escrita em arquivos. Podemos substituir o *FileOutputStream* e o *OutputStreamWriter*
pelo *FileWriter*. 

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/FileWriter.html





