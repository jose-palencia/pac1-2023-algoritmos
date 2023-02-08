package estructurasControl;

import java.util.Scanner;
/*
* Operador logico
* > mayor que
* < menor que
* >= mayor o igual que
* <= menor o igual que
* == comparación
*
* Compuertas logicas
* && => AND ó Y
* || => OR ú O
*/
public class CondicionIf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        
        if (edad >= 16 && edad <= 18 ) {
            System.out.println("Puede particitar con la sub-18");
        } else {
            System.out.println("No puede participar con la sub-18");
        }
        
        
    }
}
