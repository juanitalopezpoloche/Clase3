import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Por favor digite un numero: ");
        float numero = scanner.nextFloat();

        if (numero == 0) {
            System.out.println("El numero digitado es 0");
        } else if (numero < 0) {
            System.out.println("El numero "+numero+" es negativo");            
        } else {
            System.out.println("El numero "+numero+" es positivo");
        }

        scanner.close();
    }
}
