import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema Reerva Hotel ***");
        System.out.println("Bienvenido a Hotel mas lujoso de la ciudad, por favor ingrese los siguientes datos:");

        // Precios fijos de cuartos
        final double CUARTO_SIN_VISTA_AL_MAR = 150.50; // por día
        final double CUARTO_CON_VISTA_AL_MAR = 190.50; // por día

        var consola = new Scanner(System.in);

        System.out.print("Nombre: ");
        var nombre = consola.nextLine();

        System.out.print("Días de Estadia en el Hotel: ");
        var cantidadDiasEstadia = Integer.parseInt(consola.nextLine());

        System.out.printf("""
                %nPrecios estadía:
                Cuarto sin vista al mar: $%.2f por día
                Cuarto con vista al mar: $%.2f por día
                """, CUARTO_SIN_VISTA_AL_MAR, CUARTO_CON_VISTA_AL_MAR);

        // Preguntando que cuarto quiere
        System.out.println("Cuarto con vista al mar? (true/false)");
        var respuesta = Boolean.parseBoolean(consola.nextLine());
        var cuarto = (respuesta) ? "Si :)" : "No :(";

        // Operación
        var total = (respuesta) ? CUARTO_CON_VISTA_AL_MAR * cantidadDiasEstadia : CUARTO_SIN_VISTA_AL_MAR * cantidadDiasEstadia;

        System.out.printf("""
                %nCliente: %s
                Dias de estadia: %d
                Costo Total: $%.2f
                Habitación con vista al mar: %s
                """, nombre, cantidadDiasEstadia, total, cuarto);
    }
}
