package FichaPratica06;


import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_08 {

    static void somarMatrizes(int[][] matriz, int[][] matriz2) {
        int i = 0, j = 0;

        int[][] soma = new int[3][3];
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                soma[i][j] = matriz[i][j] + matriz2[i][j];

            }

        }

        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {


                System.out.print(soma[i][j]+" | ");

            }
            System.out.println();
        }
    }


    static int somatorioMatrizes(int[][] matriz, int[][] matriz2) {
        int soma1 = 0, somatorio2 = 0;
        int somatorio;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma1 = soma1 + matriz[i][j];
                somatorio2 = somatorio2 + matriz2[i][j];

            }
        }
        somatorio = soma1 + somatorio2;
        System.out.println("O somatório é " +somatorio);
        return somatorio;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int somatorio;
// Inicializar matriz
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println("Introduza um número na matriz[" + i + "][" + j + "]");
                matriz[i][j] = input.nextInt();
                System.out.println("Introduza um número na matriz2[" + i + "][" + j + "]");
                matriz2[i][j] = input.nextInt();
            }
        }
        somarMatrizes(matriz, matriz2);
        somatorio = somatorioMatrizes(matriz, matriz2);



    }
}


