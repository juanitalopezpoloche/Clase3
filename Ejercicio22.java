import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String volverAJugar;

        do {

            System.out.print("Jugador 1, ingrese P para piedra, L para papel o T para tijera: ");
            String respuestaJugador1 = scanner.nextLine().toUpperCase();

            if (!respuestaJugador1.equals("P") && !respuestaJugador1.equals("L") && !respuestaJugador1.equals("T")) {
                System.out.println("Opción no válida. Por favor, ingrese P, L o T.");
                volverAJugar = "S";
                continue;
            }

            System.out.print("Jugador 2, ingrese P para piedra, L para papel o T para tijera: ");
            String respuestaJugador2 = scanner.nextLine().toUpperCase();

            // Verificar si la respuesta del jugador 2 es válida
            if (!respuestaJugador2.equals("P") && !respuestaJugador2.equals("L") && !respuestaJugador2.equals("T")) {
                System.out.println("Opción no válida. Por favor, ingrese P, L o T.");
                volverAJugar = "S";
                continue;
            }

            if (respuestaJugador1.equals(respuestaJugador2)) {
                System.out.println("¡Es un empate!");
            } else if ((respuestaJugador1.equals("P") && respuestaJugador2.equals("T")) ||
                       (respuestaJugador1.equals("L") && respuestaJugador2.equals("P")) ||
                       (respuestaJugador1.equals("T") && respuestaJugador2.equals("L"))) {
                System.out.println("¡Jugador 1 gana!");
            } else {
                System.out.println("¡Jugador 2 gana!");
            }

            System.out.print("\n¿Desean jugar de nuevo? (S/N): ");
            volverAJugar = scanner.nextLine().toUpperCase();
            
        } while (volverAJugar.equals("S"));

        System.out.println("\nGracias por jugar!");
        scanner.close();
    }
}
