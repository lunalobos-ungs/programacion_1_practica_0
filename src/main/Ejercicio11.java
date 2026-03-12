package main;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte n: ");
        var n = scanner.nextInt();
        System.out.println("La sumatoria de pares es " + sumatoriaPares(n));
    }

    static int sumatoriaPares(int n){
        var sumatoriaPares = 0;
        for(var i = 1; i <=n; i++){
            if(i % 2 == 0){
              sumatoriaPares += i;  
            }
        }
        return sumatoriaPares;
    }
}
