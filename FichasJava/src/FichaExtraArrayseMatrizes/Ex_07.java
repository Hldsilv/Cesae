package FichaExtraArrayseMatrizes;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int elementos, remove, contador=0, j=0;


        System.out.println("Quantos elementos quer inserir no Array: ");
        elementos = input.nextInt();

        int[] array = new int[elementos];
        for (int i = 0; i < elementos; i++) {
            System.out.println("Insira um número no array["+i+"]: ");
            array[i] = input.nextInt();
        }

        System.out.println("Qual o valor a remover?");
        remove= input.nextInt();

        for (int i = 0; i < array.length; i++) {

                if(remove==array[i]){

                    contador++;
                }
            }

        int[] newArray = new int[elementos-contador];

        for (int i = 0; i< array.length;i++){
            if (remove!= array[i]){
                newArray[j++]=array[i];
            }
        }





        for (int i = 0; i< newArray.length; i++){
            System.out.println(newArray[i]);
        }


    }
}
