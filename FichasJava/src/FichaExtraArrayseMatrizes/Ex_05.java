package FichaExtraArrayseMatrizes;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] array = new int[12];



        for (int i = 0; i < array.length; i++) {
            System.out.println("Insira um número no array["+i+"]: ");
            array[i] = input.nextInt();
        }



        for (int i = 0; i < array.length; i++) {

            for(int j=i+1; j< array.length; j++){

                if(array[i]==array[j]){

                    System.out.println(array[i]);
                }



            }
        }




    }
}
