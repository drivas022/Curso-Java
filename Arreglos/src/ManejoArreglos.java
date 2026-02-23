public class ManejoArreglos {
    public static void main(String[] args) {
        // Arreglos
        var enteros = new int[5]; // reservamos espacio de memoria para 5 elementos
        // Modificar los elementos
        enteros[0] = 12;
        enteros[1] = 34;
        enteros[2] = 34;
        enteros[3] = 21;
        enteros[4] = 90;

        // Leemos los elementos de un areglo
        for(int i = 0; i <= enteros.length - 1; i++){
            System.out.println("Valor " + (i+1) + ": " + enteros[i]);
        }

    }
}
