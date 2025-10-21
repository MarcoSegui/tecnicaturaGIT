import java.util.Scanner;

public class Ejercicio_2_Calculadora_Salario {
    public static void main(String[] args) {
        
         var entrada = new Scanner(System.in);
         
         System.out.println("Ingresar horas trabajadas");
         var horas = entrada.nextLine();
         
           System.out.println("Ingresar salario por hora");
         var salario = entrada.nextLine();
         
         double sueldoTotal = Float.parseFloat(horas) * Float.parseFloat(salario);
         
         System.out.println("Usted cobrará $" + sueldoTotal + " en total" );
                 
    }    
}
