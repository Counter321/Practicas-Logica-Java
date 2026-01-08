package unidad1.ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu primera calificacion");
        double primera = sc.nextDouble();
        System.out.println("Dime tu segunda calificacion");
        double segunda = sc.nextDouble();
        System.out.println("Dime tu tercera calificacion");
        double tercera = sc.nextDouble();
        double calificacion = (primera + segunda + tercera)/3;
        double calificaciontotal = calificacion*0.55;
        System.out.println("Tu calificación del 55% es:"+ calificaciontotal);
        System.out.println("dime tu calificación del examen final");
        double finalExam = sc.nextDouble();
        double finalExamtotal = finalExam*0.30;
        System.out.println("Tu calificación del 30% es:"+ finalExamtotal );
        System.out.println("Dime tu calificación del trabajo:");
        double finalwork = sc.nextDouble();
        double finalworktotal = finalwork*0.05;
        System.out.println("Ti calficiación del 15% es:"+ finalworktotal);
        System.out.println("Tu nota final es:"+ (calificaciontotal+finalExamtotal+finalworktotal));



    }
}
