import com.sun.security.jgss.GSSUtil;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;

        // Comenzamos con la iteración del menu
        while(!salir){
            System.out.println("""
                    *** Sistema de Administracion de Cuentas ***
                    1. Crear Cuenta
                    2. Eliminar Cuenta
                    3. Salir
                    Escoje una opción:\s 
                    """);
            var opcion = consola.nextInt();

            // Evaluar cada opción
            switch(opcion){
                case 1 -> System.out.println("Creando tu cuenta...\n");
                case 2 -> System.out.println("Eliminano tu cuenta... \n");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida...\n");
            }
        }
        System.out.println("Fin del Sistema de Administracion de Cuentas");
    }
}
