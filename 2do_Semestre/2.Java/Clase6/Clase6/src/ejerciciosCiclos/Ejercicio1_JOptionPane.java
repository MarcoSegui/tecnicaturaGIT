/*
Ejercicio 1: Pedir 10 numeros y escribir la suma total.
 */

package ejerciciosCiclos;

import javax.swing.JOptionPane;

/*
@author: MarcoSegui
*/

public class Ejercicio1_JOptionPane {
    public static void main(String[] args) {
        
        int num, suma = 0;
        
        for (int i = 0; i < 10; i++) {            
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el " + (i+1) + "° numero:"));
            suma += num;            
        }
        
        JOptionPane.showMessageDialog(null,"La suma de los numeros ingresados es: " + suma);       
        
    }

}
