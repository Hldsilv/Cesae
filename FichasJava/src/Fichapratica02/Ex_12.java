package Fichapratica02;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int op;

        System.out.println("Selecione uma das opções: \n1 - Criar\n2 - Atualizar\n3 1- Eliminar\n4 - Sair \n");
        op = input.nextInt();

        switch (op){
            case 1:
                System.out.println("Opção a opção 1 - Criar");
                break;
            case 2:
                System.out.println("Opção a opção 2 - Atualizar");
                break;
            case 3:
                System.out.println("Opção a opção 2 - Eliminar");
                break;
            case 4:
                System.out.println(" ");
                break;
            default: System.out.println("Opção inválida");
        }



    }
}
