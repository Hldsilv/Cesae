package FichaPratica05;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] array = new int [10];
        int p, compara, i=1;
        boolean crescente = true;

        for (p=0; p<array.length; p++){

            System.out.println("Introduza um número no array: ");
            array[p] = input.nextInt();
        }

        compara =array[0];

        while(i< array.length){


            if(array[i]<=compara){

                crescente = false;
                break;
            }
            compara =array[i];
        i++;
        }

        if(crescente == false) {

            System.out.println(" Não é crescente!");

        }else{
            System.out.println("É crescente!");
        }




    }
}
