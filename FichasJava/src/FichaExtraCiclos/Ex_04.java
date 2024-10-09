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







    }
}
