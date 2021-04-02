package br.com.iagosaito.serializacao_e_deserializacao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TesteJogadorSerializacao {

    public static void main(String[] args) throws Exception {

        Jogador j1 = new Jogador("Messi", 34, 800);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializacao.bin"));
        oos.writeObject(j1);

        oos.close();
    }
}
