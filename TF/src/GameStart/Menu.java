package GameStart;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static GameStart.functionsAdmin.*;


public class Menu {
    public static void menuAdminConsultas() throws FileNotFoundException {
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
                    System.out.println(" ");

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

    public static void menuAdmin() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcao, idCliente;

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
                    imprimirVendas();
                    break;

                case 3:
                    System.out.println("Pesquisa de informações de cliente");
                    System.out.println(" ");
                    System.out.println("Insira o id do Cliente:");
                    idCliente = input.nextInt();
                    pesquisaCliente(idCliente);
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Jogo mais caro e clientes que o compraram ");
                    jogoMaisCaro();
                    break;

                case 5:
                    System.out.println("****Melhor cliente****");
                    break;
                case 6:
                    System.out.println("****Pesquisa de vendas****");
                    break;

                case 0:
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
                    break;
                default:
                    System.out.println("***** Opção Inválida *****");
                    break;
            }
        } while (opcao != 0);

    }

    public static void menuInicial() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao;
        String login, password;

        do {
            System.out.println("*********** Programa ***********");

            System.out.println("Tipo de utilizador: 1 - Admin |  2 - Cliente |  0 - Sair): ");
            opcao = input.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Introduza o USERNAME:");
                    login = input.next();
                    System.out.println("Introduza o USERNAME:");
                    password = input.next();
                   if(GameStart.login.login(login,password)) {
                       menuAdmin();
                   }
                    break;
                case 2:
                    menuCliente();
                    break;
                case 0:
                    System.out.println("Obrigado e até à próxima :D");
                    break;
                default:
                    System.out.println("***** Opção Inválida *****");
            }
        } while (opcao != 0);
    }

}

