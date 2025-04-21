public class GeneradorEmail {
    public static void main(String[] args) {
        System.out.println("*** GENERADOR DE EMAILS ***");

        //-----------------  Nombre del Cliente-----------------------
        var nombreCompleto = " Diego Rivas  ";
        System.out.println("nombre = " + nombreCompleto);

        // Limpiar espacios en blanco
        var nombreNormalizado = nombreCompleto.strip().replace(" ", ".").toLowerCase();
        //System.out.println("nombreNormalizado = " + nombreNormalizado);

        //--------------------Datos de la empresa--------------------
        var empresa = "Inforum guatemala ";
        var dominio = "  .com.gt ";
        System.out.println("empresa = " + empresa);
        System.out.println("dominio = " + dominio);

        //Limpiar espacios en blanco
        var empresaNormalizada = empresa.strip().replace(" ", ".").toLowerCase();
        var dominioNormalizado = dominio.toLowerCase().strip();
        
        // Dirección email
        var extensionEmail = "@" + empresaNormalizada + dominioNormalizado;
        System.out.println("extensionEmail = " + extensionEmail);
        var email = nombreNormalizado + extensionEmail;
        System.out.println("email normalizado = " + email);
    }
}
