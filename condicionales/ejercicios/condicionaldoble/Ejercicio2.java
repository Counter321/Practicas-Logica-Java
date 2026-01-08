package unidad2.condicionales.ejercicios.condicionaldoble;

import java.util.Scanner;

public class Ejercicio2 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Para trabajar con caracteres y letras utilizar pagina web (CODIGO ASCII)//
    System.out.println("Dime un carácter:");
    char caracter1 = sc.nextLine().charAt(0);
    System.out.println("Dime otro caracter:");
    char caracter2 = sc.nextLine().charAt(0);
    if (caracter1 == caracter2 )  {
        System.out.println("Ambos caracteres son iguales");

        } else {
        System.out.println("Ambos caracteres no son iguales");
    }
}

}
