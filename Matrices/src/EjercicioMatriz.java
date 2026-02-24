import java.util.Scanner;

public class EjercicioMatriz {
    public static void main(String[] args) {
        System.out.println("*** Suma Diagonal Matrix 3x3");

        double[][] matrix = new double[3][3];

        System.out.println("Ingresa los valores de la matriz");
        var consola = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print("Valor[" + i + "][" + j + "] = ");
                matrix[i][j] = Integer.parseInt(consola.nextLine());
            }
        }

        double sumaDiagonal = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++){
            sumaDiagonal += matrix[i][i]; // diagonal principal
        }
        System.out.println("La suma de las diagonales es: " + sumaDiagonal);
    }
}
