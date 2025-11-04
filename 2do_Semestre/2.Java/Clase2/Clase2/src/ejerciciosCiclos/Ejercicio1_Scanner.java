/*
Ejercicio 1: leer un numero y mostrar su cuadrado hasta que se digite un numero negativo
 */

package ejerciciosCiclos;

import java.util.Scanner;

/*
 * @author: MarcoSegui
*/

public class Ejercicio1_Scanner {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);        
        int num, cuad;
        
        System.out.println("Digite un numero");
        num = Integer.parseInt(entrada.nextLine());
        
        while (num >= 0)    {
            cuad = (int)Math.pow(num, 2);
            System.out.println("El cuadrado del número es: " + cuad);
            System.out.println("Digite otro numero");
            num = Integer.parseInt(entrada.nextLine());            
        }
        
        System.out.println("El ciclo ha finalizado");              
        
    }

}
