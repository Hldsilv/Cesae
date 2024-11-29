package Gamestart;

import java.util.Scanner;


public class Menu {
    public static void menuAdminConsultas() {
        Scanner input = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("****Consultas****");
            System.out.println("Opção 1 - Consulta de vendas");
            System.out.println("Opção 2 - Consulta de clientes  ");
            System.out.println("Opção 3 - Consulta de categorias  ");
            System.out.println("Opção 0 - Sair ");

            System.out.println("Qual a opção que deseja?");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("****VENDAS****");
                    break;

                case 2:
                    System.out.println("****CLIENTES****");
                    break;

                case 3:
                    System.out.println("****CATEGORIAS****");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("***** Opção Inválida *****");
                    break;
            }

        } while (opcao != 0);
    }

    public static void menuAdmin() {
        Scanner input = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("****ADMIN****");
            System.out.println("Opção 1 - Consulta");
            System.out.println("Opção 2 - Total de vendas  ");
            System.out.println("Opção 3 - Pesquisa de informações de cliente");
            System.out.println("Opção 4 - Jogo mais caro e clientes que o compraram ");
            System.out.println("Opção 5 - Melhor cliente");
            System.out.println("Opção 6 - Pesquisa de vendas(Insira o nome do jogo para saber os clientes que o compraram)");
            System.out.println("Opção 0 - Sair ");

            System.out.println("Qual a opção que deseja?");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                   menuAdminConsultas();
                    break;

                case 2:
                    System.out.println("Total de vendas ");
                    break;

                case 3:
                    System.out.println("Pesquisa de informações de cliente");
                    break;
                case 4:
                    System.out.println("Jogo mais caro e clientes que o compraram ");
                    break;

                case 5:
                    System.out.println("****Melhor cliente****");
                    break;
                case 6:
                    System.out.println("****Pesquisa de vendas****");
                    break;

                case 0: // Sair
                    System.out.println("Obrigado! Até à próxima! :D");
                    break;

                default:
                    System.out.println("***** Opção Inválida *****");
                    break;
            }
        } while (opcao != 0);
    }

    public static void menuCliente() {
        Scanner input = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("****CLIENTE****");

            System.out.println("Opção 1 - Novo registo");
            System.out.println("Opção 2 - Procurar estacionamento ");
            System.out.println("Opção 3 - Imprimir Catálogo ");
            System.out.println("Opção 4 - Imprimir Catálogos Gráficos ");
            System.out.println("Opção 5 - Imprimir jogo mais recente ");
            System.out.println("Opção 6 - Imprimir Catálogo Editora ");
            System.out.println("Opção 0 - Sair ");


            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("*************** Novo registo ***************");
                    break;

                case 2:
                    System.out.println("*************** Procurar estacionamento ***************");
                    break;

                case 3:
                    System.out.println("Imprimir Catálogo");
                    break;
                case 4:
                    System.out.println("****Imprimir Catálogos Gráficos****");
                    break;

                case 5:
                    System.out.println("****Imprimir jogo mais recente****");
                    break;
                case 6:
                    System.out.println("****Imprimir Catálogo Editora****");
                    break;

                case 0: // Sair
                    System.out.println("Obrigado! Até à próxima! :D");
                    break;
                default:
                    System.out.println("***** Opção Inválida *****");
                    break;
            }
        } while (opcao != 0);

    }

    public static void menuInicial() {

        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("*********** Programa ***********");

            System.out.println("Tipo de utilizador: 1 - Admin | 2 - Cliente (Selecione 1 ou 2. 0 para sair): ");
            opcao = input.nextInt();


            switch (opcao) {
                case 1:

                   menuAdmin();
                    break;
                case 2:
                 menuCliente();
                 break;

                default:
                    System.out.println("***** Opção Inválida *****");
            }
        } while (opcao != 0);
    }

}

