package main;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte una palabra: ");
        var cadena = scanner.nextLine();
        imprimirReversa(cadena);
    }
    
    static void imprimirReversa(String cadena){
        System.out.println(reversa(cadena));
    }

    static String reversa(String cadena){
        var cadenaInvertida = "";
        for(var i = 0; i < cadena.length(); i++){
            var indice = cadena.length() - 1 - i;
            cadenaInvertida += cadena.charAt(indice);
        }
        return cadenaInvertida;
    }
}
