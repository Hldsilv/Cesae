package FichaPratica05;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] ar = new int [10];
        int maiorPar ;


        for (int p=0; p<ar.length; p++){

            System.out.println("Introduza um número no array: ");
            ar[p] = input.nextInt();
        }
        maiorPar = -1;

        for (int i=0; i<ar.length; i++){

           if(ar[i]%2 == 0) { //se o elemento atual for par

                if (maiorPar %2 != 0) { //se o maiorPar estiver com o primeiro valor ímpar

                    maiorPar = ar[i];
                }
                    if (ar[i] > maiorPar) {  //se o elemeento atual for maior que maiorPar
                        maiorPar = ar[i];

                    }
                }

            i++;
        }
        if (maiorPar%2==0){
            System.out.println("maior par" + maiorPar);
        }else{
           System.out.println("não há pares");
        }
    }
}
