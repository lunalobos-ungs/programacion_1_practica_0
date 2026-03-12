package main;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte el primer número: ");
        var a = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserte el segundo número: ");
        var b = Double.parseDouble(scanner.nextLine());
        imprimirPromedio(a, b);
    }
    
    static void imprimirPromedio(double a, double b){
        var promedio = (a + b) / 2;
        System.out.println("El promedio es: " + promedio);
    }
}
