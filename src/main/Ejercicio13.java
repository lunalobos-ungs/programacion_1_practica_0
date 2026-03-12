package main;

import java.util.Scanner;

public class Ejercicio13 {
    
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte n: ");
        var n = scanner.nextInt();
        System.out.println("El factorial de " + n + " es " + factorial(n));
    }

    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        var factorial = 1;
        for(var i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }
}
