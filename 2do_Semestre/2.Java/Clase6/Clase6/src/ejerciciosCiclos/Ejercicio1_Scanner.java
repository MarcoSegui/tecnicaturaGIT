/*
Ejercicio 1: Pedir 10 numeros y escribir la suma total.
 */

package ejerciciosCiclos;

import java.util.Scanner;

/*
@author: MarcoSegui
*/

public class Ejercicio1_Scanner {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num, suma = 0;
        
        for (int i = 0; i < 10; i++) {            
            System.out.println("Ingrese el " + (i+1) + "° numero:");
            num = Integer.parseInt(entrada.nextLine());
            suma += num;            
        }
        
        System.out.println("La suma de los numeros ingresados es: " + suma);
        
    }   
    

}
