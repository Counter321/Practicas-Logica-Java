package unidad2.condicionales.ejercicios.pensar;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el dia:");
        int dia = sc.nextInt();
        System.out.println("Dime el mes:");
        int mes = sc.nextInt();
        System.out.println("Dime el año:");
        int ano = sc.nextInt();
        boolean fechacorrecta = false;
        if((ano >0) && (mes>0 && mes<=12)){
            switch (mes){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (dia>=1 && dia<=31) {
                        fechacorrecta = true;
                    } break;
                case 2:
                    if (dia>=1 && dia<=28){
                        fechacorrecta = true;
                    } break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia>=1 && dia<=30) {
                        fechacorrecta = true;
                    }
            }
        }
        if(fechacorrecta){
            System.out.println("Fecha correcta::"+dia+"/"+mes+"/"+ano);
        } else {
            System.out.println("Fecha no es correcta");
        }




    }

}








