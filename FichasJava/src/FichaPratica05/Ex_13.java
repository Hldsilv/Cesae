package FichaPratica05;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[4][4];
        int i,j, soma=0;


        for(i=0; i<4; i++) {
            for (j=0; j<4; j++){


                System.out.println("Introduza um número");
                matriz[i][j]= input.nextInt();

            }
        }

        for(i=0; i<4; i++) {

            soma = soma + matriz[i][i];
            }


        System.out.println(soma);
    }
}
