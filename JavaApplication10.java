package javaapplication10;
import java.util.*;
public class JavaApplication10 {
    public static void main(String[] args) {
        
        // salários
        double sal[]= new double[3];

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite aqui os salários");
        sal[0] = entrada.nextDouble();
        sal[1] = entrada.nextDouble();
        sal[2] = entrada.nextDouble();
        
        double sall;
        sall = sal[1] + sal[2] + sal[0];
        
        double medsal;
        medsal = sall/5;
        
        System.out.printf("\nA média salarial dos cidadãos é: " + "%.2f %n", medsal);
        
        //filhos
        int filhos[] = new int[3];
        int medfi;
        
        System.out.println("\nDigite aqui quantos filhos você tem");
        filhos[0] = entrada.nextInt();
        filhos[1] = entrada.nextInt();
        filhos[2] = entrada.nextInt();
        
        int fiall = filhos[0] + filhos[1] + filhos[2];
        medfi = fiall/3;
        
        System.out.println("\nA média de filhos é de: " + medfi);
        
        
        // maior salário
        if (sal[0] > sal[1] && sal[0] > sal[2]) {
            System.out.println("\nO maior salário é: " + sal[0]);
        }
        else if (sal[1] > sal[0] && sal[1] > sal[2]) {
            System.out.println("\nO maior salário é: " + sal[1]);
        }
        else {
            System.out.println("\nO maior salário é: " + sal[2]);
        }
        
        // perc. < 100.00
        int cont = 0;
        
            if (sal[0] <= 100) {
                System.out.println("\nEste salário é menor que 100,00: " + sal[0]);
                cont++;
            } 
            if (sal[1] <= 100) {
                System.out.println("\nEste salário é menor que 100,00: " + sal[1]);
                cont++;
            }
            if (sal[2] <= 100) {
                System.out.println("\nEste salário é menor que 100,00: " + sal[2]);
                cont++;
            }
            
            switch (cont) {
                case 1 -> System.out.println("\n33.33% tem o salário menor que 100");
                    
                case 2 -> System.out.println("\n66.66% tem o salário menor que 100");
                    
                case 3 -> System.out.println("\n100% tem o salário menor que 100");
                    
                default -> System.out.println("\nNinguem tem o salário menor que 100");
            }
            
        }
} 

        
     
