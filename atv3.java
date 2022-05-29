package javaapplication1;
import java.util.*;
public class JavaApplication1 {


    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double valor;
    double valor1;
    double valor2;
    double valor3;
    double valor4;
    double valor5;
    double valor6;
    double valor7;
    
    int m1;
    double m50;
    double m25;
    double m10;
    double m5;
    double m01;
    
    m1 = 1;
    m50 = 0.50;
    m25 = 0.25;
    m10 = 0.10;
    m5 = 0.05;
    m01 = 0.01;
    
    System.out.println("Digite um valor: ");
        valor = entrada.nextDouble();
    valor1 = valor/1;
    valor2 = valor1%m1;
    valor3 = valor2%m50;
    valor4 = valor3%m25;
    valor5 = valor4%m10;
    valor6 = valor5%m5;
    valor7 = valor6%m01;

    double mr1;
    double mr2;
    double mr3;
    double mr4;
    double mr5;
    double mr6;
    
    mr1 = valor1 - valor2;
    mr2 = valor2/m50;
    mr3 = valor3/m25;
    mr4 = valor4/m10;
    mr5 = valor5/m5;
    mr6 = valor6/m01 + valor7;
    
        int i1 = (int) mr1;
        int i2= (int) mr2;
        int i3 = (int) mr3;
        int i4 = (int) mr4;
        int i5 = (int) mr5;
        int i6 = (int) mr6;


        if (valor1 > 1 ) {
                System.out.println("\nMoedas de 1 real: " + i1);
        if (valor2 < m1 && valor2 >= m50) 
                System.out.println("Moedas de 50 centavos: " + i2);
        if (valor3 < m50 && valor3 >= m25) 
                System.out.println("Moedas de 25 centavos: " + i3);
        if (valor4 < m25 && valor4 >= m10) 
                System.out.println("Moedas de 10 centavos: " + i4);
        if (valor5 < m10 && valor5 >= m5) 
                System.out.println("Moedas de 5 centavos: " + i5);
        if (valor6 < m5 || valor6 >= m01) 
                System.out.println("Moedas de 1 centavo: " + i6);
        }
            System.out.println("\nQuantidade total de moedas usadas: " + (i1+i2+i3+i4+i5+i6));
        }
    }  
