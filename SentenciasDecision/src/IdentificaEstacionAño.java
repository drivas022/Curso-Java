import java.util.Scanner;

public class IdentificaEstacionAño {
    public static void main(String[] args) {
        System.out.println("*** Identificador de Estaciones del Año ***");
        System.out.printf("Ingresa el valor del mes para obtener la estación: ");
        var consola = new Scanner(System.in);
        var mes = Integer.parseInt(consola.nextLine());

        var estacionAnio = (mes == 1 || mes == 2 || mes == 12) ? "Invierno"
                : (mes == 3 || mes == 4 ||mes == 5) ? "Primavera"
                : (mes == 6 || mes == 7 || mes == 8) ? "Verano"
                : (mes == 9 || mes == 10 || mes == 11) ? "Otoño"
                : "Estación Desconocida";
        System.out.println(estacionAnio);
    }
}


