import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        final var USER = "drivas";
        final var PASSWORD = "123";

        // Solicitando información
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa tu usuario: ");
        var usuario = consola.nextLine();
        System.out.print("Ingresa tu contraseña: ");
        var password = consola.nextLine();

        // Validación
        var validacionCredenciales = usuario.equals(USER) && password.equals(PASSWORD) ; // no se usa el == porque no estamos comparando la dirección de memoria

        System.out.print("Las credenciales se validaron correctamente? " + validacionCredenciales);
    }
}
