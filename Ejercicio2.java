import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Por favor digite un numero: ");
        float numero1 = scanner.nextFloat();

        System.out.println("Por favor digite otro numero: ");
        float numero2 = scanner.nextFloat();

        System.out.println("Por favor digite otro numero: ");
        float numero3 = scanner.nextFloat();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El numero mayor es "+numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El numero mayor es "+numero2);
        } else {
            System.out.println("El numero mayor es "+numero3);
        }

        scanner.close();
    }
}
