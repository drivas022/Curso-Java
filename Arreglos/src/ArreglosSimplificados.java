import java.sql.SQLOutput;

public class ArreglosSimplificados {
    public static void main(String[] args) {
        // Sintaxis simplificada
        int[] enteros = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        // Con var
        var enteross =new int[]{100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        for(int i = 0; i<= enteros.length - 1; i++){
            System.out.println((i + 1) + ". Enteros: " + enteros[i]);
        }
        System.out.println("========================");
        for(int i = 0; i<= enteross.length - 1; i++){
            System.out.println((i + 1) + ". Enteros(var): " + enteross[i]);
        }

        // Direccion de memoria de los arreglos
        System.out.println("Dirección de memoria: " + enteros);
        System.out.println("Dirección de memoria: " + enteross);
    }
}
