package unidad2.condicionales.ejercicios.condicionalanidados;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = entrada.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int c = entrada.nextInt();
        double adentroraiz= Math.pow(b,2)-(4*a*c);
        double raiz =(Math.sqrt(Math.pow(b,2)-(4*a*c)));
            if (adentroraiz<0) {
            System.out.println("Esta ecuación no tiene soluciones reales" );
        } else  {
                double resultado =  ((-b+(raiz))/(2*a));
                double resultado2 = ((-b+(-raiz))/(2*a));
                if (resultado == resultado2) {
                    System.out.println("la ecuación de segundo grado tiene una unica solución");

                } else {
                    System.out.println("La ecuacion tiene dos soluciones:");
                    System.out.println("el resultado primero es: " + resultado);
                    System.out.println("el resultado segundo es: " + resultado2);

                }
            }


    }
}
