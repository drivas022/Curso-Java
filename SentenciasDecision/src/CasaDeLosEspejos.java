import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CasaDeLosEspejos {
    public static void main(String[] args) {
        System.out.println("*** Bienvenidos a la Casa de los Espejos ***");

        var consola = new Scanner(System.in);

        System.out.println("Cual es tu edad? ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.println("Tienes miedo a la escuridad (true/false)");
        var tienesMiedoOscuridad = Boolean.parseBoolean(consola.nextLine());

        // Verificación
        if (!tienesMiedoOscuridad && edad >= 10){
            System.out.println("Puedes entrar a la Casa de los Espejos");
        }else{
            System.out.println("Lo siento, la Casa de los Espejos podria darte miedo.");
        }
    }
}
