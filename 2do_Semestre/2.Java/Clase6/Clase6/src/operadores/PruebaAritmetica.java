package operadores;

/*
@author: MarcoSegui
*/

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        var c = 10; //Variable local
        int d = 5; // En la ing. en Java el almacenamiento de las variables locales se hace en la Memoria stack
        //En cambio para almacenar un objeto o atributo se hace en la Memoria heap, en ambos casos la memoria trabaja de manera dinámica
        
        //La palabra reservada new reserva un espacio de memoria y ahi hace la asignacion de atributos
        Aritmetica aritmetica1 = new Aritmetica();  //llamamos al cosntructor Aritmetica.java
        
        aritmetica1.a = 3;
        aritmetica1.b = 5;
        /* aritmetica1 = null; Sirve para limpiar los valores de la memoria, pero no se utiliza porque lo hace automaticamente el compilador
        System.gc(); Es otra forma de limpiar la memoria, pero tampoco se utiliza porque es muy pesado
        */
                
        //Ejecucion del Contructor numero UNO
        System.out.println("aritmetica a: " + aritmetica1.a);   //3
        System.out.println("aritmetica b: " + aritmetica1.b);   //5
        
        //Ejecucion del Contructor numero DOS
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 = " + aritmetica2.a);   //5
        System.out.println("aritmetica2 = " + aritmetica2.b);   //8
               
        
        miMetodo(); //LLamo a método creado mas abajo        

    }
    
    
    //MODULARIDAD    
    
    
    public static void miMetodo()   {   
        
       /* c = 5;  //El alcance de las variables no pueden trasender de los metodos, ej. si yo quisiera establecer el valor a una variable creada en el metodo main, no podría, daría error
        //Por eso los atributos no son lo mismo que la svariables, porque tienen un alcance superior a una variable local, trascendiendo entre metodos si los llamamos
       */
        
        System.out.println("Aqui hay otro método");
        
    }

}