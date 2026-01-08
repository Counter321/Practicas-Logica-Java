package unidad2.condicionales.ejercicios.pensar;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingreseme su numero de DNI");
        int dni = sc.nextInt();
        int letra = dni%22;
        String cadenanumero = String.valueOf(dni);
        int numerocaracteres = cadenanumero.length();
        if(numerocaracteres == 8) {
        switch(letra){
            case 0:
                System.out.println("La letra es: T ");
                break;
            case 1:
                System.out.println("la letra es: R" );
                break;
            case 2:
                System.out.println("la letras es W");
                break;
            case 3:
                System.out.println("la letras es A");
                break;
            case 4:
                System.out.println("la letras es G");
                break;
            case 5:
                System.out.println("la letras es M");
                break;
            case 6:
                System.out.println("la letras es Y");
                break;
            case 7:
                System.out.println("la letras es F");
                break;
                case 8:
                    System.out.println("la letras es P");
                    break;
                    case 9:
                        System.out.println("la letras es D");
                        break;
                        case 10:
                            System.out.println("la letras es X");
                            break;
                            case 11:
                                System.out.println("la letras es B");
                                break;
                                case 12:
                                    System.out.println("la letras es N");
                                    break;
                                    case 13:
                                        System.out.println("la letras es J");
                                        break;
                                        case 14:
                                            System.out.println("la letras es Z");
                                            break;
                                            case 15:
                                                System.out.println("la letras es S");
                                                break;
                                                case 16:
                                                    System.out.println("la letras es Q");
                                                    break;
                                                    case 17:
                                                        System.out.println("la letras es V");
                                                        break;
                                                        case 18:
                                                            System.out.println("la letras es H");
                                                            break;
                                                            case 19:
                                                                System.out.println("la letras es L");
                                                                break;
                                                                case 20:
                                                                    System.out.println("la letras es C");
                                                                    break;
                                                                    case 21:
                                                                        System.out.println("la letras es K");
                                                                        break;
                                                                        case 22:
                                                                            System.out.println("la letras es E");
                                                                            break;
            default:
                System.out.println("El numero de DNI no es valido");
                break;
        }



    } else {
            System.out.println("El numero de DNI no es valido");
        }
}}
