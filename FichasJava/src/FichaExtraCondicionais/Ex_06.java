package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {


        Scanner input   =   new Scanner(System.in);

        int ano;
        System.out.println("Introduza o ano: ");
        ano= input.nextInt();

        if(ano%400==0 || (ano%100!=0 && ano%4==0)){
            System.out.println("Bissexto");
        }else{
            System.out.println("Não bissexto");
        }
    }
}
