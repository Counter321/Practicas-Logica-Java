package unidad2.funciones.ejercicios;

import java.util.Scanner;

public class Ejercicio0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            mostrarmenu();
            opcion = sc.nextInt();
            opciones(opcion);


        }while (opcion != 0) ;
    }

    private static void mostrarmenu() {
        System.out.println("Menu de opciones");
        System.out.println("0. para salir");
        System.out.println("1.");
        System.out.println("2. ");
        System.out.println("3.");
        System.out.println("4");
        System.out.println("Elige");
    }
    private static void opciones(int opcion) {

        switch (opcion) {
            case 0:
                break;
            case 1:
                System.out.println("Has elegido la opcion 1");
                break;
            case 2:
                System.out.println("Has elegido la opcion 2");
                break;
            case 3:
                System.out.println("Has elegido la opcion 3");
                break;
            case 4:
                System.out.println("Has elegido la opcion 4");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

}
