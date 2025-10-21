
package Clase1;

public class CiclosBreakContinue {
    public static void main(String[] args) {
        
        for (int i = 1 ; i < 10 ; i++)   {   // corta el ciclo cuando encuentra un numero par, mostrando solo ese numero par que encontró
            if (i % 2 == 0) {
                  System.out.println("Conteo = " + i);
                  break;
            }
        }
                
        for (int i = 0 ; i < 10 ; i++)   {   // le dice al ciclo que continúe cuando encuentra un numero impar, mostrando solo los pares
           if (i % 2 != 0) {
                  continue;
            }
                  System.out.println("Conteo = " + i);
        }
        
    }    
}
