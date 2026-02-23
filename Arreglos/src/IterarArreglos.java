public class IterarArreglos {
    public static void main(String[] args) {
        var enteros =new int[]{100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        // Iterar los elementos del arreglo
        for (int i = 0; i< enteros.length; i++){
            System.out.println("Valor del índice: " + i + " : " + enteros[i]);
        }
    }
}
