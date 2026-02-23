import java.util.Arrays;

public class MatricesSimplificadas {
    public static void main(String[] args) {
        var matrix = new int[][]{
                {100, 200, 300},
                {400, 500, 600}
        };

        // Recorrer matrix
        for (int i = 0; i < matrix.length; i++){ // recorriendo filas
            for (int j = 0; j < matrix[i].length; j++){ // recorriendo columnas
                System.out.println("Valor[" + i + "][" + j + "] = " + matrix[i][j]);
            }
        }
    }
}
