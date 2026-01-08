package unidad2.condicionales.ejercicios.pensar;

import java.util.Scanner;

public class Ejercicio17 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dame un numero");
            int n = sc.nextInt();
            if (n>=0) {
                System.out.println("El valor absoluto es: "+ n);

            } else  {
                int valorabsoluto = n*(-1);//Para convertir el numero en valor absoluto lo multiplicamos por (-1)//
                System.out.println("Valor abosoluto es:  "+valorabsoluto);

            }



        }
    }

