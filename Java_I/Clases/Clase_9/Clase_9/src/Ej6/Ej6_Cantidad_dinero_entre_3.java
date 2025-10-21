package Ej6;

import java.util.Scanner;

public class Ej6_Cantidad_dinero_entre_3 {
    public static void main(String[] args) {
       
        var entrada = new Scanner(System.in);
       
        System.out.println("Ingresar la cantidad de dólares que posee Guillermo");
        var num = Float.parseFloat(entrada.nextLine());
        
        var total = num + (num / 2) + ((num + (num/2)) / 2);
        
        System.out.println("Entre Guille, Juan y Luis tiene $" + total + " en total" );
                
    }
}
