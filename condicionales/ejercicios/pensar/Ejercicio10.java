package unidad2.condicionales.ejercicios.pensar;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un día:");
        int dia = teclado.nextInt();

        System.out.println("Dame un mes:");
        int mes = teclado.nextInt();

        System.out.println("Dame un año:");
        int ano = teclado.nextInt();

        dia++;


        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia > 31) {
                    dia = 1;
                    mes++;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia > 30) {
                    dia = 1;
                    mes++;
                }
                break;
            case 2:
                if (dia > 28) {
                    dia = 1;
                    mes++;
                }
                break;
        }


        if (mes > 12) {
            mes = 1;
            ano++;
        }


        System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + ano);

        teclado.close();
    }
}

