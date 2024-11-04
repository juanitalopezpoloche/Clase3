import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Por favor digite su edad numero: ");
        int edad = scanner.nextInt();

        if (edad >= 0 && edad <= 5) {
            System.out.println("Esta en la primera etapa de infancia");
        } else if (edad >= 6 && edad <= 11) {
            System.out.println("Esta en la etapa de infancia");
        } else if (edad >= 12 && edad <= 18) {
            System.out.println("Esta en la etapa de la adolescencia");
        } else if (edad >= 19 && edad <= 26) {
            System.out.println("Esta en la etapa de juventud");
        } else if (edad >= 27 && edad <= 59) {
            System.out.println("Esta en la etapa de adultez");
        } else if (edad > 59) {
            System.out.println("Es una persona mayor");
        } else {
            System.out.println("No es valido el numero ingresado");
        }

        scanner.close();
    }
}
