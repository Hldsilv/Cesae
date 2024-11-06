package FichaExtraArrayseMatrizes;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int elementos;


        System.out.println("Quantos elementos quer inserir no Array: ");
        elementos = input.nextInt();

        int[] array = new int[elementos];
        for (int i = 0; i < elementos; i++) {
            System.out.println("Insira um número no array["+i+"]: ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }

    }
}
