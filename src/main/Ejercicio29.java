package main;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte el largo del arreglo: ");
        var n = scanner.nextInt();
        var arreglo = new double[n];
        for(var i = 0; i < n; i++){
            System.out.println("Inserte el siguiente número: ");
            arreglo[i] = scanner.nextDouble();
        }
        System.out.println("El promedio es " + promedio(arreglo));
    }



    static double promedio(double[] a){
        var suma = 0.0;
        for( var i = 0; i < a.length; i++){
            suma += a[i];
        }
        return suma / (double)a.length;
    }
}
