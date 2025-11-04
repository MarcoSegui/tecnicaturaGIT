/*
CONSTRUCTORES
 */

package Operaciones;

/*
@author: MarcoSegui
*/

public class PruebaAritmetica {
    public static void main(String[] args) {
               
        //La palabra reservada new reserva un espacio de memoria y ahi hace la asignacion de atributos
        Aritmetica aritmetica1 = new Aritmetica();  //llamamos al cosntructor Aritmetica.java
        
        aritmetica1.a = 3;
        aritmetica1.b = 5;
        
        //Llamamos al Metodo sumarNumeros()
        aritmetica1.sumarNumeros();
        
        //Llamamos al Metodo sumarConRetorno()
        int resultado = aritmetica1.sumarConRetorno();  //No hace falta que la variable se llame igual res = resultado
        
        System.out.println("El resultado con retorno es: " + resultado);
        
        //Llamamos al Metodo sumarConArgumentos        
        resultado = aritmetica1.sumarConArgumentos(2,4);    //Uso los mismos nuemros pero podria usar cualquiera que igual funcionaria
        
        System.out.println("El resultado usando argumentos es: " + resultado);  

    }
}    
