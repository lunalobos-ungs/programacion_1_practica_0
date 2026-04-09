package main;

import java.util.Scanner;

public class Ejercicio35 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cadena:");
        String cadena = scanner.nextLine();
        System.out.println("El resultado sin repetidos contiguos es " + sinRepetidosContiguos(cadena));
    }

    static String sinRepetidosContiguos(String s){
        if(s.length() <= 1){
            return s;
        }
        char c = s.charAt(0);
        if(c == resto(s).charAt(0)){
            return sinRepetidosContiguos(resto(s));
        } else {
            return s.charAt(0) + sinRepetidosContiguos(resto(s));
        }
    }

    static String resto(String s){
        return s.substring(1);
    }
}
