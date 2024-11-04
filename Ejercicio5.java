import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Por favor digite una letra: ");
        char letra = scanner.nextLine().charAt(0);

        if (Character.toLowerCase(letra) == 'a' || Character.toLowerCase(letra) == 'e' || Character.toLowerCase(letra) == 'i' || Character.toLowerCase(letra) == 'o'  || Character.toLowerCase(letra) == 'u') {
            System.out.println("La letra digitada es una vocal");
        } else {
            System.out.println("La letra digitada es una consonante");
        }

        scanner.close();
    }
}
