import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class RevisarNumeroEsPositivo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // Ingresamos un numero
        System.out.print("Ingresa un numero: ");
        int numero = Integer.parseInt(consola.nextLine());
        //long numero = Long.parseLong(consola.nextLine());

        if (numero > 0){
            System.out.println("Numero positivo");
        }else if (numero < 0){
            System.out.println("Numero negativo");
        }else{
            System.out.println("Es cero");
        }
    }
}
