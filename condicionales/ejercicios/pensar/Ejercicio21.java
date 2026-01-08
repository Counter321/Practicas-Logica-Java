package unidad2.condicionales.ejercicios.pensar;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double norte = 24.00;
        final double central = 20.00;
        final double sur = 21.00;
        final double europa = 10.00;
        final double asia = 18.00;
        System.out.println("Dime el peso del parquete: ");
        double peso = sc.nextDouble();
        System.out.println("¿Cual es la direccion del parquete? Elige entre la zona 1 y 5: ");
        int zona = sc.nextInt();
        double costogramo=0;
        if ( peso<=5) {

            switch (zona) {
            case 1:
                costogramo = norte*peso;
                System.out.println("Tu paquete se dirige a America del Norte");

                break;
            case 2:
                costogramo = central*peso;
                System.out.println("Tu paquete se dirige a America Central");
                break;
            case 3:
                costogramo = sur*peso;
                    System.out.println("Tu paquete se dirige a America Sur");
                break;
            case 4:
                costogramo = europa*peso;
                System.out.println("Tu paquete se dirige a Europa");

                break;
            case 5:
                costogramo = asia*peso;
                System.out.println("Tu paquete se dirige a Europa");

                break;
            default:
                System.out.println("la zona no esta en el rango pedido");
                break;

        }
            System.out.println("El costo total por la entrega es: "+costogramo+ "€");

        } else {
            System.out.println("El paquete supera los 5 kilos ");
        }
}
}
//TODO comprobar si esta bien//