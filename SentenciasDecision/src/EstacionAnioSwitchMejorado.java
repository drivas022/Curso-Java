import java.util.Scanner;

public class EstacionAnioSwitchMejorado {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Ingresa el valor del mes (1-12): ");
        var mes = Integer.parseInt(consola.nextLine());

        var estacion = switch(mes){
            case 1, 2, 12 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "Estación desconocida";
        };


    }
}
