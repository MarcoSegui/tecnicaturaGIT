/*
Ejercicio 2: leer un numero e indicar si es positivo o negativo. Repetir el proceso hasta que se ingrese 0.
*/

package com.myproject.Clase2;

import javax.swing.JOptionPane;

/*
@author: MarcoSegui
*/

public class Ejercicio2_JOptionPane {
    public static void main(String[] args) {
        
        int num;
        String msj;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        while (num != 0)    {
            if (num > 0)    {
                msj = "Positivo";
            }   else    {
                msj = "Negativo";
            }
        JOptionPane.showMessageDialog(null, "El número es: " + msj);
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));           
        }
        
        JOptionPane.showMessageDialog(null, "El ciclo ha finalizado"); 
        
        
        
    }

}
