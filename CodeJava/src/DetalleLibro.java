public class DetalleLibro {
    public static void main(String[] args) {
        //Detalle libro
        String tituloLibro = "El señor de los anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;

        //Imprimir el valor de las variables
        System.out.printf(tituloLibro);
        System.out.println(anioPublicacion);
        System.out.println(libroDisponible);
        System.out.println(precio);

        //Modificar el titulo del libro
        tituloLibro = "El Señor de los Anillos";
        //no se sobreescribe sino que se apunta a una dirección diferente de memoria donde ahora se encuentre este.
    }
}
