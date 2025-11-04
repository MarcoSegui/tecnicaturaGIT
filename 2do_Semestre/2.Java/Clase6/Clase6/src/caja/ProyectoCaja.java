/*
Proyecto Cajas: Crear un proyecto segun las especificaciones mostradas a continuacion.

La formula es: Volumen = Ancho * Alto * Profundidad
 */

package caja;

/*
@author: MarcoSegui
*/

public class ProyectoCaja {
    public static void main(String[] args) {
        
        Caja caja1 = new Caja();
        
        caja1.alto = 5;
        caja1.ancho = 8;
        caja1.prof = 6;
        
        System.out.println("Caja 1: " + caja1.alto + " x " + caja1.ancho + " x " + caja1.prof);
        double res1 = caja1.calculoVolumen();
        System.out.println("El volumen de la caja 1 es: " + res1 + " m3");
        
        
        Caja caja2 = new Caja(6,9,7);
        
        System.out.println("Caja 2: " + caja2.alto + " x " + caja2.ancho + " x " + caja2.prof);
        double res2 = caja1.calculoVolumen();
        System.out.println("El volumen de la caja 2 es: " + res2 + " m3");
        
        
        Caja caja3 = new Caja();    // Se vuelve a ejecutar el constructor UNO porque NO le asigno argumentos
        
        System.out.println("El volumen de la caja 3 es: " + caja3.calcularVolumenCaja(7,10,8) + " m3");      
        
        
    }

}
