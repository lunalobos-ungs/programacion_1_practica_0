package main;

import java.util.Scanner;

public class Ejercicio34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte cadena: ");
        String cadena = scanner.nextLine();
        System.out.println("El resultado es " + asteriscos(cadena));
    }


    static String asteriscos(String s) {
        if (s.length() == 1) {
            return s;
        }
        return s.charAt(0) + "*" + asteriscos(resto(s));
    }

    static String resto(String s) {
        return s.substring(1);
    }
}
