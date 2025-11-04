/*
Ejercicio 3: Realizar un juego para adivinar un numero, para ello generar un numero al azar entre el 1 al 100 y luego pedir numeros indicando si es mayor o menor con respecto a N. El proceso termina cuando el usuario acierta y mostramos el numero de intentos.
*/

package ejerciciosCiclos;

import javax.swing.JOptionPane;

/*
@author: MarcoSegui
*/

public class Ejercicio3_JOptionPane {
    public static void main(String[] args) {
        
        int num;
        int numTotal = 0;
        int numN = (int)(Math.random() * 100);
        String msj;
          
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero hasta descubrir el numero N"));
        
        while (num != numN)    {
            numTotal++;
            if (num > numN) {
                msj = "MAYOR";                 
            } else  {
                msj = "MENOR";
            }  
            JOptionPane.showMessageDialog(null, "El numero ingresado es " + msj + " al número N");
            JOptionPane.showMessageDialog(null, "Hasta ahora has ingresado " + numTotal + " intentos");
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));            
        }
        
        JOptionPane.showMessageDialog(null, "Felicidades, GANASTE, " + numN + " era el número correcto");
        JOptionPane.showMessageDialog(null, "El ciclo ha finalizado con " + numTotal + " intentos"); 
        
    }

}
