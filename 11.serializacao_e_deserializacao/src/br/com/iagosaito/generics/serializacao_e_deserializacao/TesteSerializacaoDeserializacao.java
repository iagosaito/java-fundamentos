package br.com.iagosaito.generics.serializacao_e_deserializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoDeserializacao {

    public static void main(String[] args) throws Exception {

        String stringParaSerSerializada = "Iago Hisami Saito";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializacao.bin"));
        oos.writeObject(stringParaSerSerializada);

        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializacao.bin"));
        stringParaSerSerializada = (String) ois.readObject();

        System.out.println(stringParaSerSerializada);

    }
}
