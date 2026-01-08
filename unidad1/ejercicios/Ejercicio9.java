package unidad1.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio ");
        double radio = sc.nextDouble();
        System.out.println("Longitud de la circunferencia--->"+ radio*2*Math.PI);
        System.out.println("Área de la circunferencia--->"+ radio*radio*Math.PI);
    }
}
