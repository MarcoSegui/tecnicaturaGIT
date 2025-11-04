/*
Prueba de creación de objetos desde la clase Persona.java, es buena practica usar asi las creaciones de objetos desde diferentes clases

La clase persona es nuestra plantilla donde definimos Atributos y Metodos
 */

package Clases;

import Clases.Persona;

/*
@author: MarcoSegui
*/

public class PersonaPrueba {
    public static void main(String[] args) {
        
        Persona persona1; // Se puede hacer así separado o (*)
        persona1 = new Persona();   //Llamamos al constructor desde la clase Persona.java
        
        persona1.nombre = "Marco";  // Se le asigna valor hexagesimal para su almacenamiento en la memoria, normalmente comienza con 0x o @x
        persona1.apellido = "Segui";
        persona1.obtenerInformacion();  //Se llama al método
        
        System.out.println("persona1 = " + persona1);   //obtenemos su ID en la memoria
        System.out.println("persona1 = " + persona1.nombre);    //obtenemos directamente el atributo 
        
        Persona persona2 = new Persona();   // (*) Asi todo junto de una
        
        System.out.println("persona2 = "+ persona2.nombre); //obtenemos null ya que no hay atruibuto designado aún
        
        persona2.nombre = "Vero";
        persona2.apellido = "Nallim";        
        persona2.obtenerInformacion();
        
    }
}
