package FichaExtraArrayseMatrizes;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int pesquisa;


        for (int i = 0; i < array.length; i++) {
            System.out.println("Insira um número no array["+i+"]: ");
            array[i] = input.nextInt();
        }

        System.out.println("Qual o número que deseja pesquisar no array :");
        pesquisa = input.nextInt();

        for (int i = 0; i < array.length; i++) {

            if (pesquisa == array[i]){
                System.out.println("array["+i+"]");

            }
        }


    }
}

