/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas;

/**
 *
 * @author adria
 */
public class Recursividad {
    
    // ejercicio 1

    int invertir(int numero, int inver) {
        if (numero > 0) {
            return invertir(numero / 10, numero % 10 + inver * 10);
        } else {
            return inver;
        }
    }

    public String invpalabra(String palabra) {
            if (palabra.length() <= 1) {
                System.out.println(palabra);
                return palabra;
            }
            System.out.println(palabra);
            return invpalabra(palabra.substring(1)) + palabra.charAt(0);
        }
    
    // --------------------------- Ejercicio 4 ---------------------------------- 
    public static int suma(int i, int cantidad, int numero, int suma) {

        if (i < cantidad) {
            suma = suma(i + 1, cantidad, numero, suma + numero);
        }
        return suma;
    }

    // ejercicio 5
    public static String tablas(int num1, int x) {

        if (num1 == 1) {
            return x + " x " + 1 + " = " + x + "\n";

        } else {
            int b;
            b = num1;
            return tablas(num1 - 1, x) + x + " X " + b + " = " + (x * b) + "\n";

        }

    }
    
    
}
