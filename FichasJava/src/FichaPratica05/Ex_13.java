package FichaPratica05;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[4][4];
        int i,j, soma=0,k,l;


        for(i=0; i<4; i++) {
            for (j=0; j<4; j++){

                System.out.println("Introduza um número");
                matriz[i][j]= input.nextInt();
            }
        }


        for (k = 0; k < 4; k++) {
            for (l = 0; l < 4; l++) {
                soma = soma + matriz[k][l];
            }
        }
        System.out.println(soma);
    }
}
