/*
Ejercicio 2: leer un numero e indicar si es positivo o negativo. Repetir el proceso hasta que se ingrese 0.
 */

package com.myproject.Clase2;

import java.util.Scanner;

/*
@author: MarcoSegui
*/

public class Ejercicio2_Scanner {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);        
        int num;
        String msj;
        
        System.out.println("Digite un numero");
        num = Integer.parseInt(entrada.nextLine());
        
        while (num != 0)    {
            if (num > 0)    {
                msj = "Positivo";
            }   else    {
                msj = "Negativo";
            }            
            System.out.println("El número es: " + msj);
            System.out.println("Digite otro numero");
            num = Integer.parseInt(entrada.nextLine());            
        }
        
        System.out.println("El ciclo ha finalizado");         
        
    }
}

