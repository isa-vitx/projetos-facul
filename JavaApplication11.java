package javaapplication11;
import java.util.*;
public class JavaApplication11 {
    
    public static void main(String[] args) {
        int sim = 1;
        int nao = 0;
        int res[] = new int [5];
        
        Scanner entrada = new Scanner(System.in);
        
            System.out.println("\nVocê gostou do produto? 0 para não; 1 para sim");        
            res[0] = entrada.nextInt();
            res[1] = entrada.nextInt();
            res[2] = entrada.nextInt();
            res[3] = entrada.nextInt();
            res[4] = entrada.nextInt();
            
        char rs[] = new char[5];
        String fem = "feminino";
        String masc = "masculino";
        char f = fem.charAt(0);
        char m = masc.charAt(0);
        
        System.out.println("\nDigite seu sexo (fem/masc)");
        rs[0] = entrada.next().charAt(0);
        rs[1] = entrada.next().charAt(0);
        rs[2] = entrada.next().charAt(0);
        rs[3] = entrada.next().charAt(0);
        rs[4] = entrada.next().charAt(0);
            
            
            int cont = 0;
            
            if (res[0] == 1) {
                cont++;
            }
            if (res[1] == 1) {
                cont++;
            }
            if (res[2] == 1) {
                cont++;
            }
            if (res[3] == 1) {
                cont++;
            }
            if (res[4] == 1) {
                cont++;
            }
            System.out.println(cont + " pessoas responderam sim");
           
            cont = 0;
            if (res[0] == 0) {
                cont++;
            }
            if (res[1] == 0) {
                cont++;
            }
            if (res[2] == 0) {
                cont++;
            }
            if (res[3] == 0) {
                cont++;
            }
            if (res[4] == 0) {
                cont++;
            }
            System.out.println(cont + " pessoas responderam nao");
            
            cont = 0;
            double porc = 0;
        if (rs[0] == f && res[0] == 1) {
            cont++;
            porc = cont*5;
        }
        if (rs[1] == f && res[1] == 1) {
            cont++;
            porc = cont*5;
        }
        if (rs[2] == f && res[2] == 1) {
            cont++;
            porc = cont*5;
        }
        if (rs[3] == f && res[3] == 1) {
            cont++;
            porc = cont*5;
        }
        if (rs[4] ==f && res[4] == 1) {
            cont++;
            porc = cont*5;
        }
        System.out.println(porc + "% das mulheres responderam sim");
        
        
        cont = 0;
        porc = 0;
        if (rs[0] == m && res[0] == 0) {
            cont++;
            porc = cont*5;
        }
        if (rs[1] == m && res[1] == 0) {
            cont++;
            porc = cont*5;
        }
        if (rs[2] == m && res[2] == 0) {
            cont++;
            porc = cont*5;
        }
        if (rs[3] == m && res[3] == 0) {
            cont++;
            porc = cont*5;
        }
        if (rs[4] == m && res[4] == 0) {
            cont++;
            porc = cont*5;
        }
        System.out.println(porc + "% dos homens responderam nao");
                     
    }
    } 
  
