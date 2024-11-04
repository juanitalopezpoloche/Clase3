import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroIngresado;

        do {
            System.out.println("Ingrese un numero: ");
            numeroIngresado = scanner.nextInt();

            if (numeroIngresado >= 0) {
                System.out.println("El cubo de "+numeroIngresado+" es "+(numeroIngresado * numeroIngresado * numeroIngresado));
            }

        } while (numeroIngresado >= 0);

        System.out.println("Introdujo un numero negativo ");
    }
}
