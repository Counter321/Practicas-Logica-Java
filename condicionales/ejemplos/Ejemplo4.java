package unidad2.condicionales.ejemplos;

import java.util.Scanner;

public class Ejemplo4 {
    /**
     * Ejemplo de de estructura condicional  IF-ELSE anidadas
     */
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce puntuacion: ");
            double puntuacion = sc.nextDouble();

            if ((puntuacion >= 9) && (puntuacion <= 10)) {
                System.out.println("Tienes un SOBRESALIENTE");
            } else if (puntuacion >= 7 && puntuacion <9) {
                System.out.println("Tienes un NOTABLE");
            } else if (puntuacion >= 5 && puntuacion < 7) {
                System.out.println("Tienes un APROBADO");
            } else if (puntuacion >= 0 && puntuacion < 5){
                System.out.println("Estás SUSPENSO. Lo siento");
            } else {
                System.out.println("Nota introducida incorrecta");
            }
        }
}
