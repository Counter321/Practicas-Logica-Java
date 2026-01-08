package Examen;


import java.util.Random;
import java.util.Scanner;

public class Eval1MatoGonzalesAldair {
    public static void main(String[] args) {
        /*ESCRIBIR PRIMERO MAIN DESPUES LAS FUNCIONES
        no se pone sc.next() porque lee una cosa
        Despues de un numero sc.nextline. si hay error cero
         */
        /* MENU USUARIO */
        Scanner sc = new Scanner(System.in);
        int opcion ;

        do {
            System.out.println("1.Ejercicio 1");
            System.out.println("2.Ejercicio 2");
            System.out.println("3.Salir");
            System.out.println("¿Qué quieres hacer? ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;


            }

        } while (opcion != 3);

        System.out.println("Adiós");

    }
   /*Funcion para sumar los minutos en las redes sociales*/
    public static int engancheRedesSociales(int a,int b,int c){
        return a+b+c;
    }
    /*Ejercicio 1*/
    public static void ejercicio1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime los minutos al día que pasas en instagram");
        int ig = sc.nextInt();
        System.out.println("Dime los minutos al dia que pasas en tiktok");
        int tiktok = sc.nextInt();
        System.out.println("Dime los minutos al dia que pasas en youtube");
        int youtube = sc.nextInt();
        System.out.println("- Pasas "+ig+" minutos al día viendo Instagram");
        System.out.println("- Pasas "+tiktok+" minutos al día viendo Tiktok");
        System.out.println("- Pasas "+youtube+" minutos al día viendo Youtube");
        int minutostotales = engancheRedesSociales(ig,tiktok,youtube);
        sc.nextLine();
        System.out.println("Dime tu nombre");
        final String nombre = sc.nextLine(); //la variable con final debe ir en mayuscula osea NOMBRE//
        System.out.println("El total de minutos que pasas a la pantalla son "+minutostotales+" minutos.");
        if(minutostotales==0) {
            System.out.println(nombre+", no pasa nada por meterte algún rato.");
        } else if(minutostotales>180) {
            System.out.println(nombre+", Cuidado, te estás enganchando.");
        } else if(minutostotales>=1 && minutostotales<=180) {
            System.out.println(nombre+", Buen equilibrio");

        }
    }
    /*Ejercicio2*/
    public static void ejercicio2(){
        int energia =3;
        int puntos =0;
 
        System.out.println("¡Bienvenido a Energizer!");
        System.out.println("Tu objetivo es recolectar 10 puntos antes de que se acabe la energía.");

        while (energia>0) {
            Random random = new Random();
            int numeroAleatorio = random.nextInt(7) -2;
            if(numeroAleatorio>0) {
                puntos=puntos+numeroAleatorio;
            } else if (numeroAleatorio==0) {

            } else if(numeroAleatorio<0) {
                energia--;
            }
            System.out.println("******************************************************");
            System.out.println("Número aleatorio: "+numeroAleatorio);
            System.out.println("Energía: "+energia);
            System.out.println("Puntos acumulados: "+puntos);

        }
        if (puntos>=10) {
            System.out.println("*_*_*_*_* Enhorabuena, has ganado con "+puntos+" puntos. *_*_*_*_*");
        } else {
            System.out.println("--------- Has perdido, no has llegado a los 10 puntos. --------- ");
        }
    }

}


