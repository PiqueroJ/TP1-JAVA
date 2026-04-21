package tp1;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero binario: ");
        int binario = sc.nextInt();

        String binarioStr = String.valueOf(binario);
        
        int decimal     = 0;
        int longitud = binarioStr.length();
        
        int num = 1;
        for (int i = longitud - 1; i >= 0; i--) {
        int bit = binarioStr.charAt(i) - '0';
        decimal += (bit*num);
        num = (num*2);
}
     
        System.out.println("Decimal: " + decimal);
    }
}
