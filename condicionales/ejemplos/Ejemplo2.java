package unidad2.condicionales.ejemplos;

import java.util.Scanner;

public class Ejemplo2 {
    /*
    Ejemplo de estructura condicional simple (if)
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce num1: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce num2: ");
        int num2 = sc.nextInt();
        System.out.println("Introduce num3: ");
        int num3 = sc.nextInt();

        if ((num3 > num1) && (num3 > num2)) {  //condición más compleja que el ejemplo anterior
            System.out.println("num3 es el mayor");
        }
    }
}
