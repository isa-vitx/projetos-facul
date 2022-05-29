package javaapplication3;
import java.util.*;
public class JavaApplication3 {
    public static void main(String[] args) {
        int idade;
        double peso;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        
        if (idade < 12) {
            System.out.println("Digite seu peso: ");
            peso = entrada.nextDouble();
            if (peso >= 5 && peso <= 9) {
                System.out.println("A quantidade de gotas será de: " + ((20*125)/500));
            }
            if (peso >= 9.1 && peso <= 16) {
                System.out.println("A quantidade de gotas será de: " + ((20*250)/500));
            }
            if (peso >= 16.1 && peso <= 24) {
                System.out.println("A quantidade de gotas será de: " + ((20*375)/500));
            }
            if (peso >= 24.1 && peso <= 30) {
                System.out.println("A quantidade de gotas será de: " + ((20*500)/500));
            }
            if (peso > 30) {
                System.out.println("A quantidade de gotas será de: " + ((20*750)/500));
            }
         
        }
           else {
                System.out.println("Digite seu peso: ");
                peso = entrada.nextDouble();
            if (peso >= 60) {
                System.out.println("A quantidade de gotas será de: " + (20*2));
            }
            else
            {
                System.out.println("A quantidade de gotas será de: " + ((20*875)/500));
            }
        }
    }
    
}
