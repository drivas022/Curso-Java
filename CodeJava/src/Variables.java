import java.sql.SQLOutput;

public class Variables {
    public static void main(String[] args) {
        //Variables
        int edad = 19;
        double precio = 332.32;
        boolean disponible = true; //true/false
        char genero;
        genero = 'M';

        // Acceder a las variables
        System.out.println(edad);
        //Modificar el valor
        edad = 21;
        System.out.println(edad);

        //Imprimir
        System.out.println(precio);
        System.out.println(disponible);
        System.out.println(genero);
    }
}


/*MEMORIA RAM*/

/*
RAM (Random Access Memory) - volatil

En java contamos con dos clasificaciones de RAM para almacenar los datos de nuestros programas

- Memoria Stack (Pila): Almacena las variables primitivas cuando se declaran dentro de un metodo.
Almacena variables locales y referencias a objetos.

- Memoria Heap: Almacena los objetos asi como sus datos.
 */