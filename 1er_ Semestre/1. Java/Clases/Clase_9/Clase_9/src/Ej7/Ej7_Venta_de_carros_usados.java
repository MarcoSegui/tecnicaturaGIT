import java.util.Scanner;

public class Ej7_Venta_de_carros_usados {
       public static void main(String[] args) {
        
        final int BASE = 1000;   
        var entrada = new Scanner(System.in);
       
        System.out.println("Ingresar la cantidad de carros que vendió Jhon Smith");
        var numCarros = Float.parseFloat(entrada.nextLine());
        
        System.out.println("Ingresar la cantidad de dinero que hizo en ventas Jhon Smith");
        var numVentas = Float.parseFloat(entrada.nextLine());
        
        var salario = BASE + (numCarros * 150) + (numVentas * 0.05);
        
        System.out.println("El salario de este mes de Jhon Smith es de $" + salario);
    }
        
}
