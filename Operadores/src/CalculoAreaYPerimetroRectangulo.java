import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class CalculoAreaYPerimetroRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Calculo de área y perímetro de un rectángulo");

        Scanner consola = new Scanner(System.in);

        System.out.printf("""
                -------------
                 Dimensiones
                -------------
                """);

        System.out.print("Base: ");
        double base = Double.parseDouble(consola.nextLine());
        System.out.print("Altura: ");
        double altura = Double.parseDouble(consola.nextLine());

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.printf("""
                %n----------------
                   Resultados
                ----------------
                Area: %.2f
                Perimetro; %.2f
                """, area, perimetro);
    }
}
