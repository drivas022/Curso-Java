public class RecorrerMatrices {
    public static void main(String[] args) {
        System.out.println("*** Recorriendo Matrices ***");

        final var FILAS = 2;
        final var COLUMNAS = 3;

        // Definimos una matriz
        int[][] matrix = new int[FILAS][COLUMNAS]; // 2 filas y 3 columnas

        // Modificar valores de la matriz
        matrix[0][0] = 100;
        matrix[0][1] = 200;
        matrix[0][2] = 300;
        matrix[1][0] = 400;
        matrix[1][1] = 500;
        matrix[1][2] = 600;

        // Recorrer matrix
        for (int i = 0; i < FILAS; i++){ // recorriendo filas
            for (int j = 0; j < COLUMNAS; j++){ // recorriendo columnas
                System.out.println("Valor[" + i + "][" + j + "] = " + matrix[i][j]);
            }
        }

    }
}
