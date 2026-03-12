package main;

import java.util.Scanner;

public class Ejercicio18 {
    
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte una cadena: ");
        var cadena = scanner.nextLine();
        System.out.println(cadena + " tiene " + cantidadVocales(cadena) + " vocales");
    }

    static int cantidadVocales(String s){
        var a = Ejercicio17.cantidadDeApariciones(s, 'a');
        var e = Ejercicio17.cantidadDeApariciones(s, 'e');
        var i = Ejercicio17.cantidadDeApariciones(s, 'i');
        var o = Ejercicio17.cantidadDeApariciones(s, 'o');
        var u = Ejercicio17.cantidadDeApariciones(s, 'u');
        return a + e + i + o + u;
    }
}
