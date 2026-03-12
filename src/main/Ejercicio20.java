package main;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte una palabra: ");
        var palabra = scanner.nextLine();
        System.out.println(palabra + (esCapicua(palabra) ? " es " : " no es ") + "capicua");
    }

    static boolean esCapicua(String s){
        return s.equals(Ejercicio16.reversa(s));
    }
}
