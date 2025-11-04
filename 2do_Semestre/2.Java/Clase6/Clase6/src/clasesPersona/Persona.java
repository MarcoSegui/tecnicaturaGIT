/*
Atributos, Metodos, Creacion de objetos
 */

package clasesPersona;

/*
@author: MarcoSegui
*/

public class Persona {
    
    //Atributos de la clase (Caracteristicas)
    public String nombre;   //Estamos especificando que el atr8ibuto es de tipo publico para poder acceder de otro paquete
    public String apellido;
    
    //Metodos de la clase (Acciones)
    public void obtenerInformacion()    {
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);

    }
}
