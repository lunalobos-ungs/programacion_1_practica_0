package main;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Inserte x: ");
        var x = scanner.nextDouble();
        System.out.println("Inserte a: ");
        var a = scanner.nextInt();
        System.out.println("x^a es " + potencia(x, a));
    }

    static double potencia(double x, int a) {
        return Math.pow(x, a);
    }
}
