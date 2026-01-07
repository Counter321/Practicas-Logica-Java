package bucles1condicionales2funciones3.funciones;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un primer numero");
        int n1=sc.nextInt();
        System.out.println("Dame un segundo numero");
        int n2=sc.nextInt();

        int eleccion;
        do{
            System.out.println("Que operacion quieres realizar?");
            System.out.println("1. Suma");
            System.out.println("2. resta");
            System.out.println("3. division");
            System.out.println("4. multiplicacion");
            System.out.println("5.Salir del programa");
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    double suma = suma(n1,n2);
                    System.out.println(suma);
                    break;
                case 2:
                    double resta = resta(n1,n2);
                    System.out.println(resta);
                    break;
                case 3:
                    if(n2==0) {
                        System.out.println("Esta division no se puede hacer");
                    } else {
                        double division= division(n1,n2);
                        System.out.println(division);
                    }

                    break;
                case 4:;
                double multiplicacion= multiplicador(n1,n2);
                    System.out.println(multiplicacion);
                break;
                case 5:
                    break;
                default:
                    System.out.println("No has elegido ninguna de las opciones");
                    break;
            }


        } while (eleccion!=5 );

    }

    private static double multiplicador(int n1, int n2) {
        return n1*n2;
    }

    private static double division(int n1, int n2) {
        return (double) n1/n2;
    }

    private static double resta(int n1, int n2) {
        return n1-n2;
    }

    private static double suma(int n1, int n2) {
        return n1 + n2;
    }
}
