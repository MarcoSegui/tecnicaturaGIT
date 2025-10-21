
public class Ejercicio_operadores {
    public static void main(String[] args) {
        
        int num1 = 1, num2 = 4;
        int num3 = num1 + 6 - num2;
        
        System.out.println("num3 = " + num3 );
        
        num1 += 1; //+= es lo mismo que decir num1 = num1 + 1
        System.out.println("num1 suma= " + num1);
        
        num1 -= 1;
        System.out.println("num1 resta= " + num1);
        
        num1 *= 2;
        System.out.println("num1 mult = " + num1);
        
        num1 /= 2;
        System.out.println("num1 div = " + num1);
        
        num1 %= 2;
        System.out.println("num1 residuo = " + num1);
    }
    
}
