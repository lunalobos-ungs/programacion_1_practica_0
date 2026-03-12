package main;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Inserte cadena: ");
        var s = scanner.nextLine();
        System.out.println("Inserte caracter: ");
        var c = scanner.nextLine().charAt(0);
        System.out.println(c + " aparece " + cantidadDeApariciones(s, c) + " veces en " + s);
    }

    static int cantidadDeApariciones(String s, char c) {
        var contador = 0;
        var indice = -1;
        do {
            indice = s.indexOf(c, indice + 1);
            if (indice != -1) {
                contador++;
            }
        } while (indice != -1);
        return contador;
    }
}
