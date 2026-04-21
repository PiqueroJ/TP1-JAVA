
package tp1;

import java.util.Scanner;


public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el anio: ");
        int anio = sc.nextInt();

        boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

        if (bisiesto) {
            System.out.println(anio + " ES bisiesto.");
        } else {
            System.out.println(anio + " NO es bisiesto.");
        }

        sc.close();
    }
}
