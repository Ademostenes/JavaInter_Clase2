package PracLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PruebaListas {

	public static List<String> EnMayusculas(List<String> lista, Function<String, String> funcion) {
        List<String> listaTransformada = new ArrayList<>();
        for (String cadena : lista) {
            listaTransformada.add(funcion.apply(cadena));
        }
        return listaTransformada;
    }

    public static void main(String[] args) {
        List<String> lista = Arrays.asList("respuesta", "actividad", "numero", "2");

        Function<String, String> funcion = string -> string.toUpperCase(); //Expresión Lambda.

        List<String> listaTransformada = EnMayusculas(lista, funcion);
        
        System.out.println("La lista original es: " + lista);
        System.out.println("La lista inicial, en mayusculas es: " + listaTransformada);
    }
}
