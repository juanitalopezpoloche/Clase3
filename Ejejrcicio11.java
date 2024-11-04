import java.util.Scanner;

public class Ejejrcicio11 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Por favor digite un numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Por favor digite un numero: ");
        int numero2 = scanner.nextInt();

        System.out.println("Por favor digite un numero: ");
        int numero3 = scanner.nextInt();

        numeroOrdenAscendente(numero1, numero2, numero3);

        scanner.close();
    }

    public static void numeroOrdenAscendente(int numero1, int numero2, int numero3) {
        
        String numerosAsc = "";

        if (numero1 < numero2 && numero1 < numero3) {
            numerosAsc += numero1 + ", ";
            if (numero2 < numero3) {
                numerosAsc += numero2 + ", " + numero3;
            } else {
                numerosAsc += numero3 + ", " + numero2;
            }
        } else if (numero2 < numero1 && numero2 < numero3) {
            numerosAsc += numero2 + ", ";
            if (numero1 < numero3) {
                numerosAsc += numero1 + ", " + numero3;
            } else {
                numerosAsc += numero3 + ", " + numero1;
            }
        } else {
            numerosAsc += numero3 + ", ";
            if (numero1 < numero2) {
                numerosAsc += numero1 + ", " + numero2;
            } else {
                numerosAsc += numero2 + ", " + numero1;
            }
        }

        System.out.print(numerosAsc);
    }
}
