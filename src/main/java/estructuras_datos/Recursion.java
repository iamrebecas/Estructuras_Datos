/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras_datos;

/**
 *
 * @author rsolano
 */

public class Recursion {

    static int arr[] = {12, 34, 64, 2, 3, 90};

    public static int factorial(int n) {

        if (n == 0) {

            return 1;

        } else {

            System.out.println(n);
            return n * factorial(n - 1);

        }

    }

    public static int encontrarMax(int[] numeros, int indice, int max) {

        if (indice != numeros.length) {

            if (numeros[indice] > max) {

                System.out.println("\n");
                System.out.println(max);
                System.out.println(numeros[indice]);

                max = encontrarMax(numeros, indice + 1, numeros[indice]);

            } else {
                System.out.println("\n");
                System.out.println(max);
                System.out.println(numeros[indice]);

                max = encontrarMax(numeros, indice + 1, max);

            }
        }

        return max;

    }
}