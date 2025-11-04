/*
Ejercicio 1: Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos
 */

package ejerciciosCiclos;

import java.util.Scanner;

/*
@author: MarcoSegui
*/

public class Ejercicio1_Scanner {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num, suma;  // int num, suma = 0; es otra forma de hacer acortada
        suma = 0;
                
        System.out.println("Digite un numero (cero cierra el ciclo)");
        num = Integer.parseInt(entrada.nextLine());        
       
        do  {
            suma = suma + num;  // suma+ = num; es otra forma de hacer acortada
            System.out.println("La suma de los numeros ingresados es: " + suma);
            System.out.println("Ingrese otro numero (cero cierra el ciclo)");
            num = Integer.parseInt(entrada.nextLine());          
        }   while(num != 0);
        
        System.out.println("Fin del ciclo");               
        
    }

}
