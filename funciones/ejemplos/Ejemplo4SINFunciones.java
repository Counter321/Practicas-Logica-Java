package unidad2.funciones.ejemplos;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;


public class Ejemplo4SINFunciones {

    public static void main(String[] args) {

        // --- Item 1: Espada de Hierro ---
        String nombre1 = "Espada de Hierro";
        double precio1 = 20.0;
        boolean enRebajas1 = true;

        // Lógica para imprimir el precio del Item 1
        System.out.println(nombre1 + ": " + precio1 + Precio(enRebajas1,precio1));


        // --- Item 2: Poción de Salud ---
        String nombre2 = "Poción de Salud";
        double precio2 = 5.0;
        boolean enRebajas2 = false;

        // Lógica para imprimir el precio del Item 2
        System.out.println(nombre2 + ": " + precio2 + Precio(enRebajas2,precio2));


        // --- Item 3: Escudo de Madera ---
        String nombre3 = "Escudo de Madera";
        double precio3 = 12.5;
        boolean enRebajas3 = true;

        // Lógica para imprimir el precio del Item 3

        System.out.println(nombre3 + ": " + precio3 + Precio(enRebajas3,precio3));
    }
    public static String Precio(boolean enRebajas, double precio ) {
        String textoPrecioFinal;
        if (enRebajas) {
            double precioRebajado = precio * 0.8; // 20% descuento
            textoPrecioFinal = "¡REBAJAS! " + precioRebajado + "€";
        } else {
            textoPrecioFinal = precio + "€";
        }
        return textoPrecioFinal;

    }

}
