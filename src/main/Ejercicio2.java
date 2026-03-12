package main;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte su nombre:");
        var nombre = scanner.nextLine();
        System.out.println("Hola " + nombre);
    }
}
