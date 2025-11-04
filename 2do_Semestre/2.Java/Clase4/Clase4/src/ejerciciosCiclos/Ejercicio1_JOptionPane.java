/*
Ejercicio 1: Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos
 */

package ejerciciosCiclos;

import javax.swing.JOptionPane;

/*
@author: MarcoSegui
*/

public class Ejercicio1_JOptionPane {
    public static void main(String[] args) {
        
        int num, suma = 0;
                
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));        
       
        do  {
            suma += num;  
            
            JOptionPane.showMessageDialog(null, "La suma de los numeros ingresados es: " + suma);
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero (cero cierra el ciclo)"));
        }   while(num != 0);
        
        JOptionPane.showMessageDialog(null, "Fin del ciclo");               
        
    }

}
