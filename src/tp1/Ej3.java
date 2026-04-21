
package tp1;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Error: n debe ser mayor o igual a 0.");
        } else {
            long resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            System.out.println(n + "! = " + resultado);
        }

        sc.close();
    }
}
