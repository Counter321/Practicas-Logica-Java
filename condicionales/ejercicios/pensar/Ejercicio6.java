package unidad2.condicionales.ejercicios.pensar;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero ");
       double n1 = sc.nextDouble();
        System.out.println("Ingresa un segundo numero ");
        double n2= sc.nextDouble();
        System.out.println("Ingresa un tercer numero ");
        double n3 = sc.nextDouble();
        if((n1>n2 && n1>n3) && (n2>n3)){
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);  }
            else if ((n1>n2 && n1>n3) && (n3>n2))  {
                System.out.println(n1);
                    System.out.println(n1);
                    System.out.println(n3);
                    System.out.println(n2);
                } else if (((n2>n1 && n2>n3) && (n1>n3))) {

                    System.out.println(n2);
                    System.out.println(n1);
                    System.out.println(n3);
            } else if (((n2>n1 && n2>n3) && (n3>n1))){
                    System.out.println(n2);
                    System.out.println(n3);
                    System.out.println(n1);

                } else if (((n3>n1 && n3>n2) && (n1>n2))) {
            System.out.println(n3);
            System.out.println(n1);
            System.out.println(n2);
                } else if (((n3>n1 && n3>n2) && (n2>n1))) {
            System.out.println(n3);
            System.out.println(n2);
            System.out.println(n1);


        }
        }


            }


