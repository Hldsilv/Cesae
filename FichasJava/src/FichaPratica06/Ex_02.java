package FichaPratica06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex_02 {
    /**

     * @param args
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numint = -1;
        while (numint < 0) {
            System.out.println("Introduza um número inteiro:");
            numint = input.nextInt();
        }
        asterisco(numint);
    }
        public static void asterisco(int numint){

            String ast= "*";
            int i;
            for (i=1; i<numint;i++){
                ast = ast +"*";
            }
            System.out.println(ast);

        }

    }

