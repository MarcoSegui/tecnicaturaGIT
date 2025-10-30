/*
Ejercicio 1: Leer números hasta que se introduzca cero, indicar para cada uno si es par o impar.
 */

package clase3;

import java.util.Scanner;

/*
@author: MarcoSegui
*/

public class Ejercicio1_Scanner {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);        
        int num;
        String msj;
        
        System.out.println("Digite un numero");
        num = Integer.parseInt(entrada.nextLine());
        
        while (num != 0)    {
            if (num % 2 == 0)    {
                msj = "Par";
            }   else    {
                msj = "Impar";
            }            
            System.out.println("El número es: " + msj);
            System.out.println("Digite otro numero");
            num = Integer.parseInt(entrada.nextLine());            
        }
        
        System.out.println("El ciclo ha finalizado"); 
    }

}
