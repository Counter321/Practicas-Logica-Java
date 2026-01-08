package unidad2.condicionales.ejercicios.pensar;

import java.util.Scanner;

public class Ejercicio20switch {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero entero entre 1 y 12: ");
    int num = sc.nextInt();
        if (1<=num && num<=12) {
        switch (num) {
            case 1,3,5,7,8,10,12:
                System.out.println("El numero de dias es 31 ");
                break;
            case 2:
                System.out.println("El numero de dias es 28 ");
                break;
            case 4,6,9,11:
                System.out.println("El numero de dias es 30 ");
                break;
            default:
                System.out.println("El numero no esta comprendido entre 1 y 12");
                break;
        }
    }
}
}

