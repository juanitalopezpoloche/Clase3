import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Por favor digite un numero de mes: ");
        int numeroMes = scanner.nextInt();

        if (numeroMes == 1 || numeroMes == 3 || numeroMes == 5 || numeroMes == 7 || numeroMes == 8 || numeroMes == 10 || numeroMes == 12) {
            System.out.println("El mes "+numeroMes+" tiene 31 dias");
        } else if (numeroMes == 4 || numeroMes == 6 || numeroMes == 9 || numeroMes == 11) {
            System.out.println("El mes "+numeroMes+" tiene 30 dias");
        } else if (numeroMes == 2) {
            System.out.println("El mes "+numeroMes+" tiene 28 dias");
        } else {
            System.out.println("El numero ingresado no es de un mes");
        }

        scanner.close();
    }
}
