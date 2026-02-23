import java.util.Scanner;

public class SentenciaIf {
    public static void main(String[] args) {
        // Uso de la sentencia IF
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = Integer.parseInt(consola.nextLine());

        if (edad >=18){
            System.out.println("Eres mayor de edad");
        }else if (edad >= 13 && edad <= 18){
            System.out.println("Eres menor de edad");
        }else{
            System.out.println("Eres un niño");
        }
    }
}
