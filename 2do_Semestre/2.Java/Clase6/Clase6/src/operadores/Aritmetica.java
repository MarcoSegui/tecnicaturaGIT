/*

 */

package operadores;

/*
@author: MarcoSegui
*/

public class Aritmetica {
    //Atributos de la clase
    
    int a; // al ser un valor primitivo por default es 0
    int b;
    
    //El contructor es un metodo especial
    public Aritmetica() {   //Constructor 1 (vacio)
        System.out.println("Se ejecuta el constructor numero UNO");
    }
    
    //Sobrecarga de constructores
    public Aritmetica(int a, int b) {   //Constructor 2 (inicializa los atributos)
        
        this.a = a; //la palbra reservada this. apunta al atributo, si no la colocamos se coloca automaticamente PERO la variable que recibimos debe llamarse diferente al atributo.
        this.b = b;  //Por ejemplo en vez de this.b = b; seria b = num2; y arriba deberiamos cambiar la variabnle recibica por Aritmetica(int num1, int num2) en este caso toma b como this.b automaticamente
        
        System.out.println("Se ejecuta el constructor numero DOS");
    }                       

}
