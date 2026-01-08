package unidad1.ampliacionprogut1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿A que hora parte de la ciudad A?");
        int HHhoras = sc.nextInt();
        System.out.println("¿A los cuantos minutos parte de la ciudad A?");
        int MMminutos = sc.nextInt();
        System.out.println("¿A los cuantos segundos parte de la ciudad A?");
        int SSsegundos = sc.nextInt();
        int HHhorassegundos = HHhoras*3600;
        int MMminutossegundos =MMminutos*60;
        System.out.println("¿Cuanto es el tiempo de viaje hasta la ciudad B? ");
        int Tsegundos = sc.nextInt();
        int lahoradellegada= Tsegundos+(HHhorassegundos+MMminutossegundos+SSsegundos);
        System.out.println("La hora de llegada a la ciudad B es: " + lahoradellegada );
        //lo converitmos a horas, minutos y sergundos//
        int llegadaenhoras = (lahoradellegada/3600)%24; //24 por la cantidad de horas en el dia//
        int MMminutoss = (llegadaenhoras%3600)/60;
        int SSsegundoss = (lahoradellegada%60);
        System.out.println("La hora final es: " + llegadaenhoras+":"+MMminutoss+":"+SSsegundoss);
    }
}
