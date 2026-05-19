import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto total de la compra: ");
        double montoCompra = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el residuo del buffer

        System.out.print("Ingrese el color de la etiqueta (verde, roja, azul, dorada): ");
        String etiqueta = scanner.nextLine().toLowerCase().trim();

        double porcentajeDescuento = 0;

        switch (etiqueta) {
            case "verde":
                porcentajeDescuento = 0.05;
                break;
            case "roja":
                porcentajeDescuento = 0.10;
                break;
            case "azul":
                porcentajeDescuento = 0.15;
                break;
            case "dorada":
                porcentajeDescuento = 0.20;
                break;
            default:
                System.out.println("Color de etiqueta no válido. No se aplicará descuento.");
                break;
        }

        double descuento = montoCompra * porcentajeDescuento;
        double montoFinal = montoCompra - descuento;

        System.out.printf("Descuento aplicado (%.0f%%): $%.2f%n", (porcentajeDescuento * 100), descuento);
        System.out.printf("Monto total a pagar: $%.2f%n", montoFinal);
    }
}
