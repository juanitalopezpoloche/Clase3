import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la conversión que desea realizar:");
        System.out.println("1. Millas a Kilómetros");
        System.out.println("2. Kilómetros a Millas");
        System.out.print("Ingrese 1 o 2: ");
        int opcionUsuario = scanner.nextInt();

        // Realizar la conversión según la opción elegida
        if (opcionUsuario == 1) {
            System.out.print("Ingrese el número de millas: ");
            double millas = scanner.nextDouble();
            double kilometros = millas * 1.60934; // Conversión de millas a kilómetros
            System.out.printf("%.2f millas son %.2f kilómetros.\n", millas, kilometros);
        } else if (opcionUsuario == 2) {
            System.out.print("Ingrese el número de kilómetros: ");
            double kilometros = scanner.nextDouble();
            double millas = kilometros * 0.621371; // Conversión de kilómetros a millas
            System.out.printf("%.2f kilómetros son %.2f millas.\n", kilometros, millas);
        } else {
            System.out.println("Opción no válida(1 o 2)");
        }

        scanner.close();
    }
}
