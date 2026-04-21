package tp1;

import java.util.Random;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random SECRETO = new Random();
        int numero = SECRETO.nextInt(100) + 1;
        int intento;
        int intentos = 0;

        System.out.println(" ADIVINA EL NUMERO");
        System.out.println("El numero es entre 1 y 100.");

        do {
            System.out.println("\nIngresa tu intento: ");
            intento = sc.nextInt();
            intentos++;

            if (intento < numero) {
                System.out.println("El numero es MAYOR.");
            } else if (intento > numero) {
                System.out.println("El numero es MENOR.");
            }

        } while (intento != numero);

        System.out.println("\nFelicitaciones! Adivinaste el numero " + numero + " en " + intentos + " intentos!");

        sc.close();
    }
}
