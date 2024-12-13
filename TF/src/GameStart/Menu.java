package GameStart;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static GameStart.funcoesAdmin.*;
import static GameStart.funcoesAuxiliares.*;
import static GameStart.funcoesClient.*;


public class Menu {

    /**
     * Menu consultas para o admin, permite consultar vendas, clientes ou categorias, dependendo da escolha.
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void menuAdminConsultas() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            limparConsola();
            System.out.println("************ Consultas ************");

            System.out.println("Opção 1 - Consulta de vendas");
            System.out.println("Opção 2 - Consulta de clientes  ");
            System.out.println("Opção 3 - Consulta de categorias  ");
            System.out.println("Opção 0 - Sair ");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n************************************************************************************* VENDAS ***************************************************************************************\n");
                    consultaVendas();
                    primaEnter();
                    break;

                case 2:
                    System.out.println("\n************ CLIENTES ************\n");
                    consultaClientes();
                    primaEnter();
                    break;

                case 3:
                    System.out.println("\n************ CATEGORIAS ************\n");
                    consultaCategorias();
                    primaEnter();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\n********** Opção Inválida **********\n");

                    break;
            }

        } while (opcao != 0);
    }

    /**
     *  Menu para o Admin que permite fazer consultas, ver o total de vendas, pesquisar informações de clientes, saber o jogo mais caro e os clientes que o compraram
     *  melhor cliente e fazer pesquida de vendas.
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void menuAdmin() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcao, idCliente;

        do {
            limparConsola();
            System.out.println("********************** ADMIN ********************** \n");
            System.out.println("Opção 1 - Consulta");
            System.out.println("Opção 2 - Total de vendas  ");
            System.out.println("Opção 3 - Pesquisa de informações de cliente");
            System.out.println("Opção 4 - Jogo mais caro e clientes que o compraram ");
            System.out.println("Opção 5 - Melhor cliente");
            System.out.println("Opção 6 - Pesquisa de vendas");
            System.out.println("Opção 0 - Sair ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    menuAdminConsultas();
                    break;

                case 2:
                    imprimirTotalVendas();
                    primaEnter();
                    break;

                case 3:
                    System.out.println("********************** Pesquisa de informações de cliente **********************\n");
                    System.out.println("Insira o id do Cliente:");
                    idCliente = input.nextInt();
                    pesquisaCliente(idCliente);
                    System.out.println();
                    primaEnter();
                    break;
                case 4:
                    System.out.println("********************** Jogo mais caro e clientes que o compraram **********************");
                    jogoMaisCaro();
                    primaEnter();
                    break;

                case 5:
                    System.out.println("**************** Melhor cliente ****************");
                    primaEnter();
                    break;
                case 6:
                    System.out.println("**************** Pesquisa de vendas ****************\n");
                    pesquisaVendas();
                    primaEnter();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("\n********* Opção Inválida *********\n");
                    break;
            }
        } while (opcao != 0);
    }

    /**
     * Menu para o cliente que permite fazer um novo registo, procurar estacionamento, imprimir catalogo, jogo mais recente, catalogo de editoras e catalogo de categorias
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void menuCliente() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            limparConsola();
            System.out.println("\n**************** CLIENTE ****************\n");
            System.out.println("Opção 1 - Novo registo");
            System.out.println("Opção 2 - Procurar estacionamento ");
            System.out.println("Opção 3 - Imprimir Catálogo ");
            System.out.println("Opção 4 - Imprimir Catálogos Gráficos ");
            System.out.println("Opção 5 - Imprimir jogo mais recente ");
            System.out.println("Opção 6 - Imprimir Catálogo Editora ");
            System.out.println("Opção 7 - Imprimir Catálogo Categoria ");
            System.out.println("Opção 0 - Sair ");
            System.out.println();

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n*************** Novo registo ***************\n");
                    registarCliente();
                    primaEnter();

                    break;

                case 2:
                    System.out.println("\n*************** Estacionamento Livre ***************\n");
                    procurarEstacionamento();
                    primaEnter();
                    break;

                case 3:
                    System.out.println("\n*************** CATÁLOGO DE JOGOS ***************\n");
                    imprimirCatalogoJogos();
                    primaEnter();
                    break;

                case 4:
                    System.out.println("\n*************** CATÁLOGO GRÁFICO DE JOGOS ***************\n");
                    menuCatalogoGrafico();
                    break;

                case 5:
                    System.out.println("\n************ Jogo mais recente ****************\n");
                    imprimirJogoMaisRecente();
                    primaEnter();
                    break;

                case 6:
                    System.out.println("\n************ Catálogo Editora ************\n");
                    catalogoEditoras();
                    primaEnter();
                    break;
                case 7:
                    System.out.println("\n************ Catálogo Categoria ************\n");
                    catalogoCategoria();
                    primaEnter();
                    break;

                case 0:
                    break;
                default:
                    System.out.println("\n********* Opção Inválida *********\n");
                    break;
            }
        } while (opcao != 0);
    }

    /**
     * Menu que pergunta o tipo de utilizador(admin ou cliente) se for admin, tem que fazer login
     * @throws FileNotFoundException Caso não encontre os ficheiros
     */
    public static void menuInicial() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao;
        String login, password;

        do {

            System.out.println("\n*********************** Programa GameStart ***********************\n");
            System.out.println("Tipo de utilizador: \n1 - Admin  \n2 - Cliente   \n0 - Sair ");
            opcao = input.nextInt();


            switch (opcao) {
                case 1:
                   if(login()) {
                       menuAdmin();
                   }
                    break;
                case 2:
                    menuCliente();
                    break;
                case 0:
                    imprimirFicheiro("GameStartF/copyright.txt");
                    System.out.println("\nObrigado e até à próxima :D");
                    break;
                default:
                    System.out.println("\n***** Opção Inválida *****\n");
            }
        } while (opcao != 0);
    }

}

