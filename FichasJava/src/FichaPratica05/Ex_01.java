package FichaPratica05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] array = new int [10];

        System.out.println( "Insira um número no Array[0]:");
        array[0] = input.nextInt();
        array[1]= input.nextInt();
        array[2]= input.nextInt();
        array[3]= input.nextInt();
        array[4]= input.nextInt();
        array[5]= input.nextInt();
        array[6]= input.nextInt();
        array[7]= input.nextInt();
        array[8]= input.nextInt();
        array[9]= input.nextInt();
        System.out.println(Arrays.toString(array));



    }
}
