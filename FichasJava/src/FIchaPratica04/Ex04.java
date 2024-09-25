package FIchaPratica04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int  num1,cont=0,contadorDivisoes=0;


        System.out.println("Introduza um número: ");
        num1= input.nextInt();

        while(cont<= num1){
            cont++;

            if(num1 % cont == 0) {
                contadorDivisoes++;
            }
        }

if(contadorDivisoes==2){
    System.out.println("O número é primo");

}else{
    System.out.println("O número não é primo");
}

    }
}
