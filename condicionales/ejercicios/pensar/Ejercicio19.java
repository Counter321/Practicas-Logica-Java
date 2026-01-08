package unidad2.condicionales.ejercicios.pensar;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca el número del dado");
        int n = sc.nextInt();
        if (1<=n && n<=6) {
            switch (n) {
                case 1:
                    System.out.println("En la cara opuesta esta el dos");
                    break;
                case 2:
                    System.out.println("En la cara opuesta esta el cinco");
                    break;
                case 3:
                    System.out.println("En la cara opuesta esta el cuatro");
                    break;
                case 4:
                    System.out.println("En la cara opuesta esta el tres");
                    break;
                case 5:
                    System.out.println("En la cara opuesta esta el dos");
                    break;
                case 6:
                    System.out.println("En la cara opuesta esta el uno");
                    break;
            }


        } else  {
            System.out.println("ERROR: número incorrecto");
        }
    }
}
