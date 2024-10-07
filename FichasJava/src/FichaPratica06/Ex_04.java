package FichaPratica06;

import java.util.Scanner;
import static  FichaPratica06.Ex_03.*;
public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, opcao;

        System.out.println("Introduza um número: ");
        num = input.nextInt();

        do {
            System.out.println("1- Par ou Impar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou Não Primo");
            System.out.println("4. Perfeito ou Não Perfeito");
            System.out.println("5. Triangular ou Não Triangular");
            System.out.println("6. Trocar de Número");

            System.out.println("Insira uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Par ou Impar
                    if (par(num)) {
                        System.out.println("Par");
                    } else {
                        System.out.println("Impar");
                    }
                    break;
                case 2: // Positivo ou Negativo
                    if (positivo(num)) {
                        System.out.println("Positivo");
                    } else {
                        System.out.println("Negativo");
                    }
                    break;
                case 3://Primo ou Não Primo
                    if (primo(num)) {
                        System.out.println("Primo");
                    } else {
                        System.out.println("Não primo");
                    }
                    break;
                case 4: // Perfeito ou Não Perfeito
                    if (perfeito(num)) {
                        System.out.println("Perfeito");
                    } else {
                        System.out.println("Não Perfeito");
                    }
                    break;
                case 5:// Triangular ou Não Triangular
                    if (triangular(num)) {
                        System.out.println("Triangular");
                    } else {
                        System.out.println("Não Triangular");
                    }
                    break;
                case 6://Trocar de Número
                    System.out.print("Introduza um novo numero: ");
                    num = input.nextInt();
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        }
    while (opcao!=7);

    }

}
