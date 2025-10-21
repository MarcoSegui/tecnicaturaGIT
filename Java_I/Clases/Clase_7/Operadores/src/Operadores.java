public class Operadores {
    public static void main(String[] args) {
        //para inicializar 2 variables en la misma linea tienen que ser del mismo tipo
                
        int num1 = 40 , num2 = 100;
        var res = num1 + num2; // aca la variable res se setea como int para el resto del codigo
        System.out.println("resultado suma = " + res);
        
        res = num2 - num1;
        System.out.println("resultado resta = " + res);
        
        res = num1 * num2;
        System.out.println("resultado multiplicacion = " + res);
        
        res = num2 / num1; //si las variables con la que se hace la division son numeros enteros (declarados enteros) el resultado no va a ser float, al menos que alguno de los dos numeros sea double (reales)
        System.out.println("resultado división = " + res);
        
        var res2 = 3.4 / num1; // por eso tenemos que crear una nueva la variable que no este seteada aun 
        System.out.println("resultado division double = " + res2);
        //no es lo mismo double que float, agregando una D detras del numero lo seteas como double, si le agregas una F lo seteas como float
        
        res = num1 % num2; //guarda el residuo entero de la division por ej. 5/4 el residuo es 1, en caso de que el numero divisor sea mas grande, por ej. 4/5 el residuo es el mismo numero, 4
        System.out.println("resultado porcentual = " + res);
        

    }
}
