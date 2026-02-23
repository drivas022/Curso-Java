import java.util.Scanner;
import java.util.Random;

public class GeneradorID {
    public static void main(String[] args) {
        System.out.println("*** Generador de ID único ***");

        Scanner scanner = new Scanner(System.in);

        // Solicitando información
        System.out.print("Nombre: ");
        var nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        var apellido = scanner.nextLine();
        System.out.print("Año de nacimiento: ");
        var añoNacimiento = scanner.nextLine();

        // Generando random del 1 al 999
        Random random = new Random();
        var numeroAleatorio = random.nextInt(9999) + 1;

        // Generando ID unico
        var idUnico = nombre.trim().toUpperCase().substring(0, 2)
                + apellido.trim().toUpperCase().substring(0, 2)
                + añoNacimiento.trim().toUpperCase().substring(2, 4);

        // Mostrando los resultados
        var mensaje = """
                %nHola: %s
                \tTu nuevo número de identificación (ID) generado por el sistema es el siguiente: %s%04d
                """.formatted(nombre, idUnico, numeroAleatorio);
        System.out.println(mensaje);
    }
}
