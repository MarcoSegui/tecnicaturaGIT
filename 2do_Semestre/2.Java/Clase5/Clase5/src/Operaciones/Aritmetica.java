/*
ATRIBUTOS Y METODOS
 */

package Operaciones;

/*
@author: MarcoSegui
*/

public class Aritmetica {
    //Atributos de la clase
    
    int a; // al ser un valor primitivo por default es 0
    int b;
    
    //Metodos
    
   public void sumarNumeros()   {   //al ser public se puede acceder desde otros archivos, y al ser void este medoto no va a regresar nada, sumarNuemros()es el nombre del metodo
       
       int res = a + b;
       System.out.println("El resultado es: " + res);
       
   }
   
   public int sumarConRetorno() {
       int res = a + b;
       return res;  // return a + b; es otro forma de hacerlo
       
   }
   
   public int sumarConArgumentos(int a, int b)  {   //El alcance de las variables esta dentro del metodo que se definió. JAMAS se pueden la inferencia de tipo de variable "var", siempre defen ser definidas
       this.a = a;   //El argumento a se asigna al atributo this.a (en este caso el uso es opcional, no es necesario, se utiliza para hacer mas legible el código)
       this.b = b;  // Los argumentos y atributos pueden tener el mismo nombre porque el programa sabe diferenciarlos
       //return a + b;
       return this.sumarConRetorno();    //No es una buena practica, pero se puede utilizar el llamado de un metodo por otro metodo dentro de la misma clase
       
   }              

}
