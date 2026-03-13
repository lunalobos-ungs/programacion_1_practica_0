package main;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte una palabra: ");
        var palabra = scanner.nextLine();
        System.out.println( palabra + (esSinRepetidos(palabra) ? " es sin repetidos" :  " tiene repetidos"));
    }

    static boolean esSinRepetidos(String s){
        for(var i = 0; i < s.length(); i++){
            var c = s.charAt(i);
            if(s.indexOf(c) != i){
                return false;
            }
        }
        return true;
    }
}
