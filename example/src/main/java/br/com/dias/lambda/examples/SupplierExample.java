package br.com.dias.lambda.examples;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {

    /**
     * {@link Supplier} é uma {@link FunctionalInterface} que retorna um elemento.
     */

    public static void main (String[] args){

        System.out.println("Exemplo Supplier");
        Supplier<Double> supplierOfRandomDoubles = Math::random;
        System.out.println(supplierOfRandomDoubles.get());
        System.out.println();

        System.out.println("Exemplo Supplier especializado");
        IntSupplier supplierOfRandomInt = () -> (int)(Math.random() * 100);
        System.out.println(supplierOfRandomInt.getAsInt());
    }
}
