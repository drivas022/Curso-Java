import java.util.Scanner;

public class GeneracionTicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Generación Ticket de Venta ***");
         var consola = new Scanner(System.in);

        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio platanos: ");
        var precioPlatanos = Double.parseDouble(consola.nextLine());

        System.out.print("Aplicar algún descuento (%)? ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

        // Calculo subtotal (sin impuestos)
        var subtotal = precioLeche + precioPan + precioLechuga + precioPlatanos;

        // Aplicar el descuento
        var descuento = subtotal * (descuentoPorcentaje/100.0);

        // Subtotal con descuento
        var subtotalConDescuento = subtotal - descuento;


        // Cálculo con impuestos (12%)
        var impuesto = subtotalConDescuento * 0.12;

        // Calculo toal de la compra (con impuestos)
        var costoTotalCompra = subtotalConDescuento + impuesto;

        // Imprimir el ticket de venta
        System.out.printf("""
                %nTicket de Venta
                ---------------------------------
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto (12%%): $%.2f
                Costo total de la compra: $%.2f
                """, subtotal, descuento, descuentoPorcentaje, impuesto, costoTotalCompra);

    }
}
