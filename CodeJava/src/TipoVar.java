public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***");
        //Sin el uso de var
        String nombre1 = "Juan";
        System.out.println("nombre1: " + nombre1);
        //Con el uso de var
        var nombre2 = "Carlos"; //las variables "var" son variables locales, lo cual no pueden ser globales.
        System.out.println("nombre2: " + nombre2);
        //Definir otras variables usando var
        var edad = 30; //va a inferir el tipo dependiendo el valor que se este asigando, en este caso int.
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F; //se infiere el tipo float
        System.out.println("sueldo: " + sueldo);

        //Ejemplos
        var esCasado = false; //Se infiere tipo boolean
        esCasado = true;
        //esCasado = "NO"; No podemos asigar un tipo distinto
        var numero = 30L; //se infiere tipo Long

        //Se debe definir su valor | A CONTINUACIÓN SE MUESTRA UN EJEMPLO ERRONEO
        //var precio; aqui se debe asignar un valor desde su declaración
        //precio = 10;

        //Se debe poder inferir el tipo de dato
        //var apellido = null; no es inferible
    }
}
