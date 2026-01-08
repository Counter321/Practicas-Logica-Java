package unidad2.condicionales.ejercicios.pensar;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu mes de nacimiento ");
        int mes = sc.nextInt();
        System.out.println("Dime tu dia de nacimiento ");
        int dia = sc.nextInt();
        if ((mes ==1 && dia>=20) || (mes ==2 && dia<=18)) {          //TODO no se puede encadenar operaciones tienes que poner "&&"//
            System.out.println("Tu horoscopo es: Acuario ");}
        else if ((mes ==2 && dia>=19) || (mes ==19 && dia<=20))  {
        System.out.println("Tu horoscopo es: Piscis ");}
        else if ((mes ==3 && dia>=21) || (mes ==4 && dia<=19))  {
            System.out.println("Tu horoscopo es: Aries ");}
        else if ((mes ==4 && dia>=20) || (mes ==5 && dia<=20))
        {System.out.println("Tu horoscopo es: Tauro ");}
        else if ((mes ==5 && dia>=21) || (mes ==6 && dia<=20))
        {System.out.println("Tu horoscopo es: Géminis ");}
        else if ((mes ==6 && dia>=21) || (mes ==7 && dia<=22))
        {System.out.println("Tu horoscopo es: Cáncer ");}
        else if ((mes ==7 && dia>=23) || (mes ==8 && dia<=22))
        {System.out.println("Tu horoscopo es: Leo ");}
        else if ((mes ==8 && dia>=23) || (mes ==9 && dia<=22))
        {System.out.println("Tu horoscopo es: Virgo ");}
        else if ((mes ==9 && dia>=23) || (mes ==10 && dia<=22))
        {System.out.println("Tu horoscopo es: Libra ");}
        else if ((mes ==10 && dia>=23) || (mes ==11 && dia<=21))
        {System.out.println("Tu horoscopo es: Escorpio ");}
        else if ((mes ==11 && dia>=22) || (mes ==12 && dia<=21))
        {System.out.println("Tu horoscopo es: Sagitario ");}
        else if ((mes ==12 && dia>=22) || (mes ==1 && dia<=19))
        {System.out.println("Tu horoscopo es: Capricornio ");}

    }

    }



