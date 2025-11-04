/*
Ejercicio 2: Pedir numeros hasta que se introduzca un negativa y calcular la media
*/

package ejerciciosCiclos;

import java.util.Scanner;

/*
@author: MarcoSegui
*/

public class Ejercicio2_Scanner {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num, cont = 0, suma = 0;
        float media = 0;        
                
        System.out.println("Digite un numero");
        num = Integer.parseInt(entrada.nextLine()); 
        
        while   (num >= 0)  {
            cont++;
            suma += num;
            media = (float) suma / cont;    //importante poner el (float) para que el resultado de la cuenta de 2 numeros int pueda dar parcial
            System.out.println("La media hasta ahora es: " + media);
            System.out.println("Digite otro numero");
            num = Integer.parseInt(entrada.nextLine());                    
        }
        
        System.out.println("Fin del ciclo");
        
    }

}
