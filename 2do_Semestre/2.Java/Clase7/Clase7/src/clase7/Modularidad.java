/*
MODULARIDAD

Metodo setter: modifica el valor del atributo
Metodo getter: obtienen infortmacion del atributo
Deben ser publicos para poder acceder

 */

package clase7;

/*
@author: MarcoSegui
*/

public class Modularidad {
    public static void main(String[] args) {
        
        Persona persona = new Persona("Marco", "Segui");    //Otra forma de hacer, no necesaria en este caso es: Persona persona = new Persona(new String("Marco"), new String("Segui)); para declarar los valores como String
        System.out.println("persona = " + persona); //muestra el id del espacio de memoria donde se guarda
        System.out.println("Persona: " + persona.nombre + " " + persona.apellido);        
        
    }

}

class Persona   {   // al crear una segunda clase no puede ser publica, el modificador de acceso (ej. public) se asigna por defecto el default que no es necesario escribirlo
    
    String nombre;
    String apellido;
    
    Persona (String nombre, String apellido)    {   //Contructor
                
        super();    //Llamada al constructor de la clase Pabre Objets
        //Imprimir imprimir = new Imprimir();
        
        new Imprimir().imprimir(this);
        
        this.nombre = nombre;
        this.apellido = apellido;
        
        System.out.println("Objeto persona usando el this: " + this);   //clase6.Persona@682a0b20
    }
    
}

class Imprimir  {
    public Imprimir()   {
        
        super();    //El constructor de la clase padre para reservar la memoria
        
    }
    
    public void imprimir(Persona persona)    {
        
        System.out.println("Persona desde la clase imprimir: " + persona);  //clase6.Persona@682a0b20
        System.out.println("Impresion del objeto actual (this): " + this);  //clase6.Imprimir@7ba4f24f
        
    }
}
