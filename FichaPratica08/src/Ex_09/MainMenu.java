package Ex_09;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        Produto agua = new Produto("Água 0.5L", 0.45);
        Produto bolacha = new Produto("Bolacha de Água e Sal", 0.6);
        Produto boloAniversario = new Produto("Bolo de Aniversário", 10);

        do {

            System.out.println("***** Programa de Gestão de Produtos *****");
            System.out.println("1. Água 0.5L");
            System.out.println("2. Bolacha de Água de Sal");
            System.out.println("3. Bolo de Aniversário");
            System.out.print("\nGerir: ");
            opcao = input.nextInt();

            System.out.println();

            switch (opcao) {

                case 1: // Água 0.5L

                    int opcaoProduto, quantidade;

                    do {
                        System.out.println();
                        agua.exibirDetalhes();
                        System.out.println("1. Comprar");
                        System.out.println("2. Vender");
                        System.out.println("3. Mudar Preço");
                        System.out.println("0. Voltar");
                        System.out.print("\nOpção: ");
                        opcaoProduto = input.nextInt();


                        switch (opcaoProduto) {

                            case 1:
                                System.out.print("Quantidade: ");
                                quantidade = input.nextInt();
                                agua.comprar(quantidade);
                                break;

                            case 2:
                                System.out.print("Quantidade: ");
                                quantidade = input.nextInt();
                                agua.vender(quantidade);
                                break;

                            case 3:
                                System.out.print("Novo Preço: ");
                                double precoNovo = input.nextDouble();
                                agua.setPreco(precoNovo);
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Opção Inválida");
                        }

                    } while (opcaoProduto != 0);


                    break;

                case 2: // Bolacha de Água de Sal
                    break;

                case 3: // Bolo de Aniversário
                    break;

                case 0: // Sair
                    System.out.println("\n\nSair...");
                    break;

                default:
                    System.out.println("Opção Inválida");
            }

        } while (opcao != 0);


    }
}
