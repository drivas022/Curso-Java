import java.sql.SQLOutput;
import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de empleados ***");
        var consola = new Scanner(System.in);

        // Nombre de empleado
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        // Edad del empleado
        System.out.print("Edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        // Salario del empleado
        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble((consola.nextLine()));
        
        // Es jefe de departamento
        System.out.print("Es jee de departamento (true/false): ");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());
        
        // Imprimir los valores del empleado
        System.out.println("\nDatos del Empleado: ");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado + " años");
        //System.out.println("\tSalario: " + salarioEmpleado);
        System.out.println("\tSalario: $%.2f".formatted(salarioEmpleado));
        System.out.println("\tes Jefe de Departamento: " + esJefeDepartamento);
        
    }
}
