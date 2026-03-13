package main;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Inserte a: ");
        var a = scanner.nextLine();
        System.out.println("Inserte b: ");
        var b = scanner.nextLine();
        System.out.println("Inserte c: ");
        var c = scanner.nextLine();
        System.out.println(a + ", " + b + " y " + c + (puedenColocarse(a, b, c) ? " conforman " : " no conforman ")
                + "un juego de palabras");
    }

    static boolean puedenColocarse(String a, String b, String c) {
        var presenteEnA = false;
        var indiceEnB = -1;
        for (var i = 0; i < b.length(); i++) {
            var caracter = b.charAt(i);
            if (a.indexOf(caracter) != -1) {
                presenteEnA = true;
                indiceEnB = i;
                break;
            }
        }
        var presenteEnC = false;
        if (!presenteEnA) {
            return false;
        }
        for (var i = indiceEnB + 1; i < b.length(); i++) {
            var caracter = b.charAt(i);
            if (c.indexOf(caracter) != -1) {
                presenteEnC = true;
                break;
            }
        }
        return presenteEnC;
    }
}
