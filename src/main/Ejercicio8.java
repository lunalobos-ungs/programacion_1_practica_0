package main;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte la primer nota: ");
        var x = scanner.nextDouble();
        System.out.println("Inserte la segunda nota: ");
        var y = scanner.nextDouble();
        imprimirNota(x, y);
    }

    static void imprimirNota(double x, double y) {
        var promedio = (x + y) / 2;
        if (promedio >= 7.0) {
            System.out.println("Promocionado");
        } else if (promedio < 7.0 && promedio >= 4.0) {
            System.out.println("Aprobado");
        } else if (promedio < 4.0) {
            System.out.println("Debe recuperar");
        }
    }
}
