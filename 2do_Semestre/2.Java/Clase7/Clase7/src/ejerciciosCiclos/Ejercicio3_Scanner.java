/*
Ejercicio 3: Pedir un numero y calcular su factorial.
 */

package ejerciciosCiclos;

import java.util.Scanner;

/*
@author: MarcoSegui
*/

public class Ejercicio3_Scanner {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num, res;
        
        System.out.println("Ingrese un numero:");
        num = Integer.parseInt(entrada.nextLine());
        
        res = Factorial(num);
        
        System.out.println("El factorial es: " + res);       
        
    }
    
    public static int Factorial(int num)   {
        
        int res = 1;
        
        for (int i = 1; i <= num; i++) {
            res *= i;            
        }
        
        return res;
                
    }       

}
