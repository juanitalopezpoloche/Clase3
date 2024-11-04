import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Por favor digite un numero: ");
        float numero = scanner.nextFloat();

        if ((numero % 2) ==  0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

        scanner.close();
    }
}
