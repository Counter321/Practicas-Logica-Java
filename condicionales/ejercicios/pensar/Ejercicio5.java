package unidad2.condicionales.ejercicios.pensar;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nota:");
        double nota = sc.nextDouble();
        System.out.println("Dime tu edad:");
        int edad = sc.nextInt();
        System.out.println("Dame un carácter:");
        String sexo = sc.next();
        if (5<=nota && 18<=edad && sexo.equals("F")) {
            System.out.println("ACEPTADA");
        } else if (5<=nota && 18<=edad && sexo.equals("M")) {
            System.out.println("ACEPTADO");
        } else  {
            System.out.println("NO ACEPTADO/A");
        }
    }
}
