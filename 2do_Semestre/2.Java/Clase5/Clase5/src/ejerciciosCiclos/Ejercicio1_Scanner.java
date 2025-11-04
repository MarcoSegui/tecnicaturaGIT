/*
Ejercicio 1: Pedir un numero N y mostrar todos los numeros del 1 al N
 */

package ejerciciosCiclos;

import java.util.Scanner;

/*
@author: MarcoSegui
*/

public class Ejercicio1_Scanner {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num;    // Otra forma mas resumida de crear variable y leer por scanner:  int num = scanner.nextInt();
                
        System.out.println("Digite un numero");
        num = Integer.parseInt(entrada.nextLine());  
        
        for (int i = 0; i <= num; i++ ) {
            if (i < num) {
                System.out.print(i + ", ");                
            }   else    {
                System.out.println(i);
            }                                              
        }

        System.out.println("Fin del ciclo");
        
    }
}
