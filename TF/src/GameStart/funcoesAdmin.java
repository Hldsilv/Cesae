package GameStart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static GameStart.funcoesAuxiliares.*;


public class funcoesAdmin {

    /**
     * Compara os dados inseridos com os que estão no ficheiro
     * @return true se os dados estiverem de acordo com o ficheiro, false se não estiverem de acordo
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static boolean login() throws FileNotFoundException {
        File scannerFicheiro = new File("GameStartF/Gamestart_AdminLogin.csv");
        Scanner sc = new Scanner(scannerFicheiro);
        Scanner input = new Scanner(System.in);
        boolean log = false;

        System.out.println("Introduza o Username:");
        String username = input.nextLine();
        System.out.println("Introduza a Password:");
        String password = input.nextLine();

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] itensDaLinha = linha.split(";");

            if (itensDaLinha[0].equals(username) && itensDaLinha[1].equals(password)) {

                System.out.println("\nLogin correcto\n");
                log = true;
                break;
            }
        }
        if (!log) {
            System.out.println("\nLogin incorrecto!");
            primaEnter();
        }
        sc.close();
        return log;
    }

    /**
     * imprime o ficheiro de vendas
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void consultaVendas() throws FileNotFoundException {
        Scanner sc = importarFicheiro();

        String linha = sc.nextLine();

        System.out.printf("%-12s| %-12s| %-21s| %-12s| %-35s| %-23s| %-13s| %-31s| %-10s%n",
                "ID DE VENDA", "ID CLIENTE", "NOME DO CLIENTE", "CONTACTO",
                "EMAIL", "EDITORA", "CATEGORIA", "JOGO", "VALOR");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------" +
                "----------------------------------------------");

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha = linha.split(";");

                System.out.printf("%-12s| %-12s| %-21s| %-12s| %-35s| %-23s| %-13s| %-31s| %-10s%n",
                        itensDaLinha[0], itensDaLinha[1], itensDaLinha[2],
                        itensDaLinha[3], itensDaLinha[4] , itensDaLinha[5],
                        itensDaLinha[6], itensDaLinha[7], itensDaLinha[8]);

        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------" +
                "----------------------------------------------");
        sc.close();
    }

    /**
     * Imprime todos os clientes sem duplicados
     * @throws FileNotFoundException caso não encontre o ficheiro
     */
    public static void consultaClientes() throws FileNotFoundException {
        Scanner sc = importarFicheiro();

        String[] array = new String[contarLinhasFicheiro()];
        String linha = sc.nextLine();

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha = linha.split(";");
            String nomeCliente = itensDaLinha[2];

            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    array[i] = nomeCliente;
                    System.out.println(nomeCliente);
                    break;
                }
                if (array[i].equals(nomeCliente)) {
                    break;
                }
            }
        }
        System.out.println("\n**********************************");
        sc.close();
    }

    /**
     * Imprime todas as categorias de jogos existentes no ficheiro sem duplicados
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void consultaCategorias() throws FileNotFoundException {
        Scanner sc = importarFicheiro();

        String[] array = new String[contarLinhasFicheiro()];
        String linha = sc.nextLine();

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha = linha.split(";");
            String categorias = itensDaLinha[6];


            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    array[i] = categorias;
                    System.out.println(categorias);
                    break;
                }
                if (array[i].equals(categorias)) {
                    break;
                }
            }
        }
        System.out.println("\n************************************");
        sc.close();
    }

    /**
     * Imprime o valor total de vendas e quantas vendas foram efectuadas.
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void imprimirTotalVendas() throws FileNotFoundException {
        Scanner sc = importarFicheiro();

        String linha =sc.nextLine();
        int  contador=0;
        double vendas, total=0;

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha = linha.split(";");
            vendas = Double.parseDouble(itensDaLinha[8]);
            total += vendas;
            contador++;
        }
        System.out.println("\n************************** TOTAL DE VENDAS *********************************\n");
        System.out.println("Foram efectuadas "+contador+" vendas e o valor total é de: "+total+"€\n");
        System.out.println("****************************************************************************\n");

        sc.close();
    }

    /**
     * Pesquisa por um cliente dado o seu id e imprime o nome, contacto e email.
     * @param idCliente argumento o idcliente que é inserido pelo user
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void pesquisaCliente(int idCliente) throws FileNotFoundException {
        Scanner sc = importarFicheiro();

        String linha = sc.nextLine();

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha = linha.split(";");
            String id = itensDaLinha[1];
            String nome = itensDaLinha[2];
            String contacto = itensDaLinha[3];
            String email = itensDaLinha[4];

            if (Integer.parseInt(id) == idCliente) {
                System.out.println("\n************** Cliente **************\n");
                System.out.println("\nNOME: " + nome+"\n");
                System.out.println("\nCONTACTO: " + contacto+"\n");
                System.out.println("\nEMAIL: " + email+"\n");
                System.out.println("\n*************************************\n");
                break;
            }
        }
        sc.close();
    }

    /**
     * Pesquisa o jogo mais caro e os clientes que o compraram e depois imprime.
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void jogoMaisCaro() throws FileNotFoundException {
        Scanner sc = importarFicheiro();

        String linha = sc.nextLine();
        double maisCaro=0, valor;
        String jogoMaisCaro = "", comprador = "";

        while (sc.hasNextLine()){

            linha = sc.nextLine();
            String[] itensDaLinha= linha.split(";");
            String nome = itensDaLinha[2];
            String jogo = itensDaLinha[7];
            valor = Double.parseDouble(itensDaLinha[8]);

            if (maisCaro<valor){
                maisCaro = valor;
                jogoMaisCaro = jogo;
                comprador= nome;

            } else if (valor == maisCaro && jogo.equals(jogoMaisCaro)) {
                comprador += "\n" + nome;
        }
    }
        System.out.println("\nO jogo mais caro é " +jogoMaisCaro +" com o valor de " + maisCaro+ "€.\n");
        System.out.println("---------------------------------------------------------------");
        System.out.println("\nOs clientes que compraram o " +jogoMaisCaro +" foram: " );
        System.out.println(""+comprador);
        System.out.println("\n*************************************************************************************\n");

    sc.close();
}

    /**
     * Imprime o melhor cliente e os jogos que ele comprou
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void melhorCliente() throws FileNotFoundException {
        Scanner sc = importarFicheiro();

        String[][] matriz = new String[contarLinhasFicheiro()][4];
        String linha = sc.nextLine();
        double maiorValor = 0;
        String melhorCliente = " ", nomeMelhorCliente = " ";

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha = linha.split(";");
            String nome = itensDaLinha[2];
            String contacto = itensDaLinha[3];
            String email = itensDaLinha[4];
            String valor = (itensDaLinha[8]);

            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][0] == null) {
                    matriz[i][0] = nome;
                    matriz[i][1] = contacto;
                    matriz[i][2] = email;
                    matriz[i][3] = valor;
                    break;
                }

                if (matriz[i][0].equals(nome)) {
                    //tenho que passar para double e depois para string porque a matriz é de strings
                    double valorExistente = Double.parseDouble(matriz[i][3]);
                    double valorNovo = Double.parseDouble(valor);
                    double soma = valorExistente + valorNovo;
                    matriz[i][3] = String.valueOf(soma);

                    if (soma > maiorValor) {
                        maiorValor = soma;
                        nomeMelhorCliente= nome;
                        melhorCliente = nome+ " | " +contacto+" | " +email;
                    }
                    break;
                }
            }
        }
        System.out.println("\n"+melhorCliente + " com o valor gasto de " + maiorValor+"\n\nE os jogos comprados foram: ");

        sc.close();
        sc = new Scanner(new File("GameStartF/GameStart_Vendas.csv"));
        linha = sc.nextLine();

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha = linha.split(";");
            String nome = itensDaLinha[2];
            String jogo = itensDaLinha[7];
            if (nome.equals(nomeMelhorCliente)){
                System.out.println("\t\t\t\t\t\t\t- "+jogo);
            }
        }
        System.out.println("\n************************************************************************************");
        sc.close();
    }

    /**
     * pesquisar um jogo e imprimir os dados dos clientes que o compraram
     * @throws FileNotFoundException se o ficheiro estiver errado
     */
    public static void pesquisaVendas() throws FileNotFoundException {
        Scanner sc = importarFicheiro();
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o Jogo que deseja pesquisar: ");
        String jogo = input.nextLine();
        String linha = sc.nextLine();

        while (sc.hasNextLine()){
            linha = sc.nextLine();
            String[] itensDaLinha= linha.split(";");

            String nome = itensDaLinha[2];
            String contacto = itensDaLinha[3];
            String email = itensDaLinha[4];

            if(jogo.equalsIgnoreCase(itensDaLinha[7])){
                System.out.println("\nO jogo "+jogo+" foi comprado por "+nome+" | Contacto: "+contacto+" | Email: "+email+"\n");
            }

        }
        System.out.println("\n**********************************************************************************************************************");
        sc.close();
    }
}

