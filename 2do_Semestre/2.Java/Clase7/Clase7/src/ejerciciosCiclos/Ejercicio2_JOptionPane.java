/*
Ejercicio 2: Diseñar un programa que muestre el producto de los 10 primeros numeros impares
*/

package ejerciciosCiclos;

import javax.swing.JOptionPane;

/*
@author: MarcoSegui
*/

public class Ejercicio2_JOptionPane {
    public static void main(String[] args) {
        
        int prod = 1;
        
        for (int i = 0; i < 20; i++) {
            if  (i % 2 != 0) {
                prod *= i;                
            }            
        }
        
        JOptionPane.showMessageDialog(null, "El producto de los primeros 10 numeros impares es: " + prod);
        
    }

}
