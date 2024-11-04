import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroIngresado;
        int cantidadNumerosIngresados = 0;

        do {
            System.out.println("\nIngrese un numero: ");
            numeroIngresado = scanner.nextInt();

            if (numeroIngresado < 0) {
                System.out.println("El numero "+numeroIngresado+" es negativo");
                cantidadNumerosIngresados++;
            }
            
        } while (numeroIngresado < 0);

        System.out.println("\nIngreso un numero positivo");
        System.out.println("la cantidad de numeros negativos ingresados es "+cantidadNumerosIngresados);

    }
}
