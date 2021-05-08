package br.com.iagosaito.generics.bounded_type_parameters;

import java.util.List;

public class MultipleBounds<T extends Number & List<Number>> {

    private T t;

}
