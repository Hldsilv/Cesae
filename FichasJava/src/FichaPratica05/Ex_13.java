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

        for (int u = 0; u < matriz.length; u++) {
            for (int o = 0; o < matriz[0].length; o++) {
                System.out.print(matriz[u][o]+"\t|\t");    /* \t = a dar tab ou seja um espaço grande*/


            }
            System.out.println();
        }

        for (k = 0; k < 4; k++) {

                soma = soma + matriz[k][k];

        }
        System.out.println(soma);
    }
}

