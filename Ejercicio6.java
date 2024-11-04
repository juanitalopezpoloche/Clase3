import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Por favor digite una numero: ");
        int numero = scanner.nextInt();
        float divisionEntre2 = numero % 2;
        float divisionEntre7 = numero % 7;

        if (divisionEntre2 == 0 && divisionEntre7 == 0) {
            System.out.println("La numero digitado es divisible entre 2 y 7");
        } else if (divisionEntre2 == 0) {
            System.out.println("La numero digitado es divisible entre 2 pero no entre 7");
        } else if (divisionEntre7 == 0) {
            System.out.println("La numero digitado es divisible entre 7 pero no entre 2");
        } else {
            System.out.println("La numero digitado no es divisible entre 7 y 2");
        }

        scanner.close();
    }
}
