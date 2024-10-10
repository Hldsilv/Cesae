package FichaPratica05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] array = new int [10];


//        array[0]= input.nextInt();
//        array[1]= input.nextInt();
//        array[2]= input.nextInt();
//        array[3]= input.nextInt();
//        array[4]= input.nextInt();
//        array[5]= input.nextInt();
//        array[6]= input.nextInt();
//        array[7]= input.nextInt();
//        array[8]= input.nextInt();
//        array[9]= input.nextInt();
        for (int i =0; i<10;i++){
            System.out.println("Insira um número no array["+i+"]");
        array[i]=input.nextInt();

        }
       for (int i=0; i< 10; i++){
           System.out.println("array["+i+"]="+array[i]);
       }


    }
}
