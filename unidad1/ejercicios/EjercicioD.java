package unidad1.ejercicios;

public class EjercicioD {
    public static void main(String[] args) {
        int edad = 30;
      double altura = 1.75;
      float peso = 60.5f;
      //a)Realiza las siguientes conversiones://
        // Implícita//
        double edadDouble = edad;
        double pesoDouble = peso;
        //Explícita//
        int alturaInt = (int) altura; //le obligo a que sea un entero con "(iny)" le fuerzo a que lo lea como un entero//
        int pesoInt = (int) peso;
        // Mostrar resultados
        System.out.println("Edad original (int): " + edad);
        System.out.println("Edad convertida a double: " + edadDouble);
        System.out.println("Peso original (float): " + peso);
        System.out.println("Peso convertida a double: " + pesoDouble);
        System.out.println("Altura original (double): " + altura);
        System.out.println("Altura convertida a int: " + alturaInt);
        System.out.println("Peso convertida a int: " + pesoInt);

    }
}
