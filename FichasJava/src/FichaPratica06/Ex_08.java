package FichaPratica06;

import java.util.Scanner;

public class Ex_08 {


    static void somarMatrizes(int[][] matriz, int[][] matriz2) {
        int i=0,j=0;
        int soma=0;
        for (i = 0; i < matriz.length; i++) {
            for ( j = 0; j < matriz[i].length; j++) {
            soma=matriz[i][j]+matriz2[i][j];
            }
            System.out.println(soma);
}


//    static void somaotorioMatrizes(int[][] matriz, int[][] matriz2){
//
//        int somatorio=0;
//
//        for (i = 0; i < matriz.length; i++) {
//            for ( j = 0; i < matriz[j].length; j++) {
//                somatorio = somatorio + matriz[i][j];
//                //matriz2 = matriz2 + matriz2[i][j];
//            }
//        }
//
//
//    }




    }





    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[ ][ ] matriz1 = new int[3][3];
        int[ ][ ] matriz2 = new int[3][3];
        int somatorio;
// Inicializar matriz
        for (int i=0; i<=2;i++){
            for( int j = 0; j<= 2; j++){
                System.out.println("Introduza um número na matriz["+i+"]["+j+"]");
                matriz1[i][j]=input.nextInt();
                matriz2[i][j]=input.nextInt();
            }
        }
        somarMatrizes(matriz1, matriz2);
      //  somatorio = somatorioMatrizes(matriz1, matriz2);

    }

}
