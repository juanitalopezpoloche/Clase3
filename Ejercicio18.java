import java.util.Random;

public class Ejercicio18 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[120];

        // Generar 120 números aleatorios entre -100 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(201) - 100; // Genera números de -100 a 100
        }

        // Variables para cálculos
        int sumaPositiva = 0;
        int sumaNegativa = 0;
        int contarNumeroPositivos = 0;
        int contarNumeroNegativos = 0;
        int contarNumeroCero = 0;

        // Calcular sumas y contadores
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPositiva += numeros[i];
                contarNumeroPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativa += numeros[i];
                contarNumeroNegativos++;
            } else {
                contarNumeroCero++;
            }
        }

        // Calcular medias
        double mediaNumerosPositivos = (contarNumeroPositivos > 0) ? (double) sumaPositiva / contarNumeroPositivos : 0;
        double mediaNumerosNegativos = (contarNumeroNegativos > 0) ? (double) sumaNegativa / contarNumeroNegativos : 0;

        // Imprimir resultados
        System.out.println("Suma de valores positivos: " + sumaPositiva);
        System.out.println("Suma de valores negativos: " + sumaNegativa);
        System.out.println("Media de los números positivos: " + mediaNumerosPositivos);
        System.out.println("Media de los números negativos: " + mediaNumerosNegativos);
        System.out.println("Cantidad de ceros: " + contarNumeroCero);
    }    
}
