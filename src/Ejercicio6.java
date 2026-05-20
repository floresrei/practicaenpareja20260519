public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Los primeros 50 múltiplos de 5 son:");

        // El bucle corre exactamente 50 veces, desde 1 hasta 50
        for (int i = 1; i <= 50; i++) {
            int multiplo = i * 5;
            System.out.print(multiplo + " ");

            // Salto de línea cada 10 números para que la consola se vea ordenada
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
