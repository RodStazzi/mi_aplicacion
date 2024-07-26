package com.ejemplo;

import java.util.function.Function;


/**
 * Hello world! 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "El nuevo 2.1.0 Group" );

        Function<Integer, Integer> square = x -> x * x;

        // Ejemplo de uso
        int num = 5;
        int result = square.apply(num);
        System.out.println("El cuadrado de " + num + " es: " + result);

    }
}


