package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {


        Scanner input   =   new Scanner(System.in);

        String letra;
        System.out.println("Introduza a letra: ");
        letra= input.next();


        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o")||letra.equals("u")) {
            System.out.println("Vogal");
        }else{
            System.out.println("Consoante");
        }
    }
}
