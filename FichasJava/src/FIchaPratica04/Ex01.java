package FIchaPratica04;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double num1,num2,soma, sub, multi, divi;
        String opcao,cont;
        System.out.println("Introduza um número: ");
        num1= input.nextInt();
        System.out.println("Introduza um número: ");
        num2= input.nextInt();


    do {

        System.out.println("+ - Soma");
        System.out.println("- - Subtração");
        System.out.println("* - Multiplicação");
        System.out.println("/ - Divisão");
        System.out.println(". - Sair");

        System.out.println("Insira uma opção: ");
        opcao= input.next();

        switch (opcao){
            case "+":
                System.out.println("Escolheu a opçao de somar");
                soma=num1+num2;
                System.out.println(soma);
                break;
            case "-":
                System.out.println("Escolheu a opçao de subtrair");
                sub=num1-num2;
                System.out.println(sub);
                break;
            case "*":
                System.out.println("Escolheu a opção de multiplicar");
                multi=num1*num2;
                System.out.println(multi);
                break;
            case "/":
                System.out.println("Escolheu a opção de dividir");
                divi=num1/num2;
                System.out.println(divi);
                break;
            case ".":
                System.out.println("sair");
            default:
                System.out.println("Opção inválida");

        }
        System.out.println("Deseja continuar?");
        cont=input.next();
        if (cont.equals("n")){
            opcao=".";
        }


        }
    while(!opcao.equals("."));
            System.out.println("sair");



    }
}
