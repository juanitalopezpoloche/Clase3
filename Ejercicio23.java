import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.print("Ingrese el tamaño del diamante (número impar positivo): ");
        size = scanner.nextInt();

        if (size <= 0 || size % 2 == 0) {
            System.out.println("El tamaño debe ser un número entero positivo impar.");
        } else {

            for (int i = 1; i <= size; i += 2) {
  
                for (int j = i; j < size; j += 2) {
                    System.out.print(" ");
                }
                // Imprimir asteriscos
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = size - 2; i >= 1; i -= 2) {

                for (int j = size; j > i; j -= 2) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
