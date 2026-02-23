import java.util.Scanner;

public class MatrixDinamica {
    public static void main(String[] args) {
        // Introducir valores a una matriz
        int filas, columnas;
        var consola = new Scanner(System.in);
        // Definir la matrix
        System.out.print("Ingresa las filas de la matriz: ");
        filas = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa las columnas de la matriz: ");
        columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[filas][columnas];
        // Solicitar los valores de forma dinámica
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.print("Valor[" + i + "][" + j + "] = ");
                matriz[i][j] = Integer.parseInt(consola.nextLine());
            }
        }
        // Iterar valores de la matrix
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.print("\nMatriz[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }
    }
}
