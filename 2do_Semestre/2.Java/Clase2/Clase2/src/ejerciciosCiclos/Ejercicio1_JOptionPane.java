/*
Ejercicio 1: leer un numero y mostrar su cuadrado hasta que se digite un numero negativo
 */

package ejerciciosCiclos;

import javax.swing.JOptionPane;

/*
@author: MarcoSegui
*/

public class Ejercicio1_JOptionPane {
    public static void main(String[] args) {
        
        int num, cuad;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        while (num >= 0)    {
            cuad = (int)Math.pow(num, 2);
            JOptionPane.showMessageDialog(null, "El cuadrado del número es: " + cuad);
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));           
        }
        
        JOptionPane.showMessageDialog(null, "El ciclo ha finalizado");              
        
    }

}
