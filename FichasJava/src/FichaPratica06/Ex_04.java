package FichaPratica06;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, op;
        System.out.println("numero:");
        num= input.nextInt();
        boolean triangular=false;


        for (int i=1; i<=num;i++){

        op =  i*(i+1)/2;
        if(op==num){
            triangular=true;
        }


        }

        System.out.println(triangular);
    }
}
