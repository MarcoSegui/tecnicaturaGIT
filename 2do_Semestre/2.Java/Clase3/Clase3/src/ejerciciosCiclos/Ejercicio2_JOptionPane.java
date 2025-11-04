/*
Ejercicio 2: Pedir numeros hasta que se teclee uno negativo y mostrar cuantos numeros se han introducido.
 */

package ejerciciosCiclos;

import javax.swing.JOptionPane;

/*
@author: MarcoSegui
*/

public class Ejercicio2_JOptionPane {
    public static void main(String[] args) {
        
        int num, numTotal = 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        while (num >= 0)    {
            numTotal++;
            JOptionPane.showMessageDialog(null, "Hasta ahora se han ingresado: " + numTotal + " números");
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));           
        }
        
        JOptionPane.showMessageDialog(null, "El ciclo ha finalizado");
        
    }

}
