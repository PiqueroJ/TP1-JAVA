
package tp1;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cant = 3;
        int numeros[] = new int[cant];

        //Entrada 
        System.out.println("Ingresa los numeros:  \n");
        for(int i = 0; i < cant;i++){
            int num = sc.nextInt();
            numeros[i] = num;
        }

        //Cuántos son diferentes
        int diferentes; 
        if (numeros[0] == numeros[1] && numeros[1] == numeros[2]) {
            diferentes = 0;           
        } else if (numeros[0] == numeros[1] || numeros[1] == numeros[2] || numeros[0] == numeros[2]) {
            diferentes = 1;           
        } else {
            diferentes = 3;           
        }
        
        //Promedio 
        double promedio = (numeros[0] + numeros[1] + numeros[2]) / 3.0;

        //Suma 
        int suma = numeros[0] + numeros[1] + numeros[2];

        //Mayor y menor
        int mayor = 0;
        int menor = 1000;
        int restante;
         for(int i = 0; i < cant;i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        
        int producto = mayor * menor;

        //Número restante
        restante = suma - mayor - menor;

        //Divisibilidad por 3 
        boolean divisible = (restante % 3 == 0);

        //Resultados 
        System.out.println("\nRESULTADOS ");
        System.out.println("Numeros ingresados: ");
        for(int i = 0; i < cant;i++){
            System.out.println("\n" + numeros[i]);
        }
        System.out.println("Hay " + diferentes + " valores diferentes: ");
        System.out.println("Promedio: " + promedio);
        System.out.println("Suma total: " + suma);
        System.out.println("Mayor: " + mayor + "  |  Menor: " + menor);
        System.out.println("Producto: " + producto);
        System.out.println("Numero restante: " + restante);
        System.out.println("Divisible por 3: " + (divisible ? "Si" : "No"));

        sc.close();
    }
}
    
    

