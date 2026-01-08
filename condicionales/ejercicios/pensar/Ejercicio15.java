package unidad2.condicionales.ejercicios.pensar;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Que cantidad de comida compran? ");
        double comidadiaria = sc.nextDouble();
     System.out.println("Dime el numero de animales a alimentar: ");
        int numAnimales = sc.nextInt();
        System.out.println("Dime la cantidad media que come cada animal.");
        double media = sc.nextDouble();


     if (numAnimales<=0){
         System.out.println("El numero de animales no puede ser negativo");
         return;
     } else {
         double comidanecesaria = numAnimales * media;
         if (comidadiaria >= comidanecesaria) {
             System.out.println("La comida es suficiente para cada animal");

         } else {
             double racion = comidadiaria / numAnimales;
             System.out.println("La ración necesaria para cada animal" + racion);
         }


     }
    }
}
