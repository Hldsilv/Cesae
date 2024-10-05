package FichaPratica05;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] ar = new int [10];
        int p, maior, i=1,num;


        for (p=0; p<ar.length; p++){

            System.out.println("Introduza um número no array: ");
            ar[p] = input.nextInt();
        }
        maior = ar[0];

        while (i<ar.length){

            num=ar[i];

                if (num > maior) {

                    if (num % 2 == 0) {
                        maior = num;

                    }
                }

            i++;
        }
        if (maior%2==0){
            System.out.println(maior);
        }else{
           System.out.println("não existe");
        }
    }
}
