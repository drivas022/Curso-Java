public class IndicesCadena {
    public static void main(String[] args) {
        // Manejo de indices en una cadena
        var cadena1 = "Hola Mundo";

        // Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0); // Recuperar el caracter 'H'
        System.out.println("primerCaracter = " + primerCaracter);
        // Recuperar el último caracter (en la posición 9)
        var ultimoCaracter = cadena1.charAt(9); // recuperar el caracter 'O'
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        // Imprimiedo letra M
        var letraM = cadena1.charAt(5);
        System.out.println("letraM = " + letraM);
    }
}
