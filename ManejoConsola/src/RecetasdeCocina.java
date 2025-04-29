import java.util.*;

public class RecetasdeCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de Cocina ***");
        var consola = new Scanner(System.in);

        // Nombre de la receta
        System.out.print("Ingrese el nombre de la receta: ");
        var nombreReceta = consola.nextLine();

        // Ingredientes
        System.out.print("Ingrese el nombre de los ingredientes (separados por coma): ");
        var ingredientes = consola.nextLine();

        // Tiempo de Preparación
        System.out.print("Ingrese el tiempo de preparacion (min): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        // Dificiltad de la Receta
        System.out.print("Ingrese la difucutad de la receta: ");
        var dificultadRecetaa = consola.nextLine();


        //Mostrando Receta
        System.out.println("-- Receta de Cocina --");
        System.out.println("Nombre de la receta: " + nombreReceta);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tiempo de preparacion: " + tiempoPreparacion);
        System.out.println("Dificultad: " + dificultadRecetaa);



    }
}
