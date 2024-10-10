package FichaPratica05;

import java.net.SecureCacheResponse;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[3][3];

       for (int i=0; i<=2;i++){
            for( int j = 0; j<= 2; j++){
                System.out.println("Introduza um número na matriz["+i+"]["+j+"]");
                matriz[i][j]=input.nextInt();
            }
        }

        for (int i=0; i<=2;i++){

                System.out.println(Arrays.toString(matriz[i]));

            }
        }
    }

