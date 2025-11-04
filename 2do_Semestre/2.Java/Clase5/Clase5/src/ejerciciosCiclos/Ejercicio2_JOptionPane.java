/*
Ejercicio 2: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. (Todos los meses tienen 30 días)
 */

package ejerciciosCiclos;

import javax.swing.JOptionPane;

/*
@author: MarcoSegui
*/

public class Ejercicio2_JOptionPane {
    public static void main(String[] args) {
        
        int dia = 0, mes, ano;
        
        while (true)    {
            if (dia == 0) {
                dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día"));                
            }
            if (dia <= 30 && dia >= 1) {
                mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes (en numeros)"));                               
            }   else    {
                JOptionPane.showMessageDialog(null,"Ingrese un día entre 1 y 30", "Error", JOptionPane.ERROR_MESSAGE);
                dia = 0;
                continue;
            }
            if (mes <= 12 && mes >= 1)    {
                ano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));                               
                break;
            }   else    {
                JOptionPane.showMessageDialog(null,"Ingrese un mes entre 1 y 12", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }                            
        }
       
        JOptionPane.showMessageDialog(null,"La fecha ingresada es: " + dia + "/" + mes + "/" + ano);
    }

}
