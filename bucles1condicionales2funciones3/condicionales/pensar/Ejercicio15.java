package bucles1condicionales2funciones3.condicionales.pensar;


import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto es la cantida de comida que compran para los animesl?");
        double comidaDiaria = sc.nextDouble();
        System.out.println("Cuantos animales son en total a alimentar?");
        int numAnimales = sc.nextInt();
        System.out.println("Cual es la media que come cada animal por dia?");
        double kilosPorAnimal = sc.nextDouble();

        double cantidadnecesaria = numAnimales*kilosPorAnimal;

        if(comidaDiaria<=0 ||numAnimales<=0){
            System.out.println("Valor mal inttroducido");

        } else if(comidaDiaria>cantidadnecesaria) {
            System.out.println("Disponemos de alimento suficiente");
        } else if(comidaDiaria<cantidadnecesaria){
            double racion = comidaDiaria/numAnimales;
            System.out.println("La racion necesaria para cada animal es: "+racion+" kilos");
        }
    }
}
