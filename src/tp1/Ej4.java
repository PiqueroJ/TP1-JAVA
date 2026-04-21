package tp1;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            while(n <= 0){
            System.out.println("Error: n debe ser un entero positivo.");
            System.out.println("Ingrese otro: ");
            n = sc.nextInt();
            }
        }
            System.out.println("Divisores de " + n + ": ");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i + " ");
                }
            }
        }

       
    }

