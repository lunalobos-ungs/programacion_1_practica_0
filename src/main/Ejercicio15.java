package main;

import java.util.Scanner;

public class Ejercicio15 {
    
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte n: ");
        var n = scanner.nextInt();
        System.out.println("Inserte m: ");
        var m = scanner.nextInt();
        System.out.println(n + (esDivisible(n, m) ? " es " : " no es ") + "divisible por " + m);
    }

    static boolean esDivisible(int n, int m) {
        return (n % m) == 0;
    }
}
