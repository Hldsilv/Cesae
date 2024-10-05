package FichaPratica05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[5][5];
        int i,j, soma=0;


        for(i=0; i<5; i++) {
            for (j=0; j<5; j++){


            System.out.println("Introduza um número");
            matriz[i][j]= input.nextInt();

        }
        }

        for(i=0; i<5; i++) {
            for (j = 0; j < 5; j++) {
                soma = soma + matriz[i][j];

            }
        }

        System.out.println(soma);
    }
}
