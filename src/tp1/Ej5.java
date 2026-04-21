package tp1;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cant = 10;

        System.out.println("Ingresa un numero entero: ");
        int n = sc.nextInt();
        if (n < 1 || n > 10) {
            while(n < 1 || n > 10){
            System.out.println("Error: n debe ser entre 1 y 10");
            System.out.println("Ingrese otro: ");
            n = sc.nextInt();
            }

        System.out.println("\nTabla del " + n + ":");
        for (int i = 1; i <= cant; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
    }
}
