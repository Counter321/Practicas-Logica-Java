package unidad2.funciones.ejemplos;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Ejemplo1 {
    public static void main(String[] args) {
 tressaludos("Hola");
 tressaludos("Buenas tardes");
 tressaludos("Buenas noches ");
 menuusario();
    }
    public static void tressaludos(String mensaje) {
        System.out.println("Voy a saludarte 3 veces");
        for (int i = 0; i < 3 ; i++) {
            System.out.println(mensaje);
        }
    }
    static void menuusario() {
        System.out.println("Bienvenido a mi app");
        System.out.println("1.Mandar un mensaje");
        System.out.println("2. Mandar un saludo");
        System.out.println("0. Salir");
        System.out.println("Elige una opcion");
    }
}
// el static depende del dato que se quiere que devuelve y entre el parentesis las variables a utilizar  y "void"
// significa que no va devolver nada* . tambien "saludar" es el nombre de la funcion/
