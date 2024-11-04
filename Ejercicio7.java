import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        // Ingreso de los tres lados
        System.out.println("Ingrese el primer número (lado 1): ");
        double lado1 = scanner.nextDouble();
        
        System.out.println("Ingrese el segundo número (lado 2): ");
        double lado2 = scanner.nextDouble();
        
        System.out.println("Ingrese el tercer número (lado 3): ");
        double lado3 = scanner.nextDouble();
        
        // Comprobación de la desigualdad triangular
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Los números ingresados pueden formar un triángulo.");
        } else {
            System.out.println("Los números ingresados NO pueden formar un triángulo.");
        }

        scanner.close();
    }
}
