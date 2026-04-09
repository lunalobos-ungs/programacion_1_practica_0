package main;

import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte a: ");
        int a = scanner.nextInt();
        System.out.println("Inserte b:");
        int b = scanner.nextInt();
        System.out.println("El mínimo común denominador es: " + mcd(a,b));
    }

    static int mcd(int a, int b){
        if(a == 0){
            return b;
        } else if (b == 0){
            return a;
        } else {
            int r;
            if(a > b){
                r = a % b;
                return mcd(b, r);
            } else {
                r = b % a;
                return mcd(a, r);
            }
        }
    }
}
