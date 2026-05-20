import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumaTotal = 0;
        char respuesta;

        do {
            System.out.print("Ingrese un número cualquiera: ");
            double numero = scanner.nextDouble();

            // Acumular el número ingresado en la variable sumaTotal
            sumaTotal += numero;

            System.out.print("¿Desea ingresar otro número? (s/n): ");
            respuesta = scanner.next().toLowerCase().charAt(0);

        } while (respuesta == 's');

        System.out.println("La suma total de los números ingresados es: " + sumaTotal);
    }
}
