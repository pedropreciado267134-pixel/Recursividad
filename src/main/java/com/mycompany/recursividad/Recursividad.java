/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursividad;

/**
 *
 * @author nenin
 */
public class Recursividad {

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int mcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return mcd(b, a % b);
    }

    public static int count(Object datos[], int n, Object o) {
        if (n == 0) {
            return 0;
        }
        int actual = datos[n - 1].equals(o) ? 1 : 0;
        return actual + count(datos, n - 1, o);
    }

    public static void reverse(Object datos[], int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        Object temp = datos[inicio];
        datos[inicio] = datos[fin];
        datos[fin] = temp;
        reverse(datos, inicio + 1, fin - 1);
    }
}
