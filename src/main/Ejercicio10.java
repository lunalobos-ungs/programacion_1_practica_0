package main;

import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte n: ");
        var n = scanner.nextInt();
        System.out.println("La sumatoria es " + sumatoria(n));
    }

    static int sumatoria(int n){
        var sumatoria = 0;
        for(var i = 1; i <=n; i++){
            sumatoria += i;
        }
        return sumatoria;
    }
}
