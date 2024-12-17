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
            imprimirFicheiro("GameStartF/menuAdminVendas.txt");
            opcao = input.nextInt();
            limparConsola();

            switch (opcao) {
                case 1:
                    imprimirHeader("consultaVendas.txt");
                    consultaVendas();
                    primaEnter();
                    break;

                case 2:
                    imprimirHeader("consultaClientes.txt");
                    consultaClientes();
                    primaEnter();
                    break;

                case 3:
                    imprimirHeader("consultaCategorias.txt");
                    consultaCategorias();
                    primaEnter();
                    break;
                case 0:
                    break;
                default:
                    opcaoInvalida();
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
            imprimirFicheiro("GameStartF/menuAdmin.txt");
            opcao = input.nextInt();
            limparConsola();

            switch (opcao) {
                case 1:
                    menuAdminConsultas();
                    break;

                case 2:
                    imprimirTotalVendas();
                    primaEnter();
                    break;

                case 3:

                    limparConsola();
                    pesquisaCliente();
                    primaEnter();
                    break;
                case 4:
                    imprimirHeader("jogoMaisCaro.txt");
                    jogoMaisCaro();
                    primaEnter();
                    break;

                case 5:
                    imprimirHeader("melhorCliente.txt");
                    melhorCliente();
                    primaEnter();
                    break;
                case 6:
                    imprimirHeader("pesquisaDeVendas.txt");
                    pesquisaVendas();
                    primaEnter();
                    break;

                case 0:
                    break;

                default:
                    opcaoInvalida();
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
            imprimirFicheiro("GamestartF/menuCliente.txt");
            opcao = input.nextInt();
            limparConsola();

            switch (opcao) {
                case 1:
                    imprimirHeader("registo.txt");
                    registarCliente();
                    primaEnter();

                    break;

                case 2:
                    imprimirHeader("estacionamento.txt");
                    procurarEstacionamento();
                    primaEnter();
                    break;

                case 3:
                    imprimirHeader("catalogo.txt");
                    imprimirCatalogoJogos();
                    primaEnter();
                    break;

                case 4:
                    menuCatalogoGrafico();
                    break;

                case 5:
                    imprimirHeader("jogoMaisRecente.txt");
                    System.out.println();
                    imprimirJogoMaisRecente();
                    primaEnter();
                    break;

                case 6:
                    imprimirHeader("catalogoEditoras.txt");
                    catalogoEditoras();
                    primaEnter();
                    break;
                case 7:
                    imprimirHeader("catalogoCategorias.txt");
                    catalogoCategoria();
                    primaEnter();
                    break;

                case 0:
                    break;
                default:
                    opcaoInvalida();
                    break;
            }
        } while (opcao != 0);
    }

    /**
     * Menu que pergunta o tipo de utilizador(admin ou cliente) se for admin, tem que fazer login
     * @throws FileNotFoundException Caso não encontre os ficheiros
     */
    public static void menuInicial() throws FileNotFoundException, InterruptedException {

        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            limparConsola();
            imprimirFicheiro("GameStartF/menuInicial.txt");
            opcao = input.nextInt();
            limparConsola();

            switch (opcao) {
                case 1:
                    imprimirHeader("login.txt");
                   if(login()) {
                       primaEnter();
                       menuAdmin();
                   }
                    break;
                case 2:
                    menuCliente();
                    break;
                case 0:
                    System.out.println("\n\n\n\n");
                    System.out.println("***************************************************************\n");
                    fecharPrograma();
                    System.out.print("\n\n\n");
                    imprimirFicheiro("GameStartF/copyright.txt");
                    System.out.println("\n\n\t\t\t\t\t\tObrigado e até à próxima \uD83D\uDE01");
                    break;
                default:
                    opcaoInvalida();
                    break;
            }
        } while (opcao != 0);
    }

}

