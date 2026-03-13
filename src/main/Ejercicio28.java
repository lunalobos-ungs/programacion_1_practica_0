package main;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte el largo del arreglo: ");
        var n = scanner.nextInt();
        var arreglo = new int[n];
        for(var i = 0; i < n; i++){
            System.out.println("Inserte el siguiente entero: ");
            arreglo[i] = scanner.nextInt();
        }
        System.out.println("el arreglo" + (estaOrdenado(arreglo) ? " esta ordenado" : " no esta ordenado"));
    }

    static boolean estaOrdenado(int[] a){
        for(var i = 0; i < a.length - 1; i++){
            if(a[i] > a[i + 1]){
                return false;
            }
        }
        return true;
    }
}