package main;

import java.util.Scanner;

public class Ejercicio30 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Inserte n: ");
        var n = scanner.nextInt();
        System.out.println("Inserte x: ");
        var x = scanner.nextDouble();
        System.out.println("La sumatoria de 0 hasta n es " + sumatoriaRec(n));
        System.out.println("La sumatoria de 0 hasta n de números pares es " + sumatoriaParesRec(n));
        System.out.println("La potencia n de x es " + potenciaRec(x, n));
        System.out.println("El factorial de n es " + factorialRec(n));
    }

    static int sumatoriaRec(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumatoriaRec(n - 1);
        }
    }

    static int sumatoriaParesRec(int n) {
        if (n == 2) {
            return 2;
        } else if (n % 2 == 0) {
            return n + sumatoriaParesRec(n - 1);
        } else {
            return sumatoriaParesRec(n - 1);
        }
    }

    static double potenciaRec(double x, int n) {
        if (n == 0) {
            return 1.0;
        } else if (n == 1) {
            return x;
        } else {
            return x * potenciaRec(x, n - 1);
        }
    }

    static int factorialRec(int n){
        if(n == 0){
            return 1;
        } else {
            return n * factorialRec(n-1);
        }
    }
}
