package main;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte el largo del arreglo: ");
        var n = scanner.nextInt();
        var arreglo = new int[n];
        for(var i = 0; i < n; i++){
            System.out.println("Inserte el siguiente entero: ");
            arreglo[i] = scanner.nextInt();
        }
        System.out.println("El valor máximo se da en el indice " + maximoIndice(arreglo));

    }
    
    static int maximoIndice(int[] a){
        var indiceDeMaximo = 0;
        var valorMaximo = a[0];
        for(var i = 0; i < a.length; i++){
            if(a[i] > valorMaximo){
                valorMaximo = a[i];
                indiceDeMaximo = i;
            }
        }
        return indiceDeMaximo;
    }
}
