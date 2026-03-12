package main;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte el número: ");
        var n = scanner.nextInt();
        System.out.println("La cantidad de cifras de " + n + " es " + cantCifras(n));
    }

    static int cantCifras(int n){
        return ((Integer)n).toString().length();
    }
}
