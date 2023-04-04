package br.com.dias.lambda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Lambda {

    /**
     * Lambda Expression foi introduzido no Java 8.
     */

    /**
     * #1
     * parameter -> expression
     */
    static void exampleOne(){
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        numbers.forEach( n-> System.out.print(n) );
    }

    /**
     * #2
     * param -> {code block}
     */
    static void exampleTwo(){
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        numbers.forEach( n-> {
            System.out.print(n);
            System.out.print(", ");
        });
    }

    /**
     * #3
     * (param1, param2) -> expression
     */
    static void exampleThree(){
        Map<Integer, String> map = Map.of(1, "Um", 2, "Dois", 3, "Três");
        map.forEach( (key, value)-> System.out.println(key + ": " + value));
    }

    /**
     * #4
     * (param1, param2) -> {code block}
     */
    static void exampleFour(){
        Map<Integer, String> map = Map.of(1, "Um", 2, "Dois", 3, "Três");
        map.forEach( (key, value)-> {
            System.out.print(key);
            System.out.print(": ");
            System.out.print(value);
            System.out.print(", ");
        });
    }

    public static void main (String[] args){

        System.out.println("Exemplo do #1");
        exampleOne();
        System.out.println("\n");

        System.out.println("Exemplo do #2");
        exampleTwo();
        System.out.println("\n");

        System.out.println("Exemplo do #3");
        exampleThree();
        System.out.println();

        System.out.println("Exemplo do #4");
        exampleFour();
        System.out.println("\n");
    }



}
