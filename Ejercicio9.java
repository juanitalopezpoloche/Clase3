import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Por favor el numero de camisas que va a comprar: ");
        double cantidadCamisas = scanner.nextInt();

        if (cantidadCamisas >= 1 && cantidadCamisas <= 50) {
            System.out.println("Cada camisa cuesta $50.000 El total seria "+(50000 * cantidadCamisas));
        } else if (cantidadCamisas >= 50 && cantidadCamisas <= 100) {
            System.out.println("Cada camisa cuesta $45.000 El total seria "+(45000 * cantidadCamisas));
        } else if (cantidadCamisas >= 100 && cantidadCamisas <= 150) {
            System.out.println("Cada camisa cuesta $40.000 El total seria "+(40000 * cantidadCamisas));
        } else if (cantidadCamisas >= 150 && cantidadCamisas <= 200) {
            System.out.println("Cada camisa cuesta $35.000 El total seria "+(35000 * cantidadCamisas));
        }else if (cantidadCamisas > 200) {
            System.out.println("Cada camisa cuesta $25.000 El total seria "+(25000 * cantidadCamisas));
        } else {
            System.out.println("No es valido el numero ingresado");
        }

        scanner.close();
    }
}
