package Fichapratica03;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        Scanner input   =   new Scanner(System.in);

        int var1,i=2;

        System.out.println("Insira um número maior que 2: ");
        var1= input.nextInt();


while( i<= var1){
    System.out.println(i);
    i= i +2;

}


    }
}
