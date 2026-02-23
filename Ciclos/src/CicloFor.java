public class CicloFor {
    public static void main(String[] args) {
        System.out.println("*** Ciclo For ***");

        // Estructura base para ciclo For (Puede hacerse un ciclo infinito con esta estructura)
        /*
        for(;;){
            System.out.println("Hola");
        }
        */

        for(var contador = 1; contador <= 50; contador++){
            System.out.print(contador + " ");
        }
    }
}
