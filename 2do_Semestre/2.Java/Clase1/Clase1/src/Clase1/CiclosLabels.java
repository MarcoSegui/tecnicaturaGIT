//Las etiquetas (Labels) solo funcionan con el uso de las palabras reservadas Break y Continue
package Clase1;

public class CiclosLabels {
    public static void main(String[] args) {
            
        inicio:
        for ( int i = 1; i < 10 ; i++)   {   // corta el ciclo cuando encuentra un numero par, mostrando solo ese numero par que encontró, el ciclo es cortado desde la etiqueta inicio (es redundante)
            if (i % 2 == 0) {
                  System.out.println("El par es = " + i);
                  break inicio;
            } else  {
                System.out.println("Conteo = " + i);
            }
        }        
        
    }
    
}
