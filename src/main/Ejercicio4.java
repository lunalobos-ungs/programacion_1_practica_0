package main;

public class Ejercicio4 {
    public static void main(String[] args){
        System.out.println(1/2); // debería imprimir 0 ya que son dos enteros
        System.out.println(1.0/2.0); // debería imprimir 0.5 ya que ambos son double
        System.out.println(1.0/2); // debería imprimir 0.5 ya que el 2 es convertido a double
        System.out.println(1/2.0); // debería imprimir 0.5 ya que el 1 es convertido a double
        //System.out.println("1"/"2"); da error de compilación
        System.out.println(1 + 2); // debería imprimir 3 ya que primero se suman los enteros y luego se imprimen
        System.out.println("1" + "2"); // debería imprimir 12 ya que son dos objetos String concatenados
        System.out.println(16/2*4); // precedencia de operadores de izquierda a derecha -> 32
        System.out.println(16/(2*4)); // el paréntesis se resuelve primero -> 2
    }
}
