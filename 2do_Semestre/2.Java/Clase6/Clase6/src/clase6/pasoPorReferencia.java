/*
 */

package clase6;

import clasesPersona.Persona;  //Se importó desde otro packete

/*
@author: MarcoSegui
*/

public class pasoPorReferencia {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        persona1.nombre = "Marco";
        System.out.println("Nombre de persona1: " + persona1.nombre);
        
        cambiarValor(persona1);     
        
        System.out.println("El nuevo nombre de la persona es: " + persona1.nombre);
    }
    
    public static void cambiarValor(Persona persona)    {   //Parametro por referencia
        
        persona.nombre = "Antonio";        
        
        //Los metodos void por defecto retornan algo, no hacen falta agregarle el return
    }

}
