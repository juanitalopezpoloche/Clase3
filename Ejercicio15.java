import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroIngresado;

        do {
            System.out.println("Ingrese un numero: ");
            numeroIngresado = scanner.nextInt();

            if (numeroIngresado < 0) {
                System.out.println("El numero "+numeroIngresado+" es negativo");
            } else if (numeroIngresado > 0) {
                System.out.println("El numero "+numeroIngresado+" es positivo");

            }

        } while (numeroIngresado < 0 || numeroIngresado > 0 );

        System.out.println("Introdujo el numero 0");
    }
}
