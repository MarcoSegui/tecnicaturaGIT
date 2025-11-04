/*
Ejercicio 3: Realizar un juego para adivinar un numero, para ello generar un numero al azar entre el 1 al 100 y luego pedir numeros indicando si es mayor o menor con respecto a N. El proceso termina cuando el usuario acierta y mostramos el numero de intentos.
 */

package ejerciciosCiclos;

import java.util.Scanner;

/*
@author: MarcoSegui
*/

public class Ejercicio3_Scanner {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);        
        int num;
        int numTotal = 0;
        int numN = (int)(Math.random() * 100);
        String msj;
          
        System.out.println("Digite un numero hasta descubrir el numero N");
        num = Integer.parseInt(entrada.nextLine());
        
        while (num != numN)    {
            numTotal++;
            if (num > numN) {
                msj = "MAYOR";                 
            } else  {
                msj = "MENOR";
            }  
            System.out.println("- El numero ingresado es " + msj + " al número N -");
            System.out.println("* Hasta ahora has ingresado " + numTotal + " intentos *");
            System.out.println("Digite otro numero");
            num = Integer.parseInt(entrada.nextLine());            
        }
        
        System.out.println("Felicidades, GANASTE, " + numN + " era el número correcto");        
        System.out.println("El ciclo ha finalizado con " + numTotal + " intentos");  
        
    }

}
