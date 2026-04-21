package tp1;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMPLEADOS    = 5;
        final int HORAS_NORMAL = 40;

        System.out.println("CALCULO DE SUELDO BRUTO\n");

        for (int i = 1; i <= EMPLEADOS; i++) {
            System.out.println("Empleado " + i + " --");
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            
            System.out.println("Horas trabajadas: ");
            double horas = sc.nextDouble();

            System.out.print("Tarifa por hora : ");
            double tarifa = sc.nextDouble();
            sc.nextLine();

            double sueldo;
            if (horas <= HORAS_NORMAL) {
                sueldo = horas * tarifa;
            } else {
                double horasExtra = horas - HORAS_NORMAL;
                sueldo = (HORAS_NORMAL * tarifa) + (horasExtra * tarifa * 1.5);
            }
            
            System.out.println("Nombre: " + nombre);
            System.out.println("Sueldo bruto: " + sueldo);
        }

        sc.close();
    }
}
   
