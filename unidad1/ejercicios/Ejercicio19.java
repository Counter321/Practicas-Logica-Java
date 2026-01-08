package unidad1.ejercicios;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduzca un número de dos cifras");
       int numero = sc.nextInt();
       int unidades = numero%10;
       int decenas = numero/10;
       int numeroinvertido = unidades*10+decenas;
        System.out.println("El número invertido es:"+ numeroinvertido );



    }
}

