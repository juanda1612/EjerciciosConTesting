package ejercicio01;
/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
        ArrayList<String> n = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
           if (i % 3 == 0 && i % 5 == 0){
               n.add(i,"fizzbuzz");
           } else if (i % 3 == 0) {
               n.add(i,"fizz");
           } else if (i % 5 == 0) {
               n.add(i,"buzz");
           } else {
               n.add(String.valueOf(i));
           }
        }
        for (String n2 : n){
            System.out.println(n2);
        }

    }
}
