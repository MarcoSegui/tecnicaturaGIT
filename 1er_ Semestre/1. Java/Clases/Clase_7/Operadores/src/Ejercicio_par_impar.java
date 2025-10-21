import java.util.Scanner; //requisito para leer por consola

public class Ejercicio_par_impar {
     public static void main(String[] args) {
        var entrada = new Scanner(System.in);
         System.out.println("Ingresar numero");
         var num = entrada.nextInt(); // establezco ola entra en la var num
         
         if (num % 2 == 0) {    // cuando usamos una linea if else con una sola linea de bloque no hace falta colocar los { }
             System.out.println("El numero es par");
         } else {
             System.out.println("El numero es impar");
         }
    }
}
