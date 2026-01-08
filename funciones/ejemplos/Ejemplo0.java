package unidad2.funciones.ejemplos;

public class Ejemplo0 {
    public static void main(String[] args) {
        // 1 trabajador //
//        String nombre1 = "Ana";
//        String apellido1 = "López";
//        String saludo1 = "Hola " + nombre1 + " "+ apellido1+ " bienvenido/a a la empresa";
//        System.out.println(saludo1);
        String saludo1 = saludar("Ana", "López");
        System.out.println(saludo1);

        // 2trabajador//
//        String nombre2 = "Luis";
//        String apellido2 = "Torres";
//        String saludo2 = "Hola " + nombre2 + " "+ apellido2+ " bienvenido/a a la empresa";
        String saludo2 = saludar("Luis", "Torres");
        System.out.println(saludo2);

        // 3 trabajador //

//        String nombre3 = "María";
//        String apellido3 = "Sanz";
//        String saludo3 = "Hola " + nombre3 + " "+ apellido3+ " bienvenido/a a la empresa";
        String saludo3 = saludar("María", "Sanz");
        System.out.println(saludo3);
    }

    private static String saludar(String nombre, String apellido) {
        String saludo = "Hola " + nombre + " " + apellido + " bienvenido/a a la empresa";
        return saludo;

    }
}
