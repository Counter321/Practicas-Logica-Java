package unidad1.ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double DESCUENTO = 0.15;
        System.out.println("¿Cuanto cuesta su compra? ");
        double cuesta = sc.nextDouble();

        double descuento = cuesta * DESCUENTO;
        double totalapagar = cuesta - descuento;
        System.out.println("Después del descuento pagará:"+totalapagar);

    }
}
