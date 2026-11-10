/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursividad;

import java.util.Arrays;

/**
 *
 * @author nenin
 */
public class PruebaRecursividad {

    public static void main(String[] args) {
        System.out.println("Fibonacci de 5: " + Recursividad.fibonacci(5));
        System.out.println("Fibonacci de 40: " + Recursividad.fibonacci(40));

        System.out.println("MCD de 45 y 75: " + Recursividad.mcd(45, 75));
        System.out.println("MCD de 47 y 91: " + Recursividad.mcd(47, 91));

        Integer[] numeros = {1, 2, 3, 3, 2, 3, 1};
        System.out.println("Ocurrencias de 3 en " + Arrays.toString(numeros) + ": "
                + Recursividad.count(numeros, numeros.length, 3));
        System.out.println("Ocurrencias de 1 en " + Arrays.toString(numeros) + ": "
                + Recursividad.count(numeros, numeros.length, 1));

        Character[] letras = {'A', 'B', 'C', 'B', 'A', 'B', 'D'};
        System.out.println("Ocurrencias de 'C' en " + Arrays.toString(letras) + ": "
                + Recursividad.count(letras, letras.length, 'C'));
        System.out.println("Ocurrencias de 'E' en " + Arrays.toString(letras) + ": "
                + Recursividad.count(letras, letras.length, 'E'));

        Integer[] arreglo1 = {1, 2, 3, 4, 5};
        System.out.println("Arreglo original: " + Arrays.toString(arreglo1));
        Recursividad.reverse(arreglo1, 0, arreglo1.length - 1);
        System.out.println("Arreglo invertido: " + Arrays.toString(arreglo1));

        Character[] arreglo2 = {'A', 'B', 'C', 'D'};
        System.out.println("Arreglo original: " + Arrays.toString(arreglo2));
        Recursividad.reverse(arreglo2, 0, arreglo2.length - 1);
        System.out.println("Arreglo invertido: " + Arrays.toString(arreglo2));
    }
}
