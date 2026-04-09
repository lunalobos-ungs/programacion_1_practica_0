package main;

import java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte n: ");
        int n = scanner.nextInt();
        System.out.println("Mostrando los números de la sucesión");
        collatz(n);
    }

    // n es natural o no se sabe que resultado
    static void collatz(int n) {
        System.out.println(n);
        if (n % 2 == 0) {
            collatz(n / 2);
        } else if(n != 1){
            collatz(3 * n + 1);
        }
    }
}
