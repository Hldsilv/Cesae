package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Scanner input   =   new Scanner(System.in);

        int peso;
        double pesoLua;
        System.out.println("Introduza o peso em Kg: ");
        peso= input.nextInt();


        if(peso>0){
            pesoLua=peso*0.16;
            System.out.println(pesoLua+ "Kg");
        }
    }
}
