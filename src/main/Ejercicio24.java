package main;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Inserte una palabra: ");
        var palabra = scanner.nextLine();
        System.out.println(palabra + (esDobleCapicua(palabra) ? " es " : " no es ") + "doble capicua");
    }

    static boolean esDobleCapicua(String s) {
        for (var i = 0; i < s.length(); i++) {
            var palabraInicial = s.substring(0, i);
            var palabraFinal = s.substring(i);
            if (Ejercicio20.esCapicua(palabraInicial) && Ejercicio20.esCapicua(palabraFinal)) {
                return true;
            }
        }
        return false;
    }
}
