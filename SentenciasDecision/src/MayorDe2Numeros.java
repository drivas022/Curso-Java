import javax.swing.*;
import java.util.Scanner;

public class MayorDe2Numeros {
    public static void main(String[] args) {
        System.out.println("*** El Mayor de 2 Números");

        var consola = new Scanner(System.in);

        // Solicitando números
        System.out.print("Primer número: ");
        var num1 = Integer.parseInt(consola.nextLine());
        System.out.print("Segundo número: ");
        var num2 = Integer.parseInt(consola.nextLine());

        var resultado = (num1 > num2) ? num1 + " es mayor que " + num2 : (num1 == num2) ? "El numero " + num1 + " y " + num2 + " son iguales." : num2 + " es mayor que " + num1;
        System.out.println(resultado);
    }
}
