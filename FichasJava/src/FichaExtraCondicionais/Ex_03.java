package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input   =   new Scanner(System.in);

        int preco;
        double desconto;
        System.out.println("Introduza o preço: ");
        preco= input.nextInt();


        if(preco>100){
            desconto=preco*0.90;
            System.out.println(desconto+ "€ (10% desconto)");

        }else {
            System.out.println(preco+"€ Sem desconto");
        }
    }
}
