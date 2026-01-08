package unidad2.condicionales.ejercicios.pensar;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        final String USUARIO = "pepe"; //constante utilizar eso//
        final String CONTRASENA = "contrasena";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un nombre de usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Escribe una contraseña");
        String contrasena = sc.nextLine();
        if (usuario.equals("pepe") && contrasena.equals("asdasd")) {
            System.out.println("El usuario y la contraseña es correcto");
        } else  {
            if (!usuario.equals("pepe") && !contrasena.equals("asdasd")) {
                System.out.println("El usuario y la contraseña no son correctos");
            }
            else {
                if (!usuario.equals("pepe") && contrasena.equals("asdasd")) {
                    System.out.println("La contraseña es correcta pero el usuario no");
                }
                else {
                    System.out.println("El usuario es correcto pero la contraseña no");
                }
            }


        }

        }
    }

