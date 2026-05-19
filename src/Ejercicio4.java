import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Ingrese el primer número: ");
            double n1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double n2 = scanner.nextDouble();

            double suma = n1 + n2;
            System.out.println("Resultado de la suma: " + suma);

            System.out.print("¿Desea realizar otra suma? (s/n): ");
            continuar = scanner.next();
        }

        System.out.println("Programa terminado.");
    }
}
