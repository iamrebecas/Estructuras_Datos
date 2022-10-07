/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package estructuras_datos;

/**
 *
 * @author rsolano
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = {12, 34, 64, 2, 3, 90};

        // Recursividad
        //  System.out.println(Recursion.factorial(5));
        // System.out.println(Recursion.encontrarMax(arr, 1, arr[0]));
        // Pilas
        Stack<Integer> Pila = new Stack<Integer>();
        Pila.push(1);
        Pila.push(2);
        Pila.push(4);
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());

        Pila.push(1);
        Pila.push(2);
        Pila.push(4);
        System.out.println(Pila.encuentra(2));

    }
}

