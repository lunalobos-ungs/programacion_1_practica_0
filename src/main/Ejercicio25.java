package main;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte el largo del arreglo: ");
        var n = scanner.nextInt();
        var arreglo = new int[n];
        for(var i = 0; i < n; i++){
            System.out.println("Inserte el siguiente entero: ");
            arreglo[i] = scanner.nextInt();
        }
        System.out.println("El valor máximo es " + maximo(arreglo));
    }
    
    static int maximo(int[] a){
        var valorMaximo = a[0];
        for(var i = 0; i < a.length; i++){
            valorMaximo = Math.max(valorMaximo, a[i]);
        }
        return valorMaximo;
    }
}
