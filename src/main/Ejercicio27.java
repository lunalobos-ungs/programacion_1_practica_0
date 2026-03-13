package main;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte el largo del arreglo: ");
        var n = scanner.nextInt();
        var arreglo = new int[n];
        for(var i = 0; i < n; i++){
            System.out.println("Inserte el siguiente entero: ");
            arreglo[i] = scanner.nextInt();
        }
        System.out.println("La suma de los elementos es " + suma(arreglo));
    }

    static int suma(int[] a){
        var suma = 0;
        for(var i = 0; i < a.length; i++){
            suma += a[i];
        }
        return suma;
    }
}
