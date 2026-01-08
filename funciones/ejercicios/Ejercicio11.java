package unidad2.funciones.ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        double num = sc.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double num2 = sc.nextDouble();


            System.out.println(" Operacion 1: suma ");
            System.out.println(" Operacion 2: resta ");
            System.out.println(" Operacion 3: multiplicacion ");
            System.out.println(" Operacion 4: division ");
            System.out.println("¿Que operacion quieres realizar?");
            int operacion = sc.nextInt();
            switch (operacion) {
                case 1:
                    System.out.println(suma(num,num2));
                    break;
                    case 2:
                        System.out.println(resta(num,num2));

                        break;
                        case 3:
                            System.out.println(multiplicacion(num,num2));
                            break;
                case 4:

                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre 0");
                    } else {
                        System.out.println(division(num, num2));
                    }
                    break;

                default:
                    System.out.println("Operacion introducida invalida");
                    break;
            }



    }

    private static double multiplicacion(double i, double j) {
        return i*j;
    }

    private static double division(double i, double j) {
        return i/j;

    }

    private static double resta(double i, double j) {

        return i-j;
    }

    private static double suma(double i, double j) {
        return i+j;
    }
}
