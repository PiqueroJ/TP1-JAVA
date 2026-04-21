package tp1;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cant = 2;
        int numeros[] = new int[cant];
        
        System.out.println("Ingresa los numeros: \n");
        int num;
        for(int i = 0; i < cant; i++){
            num = sc.nextInt();
            numeros[i] = num;
        }

        int menor = 1000;
        int mayor = 0;
        for(int i = 0; i < cant; i++){
            if(menor > numeros[i]){
                menor = numeros[i];
            }
            if(mayor < numeros[i]){
                mayor = numeros[i];
            }
        }
        
        int suma = 0;
        for (int i = menor; i <= mayor; i++) {
            if (i % 5 == 0) {
                suma += i;
            }
        }

        System.out.println("Suma de multiplos de 5 entre " + menor + " y " + mayor + ": " + suma);

        sc.close();
    } 
}
