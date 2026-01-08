package unidad2.condicionales.ejercicios.pensar;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, ingresa la hora :");
    int horas = sc.nextInt();

        System.out.println("Por favor, ingresa los minutos :");
    int minutos = sc.nextInt();

        System.out.println("Por favor, ingresa los segundos:");
    int segundos = sc.nextInt();
   /*los if anidados dentro de otros cada uno depende del anterior.
   En cambio en los else if cada uno es indepediente y solo se cumple uno si no es una opcion es otra */

        if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {


        segundos++;


        if (segundos == 60) {
            segundos = 0;
            minutos++;


            if (minutos == 60) {
                minutos = 0;
                horas++;


                if (horas == 24) {
                    horas = 0;
                }
            }
        }


        System.out.println("Hora actual + 1 seg: " + horas + ":" + minutos + ":" + segundos);

    } else {

        System.out.println("La hora ingresada no es válida.");
    }

    }
}
