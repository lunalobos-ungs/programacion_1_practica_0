package main;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inserte el día: ");
        var dia = scanner.nextInt();
        System.out.println("Inserte el mes: ");
        var mes = scanner.nextInt();
        System.out.println("Inserte el año: ");
        var anio = scanner.nextInt();
        imprimirFecha(dia, mes, anio);
    }

    static void imprimirFecha(int dia, int mes, int anio){
        var mesFormateado = "";

        switch(mes){
            case 1: mesFormateado = "Enero"; break;
            case 2: mesFormateado = "Febrero"; break;
            case 3: mesFormateado = "Marzo"; break;
            case 4: mesFormateado = "Abril"; break;
            case 5: mesFormateado = "Mayo"; break;
            case 6: mesFormateado = "Junio"; break;
            case 7: mesFormateado = "Julio"; break;
            case 8: mesFormateado = "Agosto"; break;
            case 9: mesFormateado = "Septiembre"; break;
            case 10: mesFormateado = "Octubre"; break;
            case 11: mesFormateado = "Noviembre"; break;
            case 12: mesFormateado = "Diciembre"; break;
        }

        var fecha = dia + " de " + mesFormateado + " de " + anio;

        System.out.println(fecha);
    }
}
