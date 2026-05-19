import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        System.out.println("Números pares estrictamente entre " + menor + " y " + mayor + ":");

        // Iniciamos en el siguiente número después del menor
        int actual = menor + 1;

        while (actual < mayor) {
            if (actual % 2 == 0) {
                System.out.print(actual + " ");
            }
            actual++;
        }
        System.out.println();
    }
}