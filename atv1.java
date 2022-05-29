package javaapplication1;
import java.util.*;
public class JavaApplication1 {
    public static void main(String[] args) {
        double sal;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu saldo: ");
        sal = entrada.nextDouble();
        
        if(sal <= 200.00)
        {
            
            System.out.println("Seu saldo médio: " + sal + " O valor do crédito é: " + sal*0.1);
        }
        if(sal > 200.00 && sal <= 300.00)
        {
            
            System.out.println("Seu saldo médio: " + sal + " O valor do crédito é: " + sal*0.2);
        }
        if(sal > 300.00 && sal <= 400.00)
        {
            
            System.out.println("Seu saldo médio: " + sal + " O valor do crédito é: " + sal*0.25);
        }
        if(sal > 400.00)
        {
            
            System.out.println("Seu saldo médio: " + sal + " O valor do crédito é: " + sal*0.3);
        }
    }   
}
