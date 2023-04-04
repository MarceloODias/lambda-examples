package br.com.dias.lambda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    /**
     * {@link Predicate} é uma {@link FunctionalInterface} que retorna um boolean ({@code false} ou {@code true}).
     */
    public static void main (String[] args){

        System.out.println("Exemplo Predicate");
        Predicate<String> hasSpaces = str -> str.contains(" ");

        List<String> names = Arrays.asList("João da Silva", "Carla Almeida", "Marcelo");
        names.stream().filter(hasSpaces).forEach(System.out::println);
        System.out.println();

        System.out.println("Exemplo Predicate encadeado");
        Predicate<String> startsWithC = str -> str.startsWith("C");
        names.stream().filter(hasSpaces.and(startsWithC)).forEach(System.out::println);
    }
}
