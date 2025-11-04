/*
Ejercicio 3: Pedir un numero y calcular su factorial.
 */

package ejerciciosCiclos;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
@author: MarcoSegui
*/

public class Ejercicio3_JOptionPane {
    public static void main(String[] args) {
           
        int num, res;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
        
        res = Factorial(num);
        
        JOptionPane.showMessageDialog(null,"El factorial es: " + res);       
        
    }
    
    public static int Factorial(int num)   {
        
        int res = 1;
        
        for (int i = 1; i <= num; i++) {
            res *= i;            
        }
        
        return res;
                
    }       

}