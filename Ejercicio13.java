import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los números de los hermanos que llegaron a tiempo (separados por un espacio): ");
        
        int hermano1 = scanner.nextInt();
        int hermano2 = scanner.nextInt();
        String[] nombresHermanos    = {"Mayor", "Del Medio", "Menor"};

        if ((hermano1 < 1 || hermano1 > 3) || (hermano2 < 1 || hermano2 > 3)) {
            System.out.println("Por favor, ingrese solo los números 1, 2 o 3.");
        } else if (hermano1 == hermano2) {
            System.out.println("Los números deben ser diferentes.");
        } else {
            int hermanoTarde = 6 - (hermano1 + hermano2);
            
            if (hermanoTarde >= 1 && hermanoTarde <= 3) {
                System.out.println("El hermano que llega tarde es: " + nombresHermanos[hermanoTarde-1]);
            } else {
                System.out.println("Ocurrió un error al determinar quién llegó tarde.");
            }
        }
        
    }
}
