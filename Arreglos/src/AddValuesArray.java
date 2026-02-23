import java.util.Scanner;

public class AddValuesArray {
    public static void main(String[] args) {
        // Introducir valores a un arreglo
        var consola = new Scanner(System.in);
        // Declarar arreglo
        System.out.println("Proporciona el largo del array: ");
        var largoArray = Integer.parseInt(consola.nextLine());
        // Creamos de nanera dinámica el arreglo
        var enteros = new int[largoArray];
        // Solicitando valores del array
        for (int i = 0; i < largoArray; i++) {
            System.out.print("Proporciona enteros[" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }

        // Imprimir los valores del arreglo
        System.out.println("\nImpresión del Array: ");
        for(int i = 0; i < largoArray; i++){
            System.out.println("Enteros[" + i + "] = " + enteros[i]);
        }
    }
}
