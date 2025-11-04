/*

 */

package dominio;

/*
@author: MarcoSegui
*/

public class Persona {

    //Atributos
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    //Contructor
    public Persona(String _nombre, double _sueldo, boolean _eliminado)  {   //Como buena practica siempre debe tener el mismo nombre de la clase
    
        nombre = _nombre;   // forma alternativa de this.nombre = nombre; (si hay que cambiar el nombre del parametro)
        sueldo = _sueldo;
        eliminado = _eliminado;
        
    }
    
    //Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }   
    
    
}
