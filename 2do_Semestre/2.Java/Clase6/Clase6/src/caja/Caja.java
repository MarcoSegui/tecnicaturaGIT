/*

 */

package caja;

/*
@author: MarcoSegui
*/

public class Caja {
    //Atributos de la clase
    
    double alto;
    double ancho;
    double prof;
    

    public Caja() {   //Constructor 1 (vacio)
        System.out.println("Se ejecuta el constructor numero UNO");
    }

    public Caja(double a, double b, double c) {   //Constructor 2 (inicializa los atributos)
        
        this.alto = a;
        this.ancho = b;
        this.prof = c;
        
        System.out.println("Se ejecuta el constructor numero DOS");
    }
    
       public double calculoVolumen(){
       
       return (alto * ancho * prof);       
   }

   public double calcularVolumenCaja(double a, double b, double c)  { 
        this.alto = a;
        this.ancho = b;
        this.prof = c;
        
        return this.calculoVolumen();    //No es una buena practica       
   } 

}
