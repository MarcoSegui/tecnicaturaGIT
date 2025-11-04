/*
Ejercicio 2: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. (Todos los meses tienen 30 días)
 */

package ejerciciosCiclos;

import java.util.Scanner;

/*
@author: MarcoSegui
*/

public class Ejercicio2_Scanner {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int dia = 0, mes, ano;
        
        while (true)    {
            if (dia == 0) {
                System.out.println("Ingrese el día");
                dia = Integer.parseInt(entrada.nextLine());                
            }
            if (dia <= 30 && dia >= 1) {
                System.out.println("Ingrese el mes (numeros)");
                mes = Integer.parseInt(entrada.nextLine());                
            }   else    {
                System.out.println("ERROR: Ingrese un día entre 1 y 30");
                dia = 0;
                continue;
            }
            if (mes <= 12 && mes >= 1)    {
                System.out.println("Ingrese el año");
                ano = Integer.parseInt(entrada.nextLine());
                break;
            }   else    {
                System.out.println("ERROR: Ingrese un mes entre 1 y 12");
                continue;
            }                            
        }
       
        System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + ano);        
        
    }
}
