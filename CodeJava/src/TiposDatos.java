public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de datos en Java
        // Enteros (su valor por default es 0)
        /*
           o bien se puede convertir a tipo byte:
           byte tipoByte = (byte) 128;
         */
        byte tipoByte = 127; //va desde el 1 al 127 (8 bits)
        System.out.println("tipoByte = " + tipoByte); //soutv imprimir el nombre de la variable y su valor.

        short tipoShort = 32000;
        //igual se puede convertir esto y se coloca el (short) pero puede haber perdida de precisión
        System.out.println("tipoShort = " + tipoShort);

        int tipoInt = 2147483647; //almacena hasta 32 bits
        System.out.println("tipoInt = " + tipoInt);

        long tipoLong = 987654321098765432L;//almacena hasta 64 bits | se coloca una L o l al final
        System.out.println("tipoLong = " + tipoLong);

        // Punto Flotante (Valor default 0.0)

        float tipoFloat = 3.14F; //soporta hasta 32 bits | se coloca una F o f al final para indicar qu ees un tipo Float
        System.out.println("tipoFloat = " + tipoFloat);

        double tipoDouble = 3.1315D; //soporta hasta 64 bits | D o d para indicar que es un tipo Double
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter (Valor default '\u0000')

        char tipoChar = 'A'; //Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);

        tipoChar = 65; //aqui le asignamos el numero del juego unicode que es equivalente a la letra 'A'
        System.out.println("tipoChar = " + tipoChar);

        // Booleano (Valor por default false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);

        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos Object (Referencia)
        String nombre = null; //valor por default
        System.out.println("nombre = " + nombre);

        nombre = "Diego";
        System.out.println("nombre = " + nombre);
    }
}
