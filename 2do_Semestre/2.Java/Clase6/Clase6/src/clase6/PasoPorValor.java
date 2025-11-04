package clase6;

/*
@author: MarcoSegui
*/

public class PasoPorValor {
    public static void main(String[] args) {
        
        var valorX = 20;
        System.out.println("valorX: " + valorX);
        cambioValor(valorX);    //se envía una copia del valor de la variable local, ya que la variable local no puede ser modificada en el metodo
        System.out.println("valorX: " + valorX);

        
    }

public static void cambioValor(int arg1)   {
    
    System.out.println("arg1: " + arg1);
    arg1 = 15;
    System.out.println("arg1: " + arg1);

}
    
}
