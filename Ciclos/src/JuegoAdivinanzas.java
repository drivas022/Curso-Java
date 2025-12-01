import javax.sound.midi.SysexMessage;
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        System.out.println("*** Juego de Adivinanzas ***");

        // Clase Scaner
        var console = new Scanner(System.in);
        // Clase Random
        Random generator = new Random();

        // Generando numero
        var numeroAdivinanza = generator.nextInt(0, 50);

        // Juego
        System.out.printf("Bienvenido al juego, comienza!");
        boolean ganador = false;

        while (!ganador){
            System.out.println("Adivina tu numero: @!$? ");
            System.out.print("Ingresa tu número: ");
            var userNumber = console.nextInt();

            if (numeroAdivinanza != userNumber){
                System.out.println("Numero incorrecto! JAJAJA.... intenta de nuevo");
                ganador = false;
            }else{
                System.out.println("Adivinaste el numero! Eres un genio!");
                System.out.printf("Numero: " + numeroAdivinanza);
                ganador = true;
            }
        }

    }
}
