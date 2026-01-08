package unidad2.funciones.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("--- Probando Fase 1 ---");
        System.out.println("1. GamerTag: " + getGamerTag());
        System.out.println("2. Saludo Instagram: " + getSaludoPerfil());
        System.out.println("\n--- Probando Fase 2 ---");
        System.out.println("3. ¿Es Viral? (120k likes): " + esViral());
        System.out.println("3. ¿Es Viral? (10k likes): " + esViral());
        System.out.println("4. ¿Mayor de Edad? (25 años): " + esMayorDeEdad());
        System.out.println("4. ¿Mayor de Edad? (15 años): " + esMayorDeEdad());
        System.out.println("5. ¿Envío Gratis? (Compra 60€): " + esEnvioGratis());
        System.out.println("5. ¿Envío Gratis? (Compra 30€): " + esEnvioGratis());
        System.out.println("6. ¿Comentario Válido? (Hola): " + esComentarioValido());
        System.out.println("6. ¿Comentario Válido? (Vacío): " + esComentarioValido());
        System.out.println("\n--- Probando Fase 3 ---");
        System.out.println("7. Estado Pedido (Cód 1): " + getEstadoPedido());
        System.out.println("7. Estado Pedido (Cód 9): " + getEstadoPedido());
        System.out.println("8. Notificación (like): " + getNotificacion());
        System.out.println("8. Notificación (follow): " + getNotificacion());

        System.out.println("9. Barra de Vidas (Salud 4): " + getVidas());
        System.out.println("9. Barra de Vidas (Salud 0): " + getVidas());
        System.out.println("10. Descuento (BIENVENIDO10): " +
                aplicarDescuento());
        System.out.println("10. Descuento (PROMO5):" + aplicarDescuento());
        System.out.println("10. Descuento (MALO): " + aplicarDescuento());
    }

    private static double aplicarDescuento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el total de la compra");
        double total = sc.nextDouble();
        sc.nextLine();
        System.out.println("DIme el codigo de descuento");
        String promo = sc.nextLine();
        if (promo.equals("PROMO5")) {
        double descuento1 = total - 5;
        return descuento1;
        } else if (promo.equals("BIENVENIDO10")) {
            double descuento2 = total*0.10;
            double descuentoaplicado = total-descuento2;
            return descuentoaplicado;
        } else {
            return total;
        }
    }

    private static String getVidas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas vidas tienes?(0-4)");
        int vidas = sc.nextInt();
        String barra ="";
        for (int j = 1; j <=vidas ; j++) {
            barra += "❤";


        }
        return barra;
    }

    private static String getNotificacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su usuario");
        String user = sc.nextLine();
        System.out.println("Que quiere hacer dar like, comentar o follow?");
        String accion = sc.nextLine();
        String mensaje;
        switch (accion) {
        case "like":
            mensaje="El usuario "+user+" Le ha dado me gusta a tu video";
            break;
            case "follow":
                mensaje="El usuario "+user+" ha comenzado a seguirte";
                break;
            case "comentar":
                mensaje="El usuario "+user+" Ha comentado tu video";
                break;
                default:
                    mensaje="Nueva notificacion de el usuario "+user;

        } return mensaje;
    }

    private static String getEstadoPedido() {
        Scanner sc = new Scanner(System.in);
        String estado;
        System.out.println("Dame el codigo del pedido(0-2)");
        int i = sc.nextInt();
        switch (i) {
            case 0:
               estado = "Tu pedido esta siendo procesado";
                break;
                case 1:
                    estado = "Tu pedido ha sido enviado";
                    break;
                    case 2:
                      estado = "Tu pedido ha sido entregado";
                        break;
            default:
                estado = "Estado desconocido";
                break;

        }
        return estado;
    }

    private static boolean esComentarioValido() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribeme un comentario:");
        String hola = sc.nextLine();
        if (hola.length()>0 && hola.length()<=288) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean esEnvioGratis() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el valor total de tu compra");
        double v = sc.nextDouble();

        if (v > 50.0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean esMayorDeEdad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos años tienes?");
        int i = sc.nextInt();
        if (i >= 18) {

            return true;
        } else {

            return false;
        }
    }

    private static boolean esViral() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame tu numero de likes");
        int i = sc.nextInt();
        if(i>100000) {

            return true;
        } else {

            return false;
        }
    }

    private static String getSaludoPerfil() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame tu nombre de perfil ");
        String anaDev = sc.nextLine();
        String saludo= "¡Bienvenido de vuelta, " +"@"+ anaDev+"!";
        return saludo;
    }

    private static String getGamerTag() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un nombre");
        String ana = sc.nextLine();
        System.out.println("Dame un numero");
        int i = sc.nextInt();
        String gamer= "Player#"+ana+"_"+i;
        return gamer;
    }
}
