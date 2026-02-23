import java.util.Scanner;

public class EjercicioPromedio {
    public static void main(String[] args) {
        System.out.println("*** Promedio de Calificaciones ***");
        System.out.print("Cantidad de notas: ");

        double sumaNotas = 0;
        var consola = new Scanner(System.in);
        int cantidadNotas = Integer.parseInt(consola.nextLine());

        double[] notas = new double[cantidadNotas];

        for(int i = 0; i < cantidadNotas; i++){
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = consola.nextDouble();
        }

        for (int i = 0; i < cantidadNotas; i++){
            sumaNotas += notas[i];
        }

        double promedio = sumaNotas/cantidadNotas;

        System.out.println("Promedio: " + promedio);

    }
}
