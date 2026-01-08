package unidad2.condicionales.ejercicios.pensar;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero entero entre 1 y 12: ");
        int num = sc.nextInt();
        if (0>=num || num>12 ) {
            System.out.println("El numero no esta comprendido entre 1 y 12");
        } else if (num==2) {
            System.out.println("El numero de dias es 28");
        } else if (1==num || 3==num || 5==num || 7==num || 8==num || 10==num || 12==num) {
            System.out.println("El numero de dias es 31");
        } else {
            System.out.println("El numero de dias es 30");
        }




    }
}
