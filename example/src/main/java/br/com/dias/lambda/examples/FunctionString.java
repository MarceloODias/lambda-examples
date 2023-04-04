package br.com.dias.lambda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionString {

    /**
     * {@link Function} é uma {@link FunctionalInterface} que recebe um parâmetro e retorna um resultado.
     */
    public static void main (String[] args){

        List<String> names = Arrays.asList("João da Silva", "Carla Almeida", "Marcelo");

        // definindo a function.
        Function<String, String> getLastName = str -> {
            List<String> parts = Arrays.asList(str.split(" "));
            return parts.stream().skip(parts.size() -1L).findFirst().orElseGet(null);
        };

        // exemplo de uso aplicando a todos os elementos.
        System.out.println("Exemplo Function:");
        names.stream().map(getLastName).forEach(System.out::println);
        System.out.println();

        // exemplo de uso combinando com predicate.
        System.out.println("Exemplo Function e Predicate:");
        Predicate<String> hasSpaces = str -> str.contains(" ");
        names.stream().filter(hasSpaces).map(getLastName).forEach(System.out::println);
        System.out.println();
    }
}
