import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero límite: ");
        int numeroLimite = scanner.nextInt();

        int contador = 0;
        System.out.println("Números pares entre 0 y " + numeroLimite + ":");

        while (contador <= numeroLimite) {
            if (contador % 2 == 0) {
                System.out.print(contador + " ");
            }
            contador++;
        }
        System.out.println(); // Salto de línea decorativo
    }
}