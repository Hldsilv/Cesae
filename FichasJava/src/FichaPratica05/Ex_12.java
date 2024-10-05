package FichaPratica05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int i, j;
        int[][] combinado = new int[10][2];

        for (i = 0; i < array1.length; i++) {
            System.out.println("Insira um número no Array1:");
            array1[i] = input.nextInt();

        }
        for (j = 0; j < array2.length; j++) {
            System.out.println("Insira um número no Array2:");
            array2[j] = input.nextInt();

        }

        //ver explicaçao do prof
        for (int h = 0; h < 10; h++) {
            combinado[h][0] = array1[h];
            combinado[h][1] = array2[h];
        }

        //ver explicaçao do prof
        for (int k = 0; k < 10; k++) {
            System.out.println(combinado[k][0] + " " + combinado[k][1]);
        }
    }
}
