package Ej5;

import java.util.Scanner;

public class Ej5_Suma_notas {
    public static void main(String[] args) {
        
        var entrada = new Scanner(System.in);
       
        System.out.println("Ingresar la primer calificación de matemática de JhonSmith");
        var num1 = Float.parseFloat(entrada.nextLine());
        
        System.out.println("Ingresar la segunda calificación de matemática de JhonSmith");
        var num2 = Float.parseFloat(entrada.nextLine());
        
        System.out.println("Ingresar la tercera calificación de matemática de JhonSmith");
        var num3 = Float.parseFloat(entrada.nextLine());
        
        var calificacion = (num1 + num2 + num3) / 2;
        
        System.out.println("El promedio de las calificaciones de matemáticas de JhonSmith es " + calificacion);
    }
}
