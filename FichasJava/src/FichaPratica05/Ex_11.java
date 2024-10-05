package FichaPratica05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {


       /* Faça um programa que preencha cada posição de uma matriz (3x3 elementos inteiros) com um valor introduzido
        pelo utilizador. Deverá indicar qual o maior e qual o menor dos valores guardados na matriz, e deverá imprimir
        todo o conteúdo da matriz de forma semelhante ao exercício 8.*/

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int i, j, maior, menor ;


        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Insira um número na Matriz [" + i + "][" + j + "] ");
                matriz[i][j] = input.nextInt();

            }
        }

        maior = matriz[0][0];

        for (i = 0; i < matriz.length; i++) {
            for (j = 1; j <matriz[0].length; j++) {


                if (matriz[i][i] > maior) {
                    maior = matriz[i][i];

                }
            }

        }
        menor = matriz[0][0];

        for (i = 0; i < matriz.length; i++) {
            for (j = 1; j < matriz[0].length; j++) {


                if (matriz[i][i] > maior) {
                    maior = matriz[i][i];

                }
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));
        System.out.println(Arrays.toString(matriz[2]));
    }
}
