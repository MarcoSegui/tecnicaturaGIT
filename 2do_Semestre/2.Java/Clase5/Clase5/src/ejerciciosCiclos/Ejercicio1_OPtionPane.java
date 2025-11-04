/*
Ejercicio 1: Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos

 */

package ejerciciosCiclos;

import javax.swing.JOptionPane;

/*
@author: MarcoSegui
*/

public class Ejercicio1_OPtionPane {
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero")); 
        
        String numN = "";
        
        for (int i = 0; i <= num; i++ ) {
            numN += i;
            if (i < num) {
                numN += ", ";
            }                                              
        }
        
        JOptionPane.showMessageDialog(null,numN); 
        
        JOptionPane.showMessageDialog(null, "Fin del ciclo");  
    }

}
