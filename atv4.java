package ac2.alg;
public class Ac2Alg {
    public static void main(String[] args) {
        
        int jA;
        int jB;
        int jC;
        boolean liberdade;
        int fim = 49;
        int anCa;
        
        jA = 0;
        jB = 0;
        jC = 0;
        int minimum;
        int maximum;
        int randomNum;
        int randNum;
        int dadoA;
        int dadoB;
        int dadoC;
        minimum = 1;
        maximum = 6;
        
        
        do {

              if (jA == 15 | jA == 23 | jA == 36) {
                  System.out.println("\nO jogador A esta numa armadilha, fique uma rodada sem jogar"); 
                  liberdade = false;}
              
              else if (liberdade = true); {
            System.out.println("\nO jogador A deve jogar os dados");
            randomNum = minimum + (int)(Math.random() * maximum);
            randNum = minimum + (int)(Math.random() * maximum);
            System.out.println("O primeiro dado deu: " + randomNum);
            System.out.println("O segundo dado deu: " + randNum);
            dadoA = randomNum+randNum;
            jA = dadoA + jA;
            System.out.println("Jogador A está na casa: " + jA);
                   if (jA> 49) {
                   anCa = jA - fim;
                   jA = 49 - anCa;
                    System.out.println("Volte " + anCa + " casas");}
                         
            
            if (jA == 49){
                System.out.println("Jogador A ganhou.");
            break; }
            }
                   
              
              
        if(jB == 15 | jB == 23 | jB == 36 ) {
            System.out.println("\nO jogador B esta numa armadilha, fique uma rodada sem jogar");
            liberdade = false;}
        
        else if (liberdade = true); {
            System.out.println("\nO jogador B deve jogar os dados");
            randomNum = minimum + (int)(Math.random() * maximum);
            randNum = minimum + (int)(Math.random() * maximum);
            System.out.println("O primeiro dado deu: " + randomNum);
            System.out.println("O segundo dado deu: " + randNum);
            dadoB = randomNum+randNum;
            jB = dadoB + jB;
            System.out.println("Jogador B está na casa: " + jB);
                        if (jB > 49) {
                        anCa = jB - fim;
                        jB = 49 - anCa;
                        System.out.println("Volte " + anCa + " casas");}

            
            if (jB == 49){
                System.out.println("Jogador B ganhou");
            break;}

            }
        
        if(jC == 15 | jC == 23 | jC == 36 ) {
            System.out.println("\nO jogador C esta numa armadilha, fique uma rodada sem jogar");
            liberdade = false;}
        
        else if (liberdade = true); {
            System.out.println("\nO jogador C deve jogar os dados");
            randomNum = minimum + (int)(Math.random() * maximum);
            randNum = minimum + (int)(Math.random() * maximum);
            System.out.println("O primeiro dado deu: " + randomNum);
            System.out.println("O segundo dado deu: " + randNum);
            dadoC = randomNum+randNum;
            jC = dadoC + jC;
            System.out.println("Jogador C está na casa: " + jC);
                        if (jC > 49) {
                        anCa = jC - fim;
                        jC = 49 - anCa;
                                System.out.println("Volte " + anCa + " casas");}

}
        
        if (jC == 49){
                System.out.println("Jogador C ganhou");
        break;}
         
            
            
        }
        while (jA != 49 | jB != 49 | jC != 49);
       
       
    }
    }



    

