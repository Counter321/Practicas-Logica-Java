package unidad1.ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas monedas tienes de 2€?");
        int monedas = sc.nextInt();
        double cantidadmon1 = monedas*2;
        System.out.println("¿Cuantos monedas tienes de 1€?");
        int monedas2 = sc.nextInt();
        double cantidadmon2 = monedas2*1;
        System.out.println("¿Cuantos monedas tienes de 50 centimos?");
        int monedas3 = sc.nextInt();
        double cantidadmon3 = monedas3*0.50;
        System.out.println("¿Cuantos monedas tienes de 20 centimos?");
        int monedas4 = sc.nextInt();
        double cantidadmon4 = monedas4*0.20;
        System.out.println("¿Cuantos monedas tienes de 10 centimos?");
        int monedas5 = sc.nextInt();
        double cantidadmon5 = monedas5*0.10;
        System.out.println();
        double dinerototal = cantidadmon1+cantidadmon2+cantidadmon3;
        System.out.println("El dinero total es: " + dinerototal+"€");
    }
}
