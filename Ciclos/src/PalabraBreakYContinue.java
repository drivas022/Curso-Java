public class PalabraBreakYContinue {
    public static void main(String[] args) {
        System.out.println("*** Break Y Continue");

        // Ejemplo break, imprimir solo el primer numero par
        for (int numero = 1; numero < 10; numero++){
            if (numero % 2 == 0){
                System.out.print(numero + " ");
                break; // Aqui rompemos el ciclo y solo encontramos el primero numero par.
            }
        }

        // Ejemplo con continue. Imprimir solo numeros pares, ignorar impares
        System.out.println("***\n Palabra continue: ");
        for (int numero = 1; numero < 10; numero++){
            if (numero % 2 == 1){ // Numero impar
                continue; // Ignoramos esta iteración y no tomara en cuenta los impares. (Saltamos a la siguiente iteración)
            }
            System.out.print(numero + " "); // Numeros pares
        }
    }
}
