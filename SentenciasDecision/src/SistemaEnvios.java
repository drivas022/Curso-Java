import java.sql.SQLOutput;
import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Envíos ***");

        // Variables Generales
        double costoEnvio;

        // Lógica
        System.out.print("Ingresa el detino del paquete (nacional/internacional):");
        var consola = new Scanner(System.in);
        String destino = consola.nextLine();

        System.out.print("Ingrese el peso del paquete en (kg): ");
        var peso = Double.parseDouble(consola.nextLine());

        switch (destino){
            case "nacional":
                costoEnvio = 10 * peso;
                System.out.println("El costo de envío del paquete es: $" + costoEnvio);
                break;
            case "internacional":
                costoEnvio = 20 * peso;
                System.out.printf("El costo de envío del paquete es: $%.2f", costoEnvio);
                break;
        }
    }
}
