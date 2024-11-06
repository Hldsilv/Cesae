package FichaPratica05;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        Scanner input   =   new Scanner(System.in);

        int[][] matriz = new int[3][5];
        int i, j, pesquisa,contador=0;


        for (i=0; i< matriz.length;i++){
            for (j=0; j< matriz[0].length;j++){
                System.out.println("Insira um número na Matriz ["+i +"]["+j +"] ");
                matriz[i][j] = input.nextInt();

            }
        }
        System.out.println("Introduza um número para pesquisar na matriz: ");
        pesquisa = input.nextInt();
        for (i=0; i<matriz.length;i++){
            for (j=0; j<matriz[0].length;j++){

                if(matriz[i][j]== pesquisa){
                    contador++;
                }

            }
        }
        System.out.println("Há "+contador+" posições na matriz com o número "+pesquisa);
    }
}
