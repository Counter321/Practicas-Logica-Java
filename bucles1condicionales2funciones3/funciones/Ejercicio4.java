package bucles1condicionales2funciones3.funciones;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que hora es?");
        int hora = sc.nextInt();
        sc.nextLine();
        System.out.println("Dime tu nombre");
        String nombre = sc.next();
        String saludar = saludo(hora, nombre);
        System.out.println(saludar);
    }

    public static String saludo(int hora, String nombre) {
        String saludofinal = "";
        if (hora < 0 || hora > 24) {
            saludofinal = "La hora no es correcta";
        } else if (hora >= 6 && hora <= 12) {
            saludofinal = "Buenos dias " + nombre;
        } else if (hora > 12 && hora <= 22) {
            saludofinal = "Buenas tardes " + nombre;
        } else if (hora > 22 || hora < 6) {
            saludofinal = "Buenas noches " + nombre;
        }
        return saludofinal;
    }


    }

