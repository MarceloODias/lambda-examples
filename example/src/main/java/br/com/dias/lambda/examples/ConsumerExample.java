package br.com.dias.lambda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

    /**
     * Java 8 introduziu o pacote {@link java.util.function}.
     *
     * {@link FunctionalInterface} é uma interface que tem apenas um único método abstrato.
     *
     * {@link Consumer} é uma {@link FunctionalInterface} que recebe um parâmetro e retorna void.
     *
     */

    static void consumerSimples(){
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        // definindo uma Consumer simples.
        Consumer<Integer> consumer = n -> System.out.println(n);
        numbers.forEach(consumer);

        System.out.println();

        // definindo um Consumer ainda mais simples.
        Consumer<Integer> consumerSimpler = System.out::println;
        numbers.forEach(consumerSimpler);

        System.out.println();

        // Deixando o java inferir o Consumer.
        numbers.forEach(System.out::println);

        System.out.println();

        // Exemplo de uso de outra Interface do pacote.
        Map<Integer, String> map = Map.of(1, "Um", 2, "Dois", 3, "Três");
        BiConsumer<Integer, String> biConsumer = (key, value)-> System.out.print(key + ": " + value + ", ");

        map.forEach(biConsumer);
    }

    static void consumerEncadeado(){
        List<String> names = Arrays.asList("João", "Alberto");

        Consumer<String> printLength = name -> System.out.print(name.length() + ": ");
        Consumer<String> printValue = name -> System.out.print(name + ", ");

        // Podemos encadear os consumidores.
        names.forEach(printLength.andThen(printValue));
    }

    public static void main(String[] args){
        System.out.println("Exemplo simples");
        consumerSimples();
        System.out.println("\n");

        System.out.println("Exemplo encadeado");
        consumerEncadeado();
        System.out.println("\n");
    }

}
