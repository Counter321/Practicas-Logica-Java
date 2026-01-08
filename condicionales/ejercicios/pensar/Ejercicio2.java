package unidad2.condicionales.ejercicios.pensar;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número");
        double n = sc.nextDouble();
        System.out.println("Dame otro número");
        double n2 = sc.nextDouble();
        if (n2 == 0 ) {
            System.out.println("El segundo número es 0, no se puede realizar la división");

        } else if (n2>0) {

            double divison = n / n2;
            System.out.println("La división es: " + divison);
        }

    }
}
