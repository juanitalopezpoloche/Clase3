public class Ejercicio20 {
    public static void main(String[] args) {
        int sizeTablero = 8;

        // Generar el tablero
        for (int i = 0; i < sizeTablero; i++) {
            for (int j = 0; j < sizeTablero; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("| B ");
                } else {
                    System.out.print("| N ");
                }
                
            }
            System.out.println("|");
        }
    }
}
