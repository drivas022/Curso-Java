public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario ***");
        // Sintaxis
        // condición ? exp1 : exp2

        // Determinar si un numero es par o no
        var numero = 4;
        var resultado = (numero % 2 == 0) ? "Par":"Impar";
        // si la condición es verdadera se ejecuta lo que esta antes de los (:)
        // si la condición es falsa se ejecuta lo que esta después de los dos puntos (:)

        System.out.println("El numero " + numero + " es " + resultado);

        // Calcular si es mayor de edad
        var edad = 18;
        var mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";

        System.out.println("\nTienes " + edad + ", " + mensaje);

        // Valor positivo, negativo o cero (operador ternario anidado)
        numero = 10;
        resultado = (numero > 0) ?  "Positivo" : (numero < 0) ? "Negativo" : "Cero";
        System.out.println("\nEl número " + numero + " es " + resultado);
    }
}
