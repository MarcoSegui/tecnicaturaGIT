/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java
 */
package libroautor;

import java.util.Scanner;

public class LibroAutor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingresar el nombre del libro: ");
        String nombreLibro = scan.nextLine();
        
        System.out.print("Ingresar el nombre del autor: ");
        String nombreAutor = scan.nextLine();
        
        System.out.println("\nEl libro " + nombreLibro + " fue escrito por " + nombreAutor);
        
        scan.close();
    }
}