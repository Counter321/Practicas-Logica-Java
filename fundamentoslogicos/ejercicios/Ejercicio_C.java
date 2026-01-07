package fundamentoslogicos.ejercicios;

public class Ejercicio_C {
    public static void main(String[] args) {
        int edad = 13;
        double altura = 2.5;
        float peso = 334.67f;
        boolean esmayordeedad= true;
        char inicial ='a';
        String nombrecompleto= "Aldair mato gonzales";
        // b modifica las variables
        edad = 15;
        altura = 2.5;
        peso = 334.67f;
        esmayordeedad= false;
        inicial ='b';
        // c
        final double NUMERO_PI= 3.14;
        final int MAX_USUARIOS = 1000;

        // muestra por pantalla
        System.out.println(edad);
        System.out.println(altura);
        System.out.println(peso);
        System.out.println(esmayordeedad);
        System.out.println(inicial);
        System.out.println(nombrecompleto);
        System.out.println(NUMERO_PI);
        System.out.println(MAX_USUARIOS);
    }
}
