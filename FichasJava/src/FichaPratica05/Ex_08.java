package FichaPratica05;

import java.net.SecureCacheResponse;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[3][3];

        System.out.println( "Insira um número no Array:");
        matriz[0][0]= input.nextInt();
        matriz[0][1]= input.nextInt();
        matriz[0][2]= input.nextInt();
        matriz[1][0]= input.nextInt();
        matriz[1][1]= input.nextInt();
        matriz[1][2]= input.nextInt();
        matriz[2][0]= input.nextInt();
        matriz[2][1]= input.nextInt();
        matriz[2][2]= input.nextInt();

       // System.out.println(Arrays.deepToString(matriz)); imprime a matriz toda na mesma linha
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));
        System.out.println(Arrays.toString(matriz[2]));
    }
}
