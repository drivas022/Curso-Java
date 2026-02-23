public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("*** dia de la Semana con Swwitch ***");
        var dia = 1; // Suponiendo que 1 - Lunes, 2 - Martes, etc...

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.printf("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia inválido: " + dia);
                break;
        }

        // Mejorado
        // le podemos colocar {} si necesitamos agregar bastante codigo -> {}
        switch (dia){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.printf("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Dia inválido: " + dia);
        }
    }
}
