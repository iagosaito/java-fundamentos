package br.com.iagosaito.generics.wildcardcapture_and_helper;

import java.util.Collections;
import java.util.List;

public class TesteWildCardCapture {

    public static void main(String[] args) {
        CoringaErro coringaErro = new CoringaErro();
        coringaErro.algumaCoisa(Collections.singletonList("12"));
    }
}

class CoringaErro {

    void algumaCoisa(List<?> algumaCoisaList) {
//        algumaCoisaList.set(0, algumaCoisaList.get(0)); Compilador não consegue inferir o tipo de Objeto passado
        algumaCoisaHelper(algumaCoisaList);
    }

    private <T> void algumaCoisaHelper(List<T> algumaCoisaList) {
        algumaCoisaList.set(1, algumaCoisaList.get(0));
    }

}
