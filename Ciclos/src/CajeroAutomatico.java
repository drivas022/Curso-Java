import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("*** Cajero Automático ***");
        var consola = new Scanner(System.in);
        var salir = false;
        int saldo = 1000;

        while (!salir){
            System.out.print("""
                    **+ Bienvenido al Cajero Automático ***
                    1. Consultar Saldo
                    2. Depositar
                    3. Retirar
                    4. Salir
                    Elige una opción:\s""");

            var opcion = consola.nextInt();

            switch (opcion){
                case 1 -> {
                    // Saldo
                    System.out.println("Su saldo actual es de: $" + saldo);
                }
                case 2 -> {
                    // Deposito
                    int monto;
                    System.out.print("Ingrese el monto a depositar: $");
                    monto = consola.nextInt();
                    saldo += monto;
                    System.out.println("Su saldo actual es: $" + saldo);
                }
                case 3 -> {
                    // Retiro
                    int retiro;
                    System.out.println("Ingrese el monto que desea retirar: $");
                    retiro = consola.nextInt();
                    if (retiro > saldo){
                        System.out.println("No se puede retirar un monto mayor al saldo.");
                    }else{
                        saldo -= retiro;
                        System.out.println("Su saldo actual es: $" + saldo);
                    }

                }
                case 4 -> {
                    // Salida
                    System.out.println("Hasta Pronto!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida...\n");
            }
        }
    }
}
