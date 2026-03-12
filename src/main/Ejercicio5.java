package main;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Inserte el primer número: ");
        var a = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserte el segundo número: ");
        var b = Double.parseDouble(scanner.nextLine());
        System.out.println("El promedio es: " + promedio(a, b));
    }

    public static double promedio(double a, double b) {
        return (a + b) / 2;
    }
}
