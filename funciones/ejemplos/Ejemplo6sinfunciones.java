package unidad2.funciones.ejemplos;

import java.util.Scanner;

public class Ejemplo6sinfunciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String email="";
        String contrasenia="";
        String contrasenia2="";
        do {
             mostrarmenu();
            System.out.println("Elige una opcion");
             opcion = sc.nextInt();
             sc.nextLine(); /*TODO IMPORTANTE DESPUES DE LEER ENTERO*/
             switch (opcion) {
                 case 1:
                     System.out.println("Has entrado en inciar sesión");
                     System.out.println("Cuál es tu email?");
                     email = sc.nextLine();
                     System.out.println("Bienvenido "+email);
                     break;
                     case 2:
                         System.out.println("Has entrado en registrar nuevo usuario");
                         System.out.println("Cuál es tu email?");
                         email = sc.nextLine();
                         System.out.println("Dime la contraseña");
                         contrasenia = sc.nextLine();
                         //contrasenia.length() >8;
                         char primerCaracter = contrasenia.charAt(0);
                        //  Character.isDigit(primerCaracter); leer si es numero o no
                        //  Character.isUpperCase(primerCaracter); leer si esta en mayuscula o no
                         if (contrasenia.length()>8 && ((Character.isDigit(primerCaracter)) || Character.isUpperCase(primerCaracter))) {
                             System.out.println("Usuario registrado "+email);
                         }
                         else {
                         System.out.println("Contraseña incorrecta. No se ha podido registrar el usuario" +
                                 " .La contraseña tiene que ser más de 8 de longitud" +
                                 " .Mayuscula o por un numero ");
                     }
                         break;
                         case 3:
                             System.out.println("Has entrado en cambiar contraseña");
                             System.out.println("Dime una contraseña");
                              contrasenia2 = sc.nextLine();
                             char primerCaracterr = contrasenia2.charAt(0);
                             for (int i = 0; i <=1 ; i++) {

                                 if (contrasenia2.length() > 8 && ((Character.isDigit(primerCaracterr)) || Character.isUpperCase(primerCaracterr))) {
                                     System.out.println("Contraseña cambiada correctamente");
                                 } else {
                                     System.out.println("Contraseña incorrecta. No se ha podido cambiar  ");
                                 } i++;
                             }
                             break;
                             case 0:
                                 System.out.println("Adiós");
                                 break;
                                 default:
                                     System.out.println("Opción no válida");
                                     break;
             }
        } while (opcion != 0);

    }
  static void  mostrarmenu() {

      System.out.println("Menu");
      System.out.println("1.iniciar sesion");
      System.out.println("2.Registrar nuevo usuario");
      System.out.println("3.Cambiar contraseña");
      System.out.println("0. Salir");


  }
}
