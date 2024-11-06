package FichaPratica05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] array = new int [10];


        for (int i =0; i<10;i++){
            System.out.println("Insira um número no array["+i+"]");
        array[i]=input.nextInt();

        }
       for (int i=0; i< 10; i++){
           System.out.println("array["+i+"]="+array[i]);
       }


    }
}
