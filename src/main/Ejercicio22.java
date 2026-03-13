package main;

import java.util.Scanner;

public class Ejercicio22 {
    
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte una palabra: ");
        var palabra = scanner.nextLine();
        System.out.println(palabra + " sin repetidos es " + sinRepetidos(palabra));
    }
    
    static String sinRepetidos(String s){
        var resultado = "";
        for(var i = 0; i < s.length(); i++){
            var c = s.charAt(i);
            var indice = s.indexOf(c);
            if(i == indice){
                resultado += c;
            }
        }
        return resultado;
    }
}
