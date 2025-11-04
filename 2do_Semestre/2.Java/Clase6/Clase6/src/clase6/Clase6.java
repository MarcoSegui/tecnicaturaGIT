/*
Palabras return y null
 */

package clase6;

import clasesPersona.Persona;

/*
@author: MarcoSegui
*/

public class Clase6 {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        persona1.nombre = "Marco";
        System.out.println("Nombre de persona1: " + persona1.nombre);
        
        persona1 = cambiarElValor(persona1);
        System.out.println("Nuevo nombre de persona1: " + persona1.nombre);

        
        Persona persona2 = null;
        
        persona2 = cambiarElValor(persona2);
        
        Persona persona3 = new Persona();
        
        persona3 = cambiarElValor(persona3);
        System.out.println("Nombre de la persona3: " + persona3.nombre);

    }
    
    public static Persona cambiarElValor(Persona persona)   {   //metodo tipo Objects (poniendo la clase Persona)
        
        if (persona == null) {
            System.out.println("Valor invalido: null"); //caso de persona2
            return null;
        }   else    {
            persona.nombre = "Antonio";
            return persona; // El return cierra el metodo, por eso siempre tiene que ir a final o bajo una condicion
        }
        
    }
    
    
}


