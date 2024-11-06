package FichaExtraArrayseMatrizes;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] array = new int [10];
        int pesquisa;
        boolean num = false;

        for (int i =0; i< array.length; i++) {
            System.out.println("Insira um número no array: ");
            array [i] = input.nextInt();
        }

        System.out.println("Qual o número que deseja pesquisar no array :");
        pesquisa = input.nextInt();

        for (int i =0; i< array.length; i++) {

        if(pesquisa==array[i]){
            num= true;
            break;
        }
        }

        if (num){ //if(num) = if (num==true) é uma abreviação
            System.out.println("O número " +pesquisa +" existe no Array.");
        }else{
            System.out.println("O número " +pesquisa +" não existe no Array.");
        }
    }
}
