package FichaExtraArrayseMatrizes;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array = new int [14];

        for (int i =0; i< array.length; i++) {
            System.out.println("Insira um número no array: ");
            array [i] = input.nextInt();
        }


        for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }
}
