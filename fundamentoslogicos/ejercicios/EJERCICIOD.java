package fundamentoslogicos.ejercicios;

public class EJERCICIOD {
    public static void main(String[] args) {
        int edad = 30;
        double altura = 1.75;
        float peso = 60.5f;
        // a
        double edadDouble = edad;
        double pesoDouble = peso;
        int alturaInt = (int) altura;
        int pesoInt = (int) peso;
        System.out.println("Edad original (int): " + edad);
        System.out.println("Edad convertida a double: " + edadDouble);
        System.out.println("Peso original (float): " + peso);
        System.out.println("Peso convertida a double: " + pesoDouble);
        System.out.println("Altura original (double): " + altura);
        System.out.println("Altura convertida a int: " + alturaInt);
        System.out.println("Peso convertida a int: " + pesoInt);
    }
}
