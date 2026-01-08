package unidad2.condicionales.ejercicios.pensar;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la hora:");
        double hora = sc.nextDouble();
        if (6<=hora && hora<=12) {
            System.out.println("Buenos días");
        } else if (13<=hora && hora<=20) {
            System.out.println("Buenas tardes");

        } else {
            System.out.println("Buenas noches");
        }
    }
}
