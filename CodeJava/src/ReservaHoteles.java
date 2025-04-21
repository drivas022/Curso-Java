public class ReservaHoteles {
    public static void main(String[] args) {
        System.out.println("*** RESERVA DE HOTELES ***");
        var nombreCliente = "Pedro";
        var diasEstancia = 5;
        var $tarifaDiaria = 500;
        var vistaAlMar = true;

        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("$tarifaDiaria = " + $tarifaDiaria);
        System.out.println("vistaAlMar = " + vistaAlMar);
        System.out.println("-------------------------------------");
        //Modificación
        System.out.println("Nuevos datos reserva...");
        diasEstancia = 2;
        $tarifaDiaria = 200;
        vistaAlMar = false;

        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("$tarifaDiaria = " + $tarifaDiaria);
        System.out.println("vistaAlMar = " + vistaAlMar);
    }
}
