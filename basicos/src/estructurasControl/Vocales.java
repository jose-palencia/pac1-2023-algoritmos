package estructurasControl;

import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {
        // switch (variable) { caso1, caso2, caso 3, ...}
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Mostrar frutas por vocal");
        System.out.println("------------------------\n");
        
        System.out.println("Ingrese una vocal");
        char vocal = sc.next().charAt(0);
        
        switch (vocal) {
            case 'a': case 'A':
                System.out.println(
                        "Arandano, Annona, Aguacate, Albaricoque, Almendra");
                break;
            case 'e':
                System.out.println(""
                        + "Elote, Ejote");
                break;
            case 'i':
                System.out.println("Icaco, Ilama, Imbe");
                break;
            case 'o':
                System.out.println("Olivas, Oroblanco");
                break;
            case 'u':
                System.out.println("Uvas, ...");
                break;
            default:
                System.out.println("No es una vocal valida");
                break;
        }
        
    }
}
