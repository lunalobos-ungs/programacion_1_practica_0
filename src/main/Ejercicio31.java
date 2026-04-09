package main;

import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Inserte n: ");
        var n = scanner.nextInt();
        var fibonacciRecursivo = fibrec(n);
        System.out.println("El n-ésimo término de la sucesión de fibonacci es " + fibrec(n));
        System.out.println("Que calculado por interación es " + fibiter(n));
    }

    static int fibrec(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibrec(n - 1) + fibrec(n - 2);
        }
    }

    static int fibiter(int n){
        var terminoNMenos1 = 1;
        var terminoNMenos2 = 0;

        for(var i = 2; i < n; i++){
            var terminoActual = terminoNMenos1 + terminoNMenos2;
            terminoNMenos2 = terminoNMenos1;
            terminoNMenos1 = terminoActual;
        }
        return terminoNMenos1 + terminoNMenos2;
    }
}
