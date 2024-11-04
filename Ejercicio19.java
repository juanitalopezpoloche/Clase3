import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número
        System.out.print("Ingrese el número de términos de la sucesión de Fibonacci que desea ver: ");
        int numero = scanner.nextInt();

        // Validar la entrada
        if (numero <= 0) {
            System.out.println("Por favor, ingrese un número positivo.");
        } else {
            System.out.println("Sucesión de Fibonacci:");
            for (int i = 0; i < numero; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
