package FichaExtraArrayseMatrizes;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int elementos, adiciona, posicao, j=0;


        System.out.println("Quantos elementos quer inserir no Array: ");
        elementos = input.nextInt();

        int[] array = new int[elementos];
        for (int i = 0; i < elementos; i++) {
            System.out.println("Insira um número no array["+i+"]: ");
            array[i] = input.nextInt();
        }

        System.out.println("Qual o novo valor que quer colocar?");
        adiciona= input.nextInt();

        System.out.println("Em que posição quer colocar esse valor?");
        posicao= input.nextInt();


        int[] newArray = new int[elementos+1];

        for (int i = 0; i< array.length;i++){
            if (posicao== j){

                newArray[j++]=adiciona;

            }
            newArray[j++]=array[i];

            }

        if (posicao==array.length){
            newArray[j]=adiciona;
        }

        for (int i = 0; i< newArray.length; i++){
            System.out.println(newArray[i]);
        }

    }
}
