import com.sun.tools.javac.Main;

import java.net.SocketTimeoutException;

public class AcumuladorSuma {
    public static void main(String[] args) {
        System.out.println("*** Ejercicio Suma Acumulativa ***");
        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        // Iterando los valores
        var numero = 1;

        while (numero <= MAXIMO){ // Aqui hara esto 1 + 2 + 3 + 4 + 5 = 15
            // Imprimir lo que se va a sumar
            System.out.println("(acumuladorSuma + numero) -> " + acumuladorSuma + " + " + numero);
            // Realizar la suma acumulativa
            acumuladorSuma += numero; //acumuladorSuma = acumuladorSuma + numero
            numero++;
            System.out.println("Suma parcial acumulada: " + acumuladorSuma + "\n");
        }
        System.out.println("Suma de los primeros " + MAXIMO + " numeros: " + acumuladorSuma);
    }
}
