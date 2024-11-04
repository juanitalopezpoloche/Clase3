import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso de la sandía en kilogramos: ");
        int peso = scanner.nextInt();

        System.out.println(dividirEnPares(peso));

        scanner.close();
    }

    public static String dividirEnPares(int peso) {

        if (peso > 2 && peso % 2 == 0) {
            return "SI"; 
        } else {
            return "NO";
        }
    }

}
