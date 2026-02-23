public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("** Formateo de Cadenas **");
        var nombre = "Matias";
        var edad = 35;
        var salario = 21000.50;

        // String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario);
        System.out.println(mensaje);

        // Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n", nombre, edad, salario);

        var numeroEmpleado = 1432;
        // Formateo con text block
        mensaje = """
                %nDetalle Persona:\s
                -------------------
                \tNombre: %s
                \tEdad: %d años
                \tSalario $%.2f
                \tNo. Empleado: %04d // se rellena si no se tienen 4 digitos.
                """.formatted(nombre, edad, salario, numeroEmpleado);
        System.out.println(mensaje);

        // Formateo con text block y printf directamente
        System.out.printf("""
                %nDetalle Persona:\s
                -------------------
                \tNombre: %s
                \tEdad: %d años
                \tSalario $%.2f
                \tNo. Empleado: %04d 
                """, nombre, edad, salario, numeroEmpleado);
    }
}
