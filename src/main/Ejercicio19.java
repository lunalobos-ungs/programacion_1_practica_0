package main;

import java.util.Scanner;

public class Ejercicio19 {
    
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte una palabra: ");
        var palabra = scanner.nextLine();
        System.out.println(palabra + (esAbecedaria(palabra) ? " es " : " no es ") + "abecedaria" );
    }


    static boolean esAbecedaria(String s){
        for(var i = 0; i < s.length() - 1; i++){
            var previo = corregirVocales(s.charAt(i));
            var actual = corregirVocales(s.charAt(i + 1));
            if(previo > actual){
                return false;
            }
        }
        return true;
    }

    static char corregirVocales(char c){
        switch (c) {
            case 'á': return 'a';
            case 'é': return 'e';
            case 'í': return 'i';
            case 'ó': return 'o';
            case 'ú': return 'u';
            case 'ü': return 'u';
            default: return c;
        }
    }
}
