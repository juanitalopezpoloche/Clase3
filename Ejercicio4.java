import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Por favor digite una letra: ");
        char letra = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("La letra digitada esta en mayuscula");
        } else {
            System.out.println("La letra digitada esta en minuscula");
        }

        scanner.close();
    }

}
