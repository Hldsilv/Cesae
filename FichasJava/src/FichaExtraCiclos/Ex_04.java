package FichaExtraCiclos;

import java.sql.SQLOutput;

public class Ex_04 {
    public static void main(String[] args) {


        for (int i =1; i<=4;i++){
            System.out.println("**********");

        }

        for (int j =1;j<=5;j++){
            //System.out.println();//aqui dá, mas pq deveria ser em baixo?
            for(int k=0; k<j;k++){
                System.out.print("*");
            }
            System.out.println();//aqui
        }



        //PERCEBER ESTE!!!!!
        for (int j = 1; j <= 5; j++) {
            // Imprimir espaços em branco
            for (int k = j; k < 5; k++) {
                System.out.print(" "); // Espaço em branco
            }
            // Imprimir asteriscos
            for (int k = 1; k <= j; k++) {
                System.out.print("* "); // Asterisco seguido de espaço para separação
            }
            // Mover para a próxima linha
            System.out.println();
        }
    }
}





