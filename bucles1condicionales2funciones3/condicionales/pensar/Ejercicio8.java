package bucles1condicionales2funciones3.condicionales.pensar;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el dia ");
        int dia = sc.nextInt();
        System.out.println("Dame el mes ");
        int mes = sc.nextInt();
        System.out.println("Dame el año ");
        int anio = sc.nextInt();
        boolean fechacorrecta = false;
    if(anio>0 && (mes>0 && mes<=12)) {
        switch (mes){
            case 1,3,5,7,8,10,12:
                if (dia>=1 && dia<=31){
                    fechacorrecta = true;

                } break;
                case 2:
                    if (dia>=1 && dia<=28){
                        fechacorrecta = true;

                    }  break;
            case 4,6,9,11:
                if (dia>=1 && dia<=30){
                    fechacorrecta = true;

                } break;
                default:
                   fechacorrecta=false;

        }
        }
        if (fechacorrecta==false){
            System.out.println("La fecha no es correcta");
        } else {
            System.out.println("dia: "+dia+" mes: "+mes+" anio: "+anio);
        }



    }

}