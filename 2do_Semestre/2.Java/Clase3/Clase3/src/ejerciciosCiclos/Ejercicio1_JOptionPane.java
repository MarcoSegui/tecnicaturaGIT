/*
Ejercicio 1: Leer números hasta que se introduzca cero, indicar para cada uno si es par o impar.
 */

package ejerciciosCiclos;

import javax.swing.JOptionPane;

/*
@author: MarcoSegui
*/

public class Ejercicio1_JOptionPane {
    public static void main(String[] args) {
        
        int num;
        String msj;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        while (num != 0)    {
            if (num % 2 == 0)    {
                msj = "Par";
            }   else    {
                msj = "Impar";
            }
        JOptionPane.showMessageDialog(null, "El número es: " + msj);
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));           
        }
        
        JOptionPane.showMessageDialog(null, "El ciclo ha finalizado"); 
    }

}
