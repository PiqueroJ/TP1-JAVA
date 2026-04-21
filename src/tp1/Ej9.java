package tp1;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el radio: ");
        int r = sc.nextInt();

        final double PI = 3.14159;

        double diametro = 2 * r;
        double circunferencia = 2 * PI * r;
        double area = PI * r * r;

        double diametroP = 2 * r;
        double circunferenciaP = 2 * Math.PI * r;
        double areaP = Math.PI * r * r;

        System.out.println("\nCON PI = 3.14159 ");
        System.out.println("Diametro: " + diametro);
        System.out.println("Circunferencia : " + circunferencia);
        System.out.println("Area: " + area);

        System.out.println("\nCON Math.PI ");
        System.out.println("Diametro: " + diametroP);
        System.out.println("Circunferencia : " + circunferenciaP);
        System.out.println("Area: " + areaP);

        sc.close();
    }   
}
