/*
Ejercicio 2: Pedir numeros hasta que se introduzca un negativa y calcular la media
 */

package ejerciciosCiclos;

import javax.swing.JOptionPane;

/*
@author: MarcoSegui
*/

public class Ejercicio2_JOptionPane {
    public static void main(String[] args) {
                    
        int num, cont = 0, suma = 0;
        float media = 0;        
                
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero")); 
        
        while   (num >= 0)  {
            cont++;
            suma += num;
            media = (float) suma / cont;    //importante poner el (float) para que el resultado de la cuenta de 2 numeros int pueda dar parcial
            JOptionPane.showMessageDialog(null,"La media hasta ahora es: " + media);
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));                    
        }
        
        JOptionPane.showMessageDialog(null,"Fin del ciclo");
        
    }

}
