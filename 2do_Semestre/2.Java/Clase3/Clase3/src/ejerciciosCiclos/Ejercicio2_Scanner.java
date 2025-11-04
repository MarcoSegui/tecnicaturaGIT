/*
Ejercicio 2: Pedir numeros hasta que se teclee uno negativo y mostrar cuantos numeros se han introducido.
 */

package ejerciciosCiclos;

import java.util.Scanner;

/*
@author: MarcoSegui
*/

public class Ejercicio2_Scanner {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);        
        int num, numTotal;  //tambien se podría poner así: int num, numTotal = 0; y me evito la segunda línea
        numTotal = 0;
        
        System.out.println("Digite un numero");
        num = Integer.parseInt(entrada.nextLine());
        
        while (num >= 0)    {
            numTotal++;            
            System.out.println("Hasta ahora se han ingresado: " + numTotal + " números");
            System.out.println("Digite otro numero");
            num = Integer.parseInt(entrada.nextLine());            
        }
        
        System.out.println("El ciclo ha finalizado");  
    }

}

