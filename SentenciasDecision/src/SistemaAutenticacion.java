import com.sun.security.jgss.GSSUtil;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");
        String user, password;


        // Scanner
        var consola = new Scanner(System.in);

        // Declarando CONSTANTES
        final var USUARIO = "drivas";
        final var CONTRASENIA = "1234";

        // Lógica LogIn
        System.out.print("Usuario: ");
        user = consola.nextLine();

        System.out.print("Password:");
        password = consola.nextLine();

        // Validaciones
        if (user == USUARIO && password == CONTRASENIA){
            System.out.println("Bienvenido al Sistema...");
        }else if(user != USUARIO && password == CONTRASENIA){
            System.out.println("Usuario incorrecto, por favor validelo.");
        }else if(user == USUARIO && password != CONTRASENIA){
            System.out.println("Contraseña incorrecta, por favor validelo.");
        }else if(user != USUARIO && password != CONTRASENIA){
            System.out.println("Credenciales inválidas.");
        }
    }
}
