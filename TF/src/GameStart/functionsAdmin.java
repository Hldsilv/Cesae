package GameStart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class functionsAdmin {
    /**
     * imprime o ficheiro de vendas
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void consultaVendas() throws FileNotFoundException {
        File scannerFicheiro = new File("GameStartF/GameStart_Vendas.csv");
        Scanner sc = new Scanner(scannerFicheiro);

        String linha = sc.nextLine();

        System.out.printf("%-15s| %-15s| %-20s| %-15s| %-40s| %-25s| %-15s| %-30s| %-10s%n",
                "ID DE VENDA", "ID CLIENTE", "NOME DO CLIENTE", "CONTACTO",
                "EMAIL", "EDITORA", "CATEGORIA", "JOGO", "VALOR");

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha = linha.split(";");

            if (itensDaLinha.length == 9) {

                System.out.printf("%-15s| %-15s| %-20s| %-15s| %-40s| %-25s| %-15s| %-30s| %-10s%n",
                        itensDaLinha[0], itensDaLinha[1], itensDaLinha[2],
                        itensDaLinha[3], itensDaLinha[4] , itensDaLinha[5],
                        itensDaLinha[6], itensDaLinha[7], itensDaLinha[8]);
            }
        }
        sc.close();
    }

    public static void consultaClientes(){

    }

    public static void consultaCategorias(){

    }

    /**
     * Imprime o valor total de vendas e quantas vendas foram efectuadas.
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void imprimirTotalVendas() throws FileNotFoundException {
        File scannerFicheiro = new File("GameStartF/GameStart_Vendas.csv");
        Scanner sc = new Scanner(scannerFicheiro);

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
        System.out.println();
        System.out.println("************** TOTAL DE VENDAS **************");
        System.out.println();
        System.out.println("Foram efectuadas "+contador+" vendas e o valor total é de: "+total+"€");
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();

        sc.close();
    }

    /**
     * Pesquisa por um cliente dado o seu id e imprime o nome, contacto e email.
     * @param idCliente argumento o idcliente que é inserido pelo user
     * @throws FileNotFoundException
     */
    public static void pesquisaCliente(int idCliente) throws FileNotFoundException {
        File scannerFicheiro = new File("GameStartF/GameStart_Vendas.csv");
        Scanner sc = new Scanner(scannerFicheiro);

        String linha = sc.nextLine();

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha = linha.split(";");
            String id = itensDaLinha[1];
            String nome = itensDaLinha[2];
            String contacto = itensDaLinha[3];
            String email = itensDaLinha[4];

            if (Integer.parseInt(id) == idCliente) {
                System.out.println();
                System.out.println("************** Cliente **************");
                System.out.println();
                System.out.println("NOME: " + nome);
                System.out.println();
                System.out.println("CONTACTO: " + contacto);
                System.out.println();
                System.out.println("EMAIL: " + email);
                System.out.println();
                System.out.println("***********************************");
                System.out.println();
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
        File scannerFicheiro = new File("GameStartF/GameStart_Vendas.csv");
        Scanner sc = new Scanner(scannerFicheiro);

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
        System.out.println();
        System.out.println("****************** JOGO MAIS CARO ******************");
        System.out.println();
        System.out.println("O jogo mais caro é " +jogoMaisCaro +" com o valor de " + maisCaro+ "€.");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Os cliente que compraram o " +jogoMaisCaro +" foram: " );
        System.out.println(comprador);
        System.out.println();
        System.out.println("****************************************************");
        System.out.println();

    sc.close();
}

    public static void melhorCliente() throws FileNotFoundException {
        File scannerFicheiro = new File("GameStartF/GameStart_Vendas.csv");
        Scanner sc = new Scanner(scannerFicheiro);

        String linha = sc.nextLine();
        double soma=0, valorMaior=0;
        String melhorCliente= "";
        int melhorId=0;

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha= linha.split(";");
            String idCliente = itensDaLinha[1];
            double valor = Double.parseDouble(itensDaLinha[8]);
        }
sc.close();
    }

    /**
     * pesquisar um jogo e imprimir os dados dos clientes que o compraram
     * @throws FileNotFoundException se o ficheiro estiver errado
     */
    public static void pesquisaVendas() throws FileNotFoundException {
        File scannerFicheiro = new File("GameStartF/GameStart_Vendas.csv");
        Scanner sc = new Scanner(scannerFicheiro);
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

            if(jogo.equals(itensDaLinha[7])){
                System.out.println();
                System.out.println("O jogo "+jogo+" foi comprado por "+nome+" | "+contacto+" | "+email);
                System.out.println();
            }
        }
        sc.close();
    }
}

