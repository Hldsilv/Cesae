package FichaPratica06;

import java.util.Scanner;
import static FichaPratica06.Ex_05.*;

public class Ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int vetorTamanho, opcao;
        System.out.println("Insira o tamanho do Vetor:");
        vetorTamanho = input.nextInt();
        int[] vetor = new int[vetorTamanho];

        for (int i = 0; i < vetorTamanho; i++) {
            System.out.println("Introduza o valor que pretende inserir na " + i + "posição:");
            vetor[i] = input.nextInt();

        }

        do {
            System.out.println("1- Maior elemento");
            System.out.println("2. Menor elemento");
            System.out.println("3. Crescente ou não crescente");


            System.out.println("Insira uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(maior(vetor));
                    break;
                case 2:
                    System.out.println(menor(vetor));
                    break;
                case 3:
                    if(crescente(vetor)) {
                        System.out.println("Crescente");
                    }
                    else {
                        System.out.println("Não crescente");
                    }
                    break;
            }
        }
    while(opcao!=4);
        }
    }


