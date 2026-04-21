package tp1;

import java.util.Scanner;

public class Ej8 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de numeros a ingresar: ");
        int n = sc.nextInt();

        if (n <= 0) {
            while(n<=0){
                System.out.println("Error: N debe ser un entero positivo.");
                System.out.println("Ingrese otro numero: ");
                n = sc.nextInt();
            }
        }

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int mayor = 0;
        int menor = 1000;

        for (int i = 1; i < n; i++) {
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }
            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }

        int suma = 0;
        int cant = (mayor - menor);
        for (int i = 0; i < cant; i++) {
            suma += numeros[i];
        }

        System.out.println("\nMayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Suma de numeros entre " + menor + " y " + mayor + ": " + suma);

        sc.close();
    }
}
