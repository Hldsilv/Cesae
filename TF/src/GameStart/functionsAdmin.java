package GameStart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class functionsAdmin {
    /**
     * Imprime o valor total de vendas e quantas vendas foram efectuadas.
     * @throws FileNotFoundException
     */
    public static void imprimirVendas() throws FileNotFoundException {
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
        System.out.println(" ");
        System.out.println("************** TOTAL DE VENDAS **************");
        System.out.println(" ");
        System.out.println("Foram efectuadas "+contador+" vendas e o valor total é de: "+total+"€");
        System.out.println(" ");
        System.out.println("*********************************************");
        System.out.println(" ");

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
                System.out.println(" ");
                System.out.println("************** Cliente **************");
                System.out.println(" ");
                System.out.println("NOME: " + nome);
                System.out.println(" ");
                System.out.println("CONTACTO: " + contacto);
                System.out.println(" ");
                System.out.println("EMAIL: " + email);
                System.out.println(" ");
                System.out.println("***********************************");
                System.out.println(" ");
                break;

            }

        }
        sc.close();
    }

    /**
     * Pesquisa o jogo mais caro e os clientes que o compraram e depois imprime.
     * @throws FileNotFoundException
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
        System.out.println(" ");
        System.out.println("****************** JOGO MAIS CARO ******************");
        System.out.println(" ");
        System.out.println("O jogo mais caro é " +jogoMaisCaro +" com o valor de " + maisCaro+ "€.");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Os cliente que compraram o " +jogoMaisCaro +" foram: " );
        System.out.println(comprador);
        System.out.println(" ");
        System.out.println("****************************************************");
        System.out.println(" ");

    sc.close();

}

    public static void melhorCliente() throws FileNotFoundException {
        File scannerFicheiro = new File("GameStartF/GameStart_Vendas.csv");
        Scanner sc = new Scanner(scannerFicheiro);

        String linha = sc.nextLine();
        double soma=0;
        String melhorCliente= "";

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha= linha.split(";");
            String idCliente = itensDaLinha[1];
            double valor = Double.parseDouble(itensDaLinha[8]);



                if(idCliente) {
                    soma += valor;
                }
            }

        }

    }

    public static void main(String[] args) throws FileNotFoundException {
jogoMaisCaro();
    }
}
