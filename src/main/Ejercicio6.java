package main;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte el primer número: ");
        var a = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserte el segundo número: ");
        var b = Integer.parseInt(scanner.nextLine());
        imprimirSuma(a, b);
    }

    static void imprimirSuma(int a, int b){
        System.out.println("La suma es: " + (a + b));
    }
}
