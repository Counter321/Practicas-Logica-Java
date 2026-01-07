package string.ejercicios.ejercicios_normales;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String contrasenia;
        boolean esValida = false;
        String expresionRegular = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&+=])(?=\\S+$).{8,16}$";
        do {
            System.out.println("Dime una contraseña");
            contrasenia = sc.nextLine();
            esValida = contrasenia.matches(expresionRegular);
            if (esValida) {
                System.out.println("Contraseña correcta");
            } else {
                System.out.println("Esta contraseña no cumple con los requistios");
            }




        }

        while(esValida==false);
//TODO volver para probar con el metodo tradicional//


    }
}
