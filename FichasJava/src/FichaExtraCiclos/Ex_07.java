package FichaExtraCiclos;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        int positivo=0, negativo=0, i=0, num;
        System.out.println("Introduza um número: ");
        num = input.nextInt();

        while (num!=0) {


            if(num>0){
                positivo++;
            }else{
                negativo++;
            }
            System.out.println("Introduza um número: ");
            num = input.nextInt();
        }
        System.out.println("Introduziu "+positivo+" vezes o número positivo");
        System.out.println("Introduziu "+negativo+" vezes o número negativo");
    }
}
