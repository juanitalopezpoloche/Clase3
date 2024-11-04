import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 5;

        do {
            System.out.println(numero);

            numero += 5;
            
        } while (numero <= 100);

    }
}
