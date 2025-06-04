import java.util.Scanner;

public class TiendaEnLinea {
    public static void main(String[] args) {
        double descuento, montoTotal;
        Scanner consola = new Scanner(System.in);

        System.out.println("**+ ¡Bienvenido a su TiendaEnLinea! ***");
        System.out.print("Ingresa tu nombre: ");
        String nombre = consola.nextLine();

        System.out.print("Es miembro de la tienda(true/false)? ");
        Boolean esMiembro = Boolean.parseBoolean(consola.nextLine());

        System.out.print("Ingresa el monto gastado: ");
        double monto = Double.parseDouble(consola.nextLine());

        if (monto >= 1000 && esMiembro == true){ //10%
            descuento = monto * 0.1;
            montoTotal =monto - descuento;

            System.out.printf("""
                    -------------------------------------------------------
                     Felicidades %s! Has aplicado a un descuento del 10%%!
                    -------------------------------------------------------
                    Monto: $%.2f
                    Descuento: $%.2f
                    Total: $%.2f
                    """,nombre, monto, descuento, montoTotal);
        }else if (esMiembro == true){ // 5%
            descuento = monto * 0.05;
            montoTotal = monto - descuento;
            System.out.printf("""
                    ------------------------------------------------------
                     Felicidades %s! Has aplicado a un descuento del 5%%!
                    ------------------------------------------------------
                    Monto: $%.2f
                    Descuento: $%.2f
                    Total: $%.2f
                    """,nombre, monto, descuento, montoTotal);
        }else{ // 0%
            System.out.printf("""
                    Descuento: 0%%
                    Lo sentimos %s! No clasificas para recibir el descuento :(
                    """, nombre);
        }
    }
}

// %d - enteros
// %n - salto de linea
// %f - flotantes
// %s - strings
