package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_09 {


    public static void musicasGenero(String genero) throws FileNotFoundException {

        File file = new File("C:/Users/Administrator/Desktop/FichaPratica07/exercicio_09.csv");
        Scanner sc = new Scanner(file);

        String linha= sc.nextLine();


        while (sc.hasNextLine()){
            linha = sc.nextLine();
            String[] itensDaLinha= linha.split(",");

            String musica = itensDaLinha[0];
            if(genero.equals(itensDaLinha[2])){
                System.out.println(musica);
                System.out.println(" ");
            }

        }
        sc.close();

    }
    public static void artistaMusica(String artista ) throws FileNotFoundException {

        File file = new File("C:/Users/Administrator/Desktop/FichaPratica07/exercicio_09.csv");
        Scanner sc = new Scanner(file);

        String linha = sc.nextLine();

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha = linha.split(",");

            String musica = itensDaLinha[0];
            if (artista.equals(itensDaLinha[1])) {
                System.out.println(musica);
                System.out.println(" ");
            }

        }
        sc.close();
    }

    public static void  musicaMaiorDuracao( ) throws FileNotFoundException {
        File file = new File("C:/Users/Administrator/Desktop/FichaPratica07/exercicio_09.csv");
        Scanner sc = new Scanner(file);

        String linha = sc.nextLine();

        int maior =-1,totalDuracao;
        String musicaMaior= "";
        String duracaoMaior= "";

        while (sc.hasNextLine()){

            linha = sc.nextLine();
            String[] itensDaLinha= linha.split(",");
            String duracao = itensDaLinha[3];
            String nome = itensDaLinha[0];
            String[] dura= duracao.split(":");

            int minutos = Integer.parseInt(dura[0]);
            int segundos = Integer.parseInt(dura[1]);

            minutos *= 60;
            totalDuracao = minutos+segundos;

            if (maior<totalDuracao){
                maior = totalDuracao;
                musicaMaior = nome;
                duracaoMaior = duracao;
            }

        }
        sc.close();
        System.out.println("A musica com mais duração é " +musicaMaior+" com duração de "+duracaoMaior);
        System.out.println(" ");

    }
    public static void  pesquisarDuracaoAcima(String duracao ) throws FileNotFoundException {

        File file = new File("C:/Users/Administrator/Desktop/FichaPratica07/exercicio_09.csv");
        Scanner sc = new Scanner(file);
        String linha = sc.nextLine();

        int totalDuracao, total;
        String musicaMaior= "";
        String duracaoMaior= "";


        while (sc.hasNextLine()){

            linha = sc.nextLine();
            String[] itensDaLinha= linha.split(",");
            String duracaoo = itensDaLinha[3];
            String nome = itensDaLinha[0];
            String[] dura= duracaoo.split(":"); //os itens da duracaoo(tempo da musica) vai ser splitado(:) para um array

            int minutos = Integer.parseInt(dura[0]);//antes dos dois pontos(:) são minutos
            int segundos = Integer.parseInt(dura[1]);

            minutos *= 60;// passar min para segundos
            totalDuracao = minutos+segundos;//colocar tudo em segundos para fazer a comparação

           String[] duracaoEntrada= duracao.split(":");//splitar os dados de entrada num array como em cima
           int min = Integer.parseInt(duracaoEntrada[0]);//antes dos ":" são os min
           int seg = Integer.parseInt(duracaoEntrada[1]);//depois dos dois pontos sao os segundos
           min *= 60;
           total = min+seg;


            if (totalDuracao>total){

                musicaMaior = nome;
                duracaoMaior = duracaoo;

                System.out.println("A musica com mais duração do que "+duracao+" é " +musicaMaior+" com duração de "+duracaoMaior);//dentro do if para mostrar todas as musicas
            }

        }
        sc.close();
        System.out.println(" ");


    }

    public static void numeroMusicas( ) throws FileNotFoundException {

        File file = new File("C:/Users/Administrator/Desktop/FichaPratica07/exercicio_09.csv");
        Scanner sc = new Scanner(file);

        String linha = sc.nextLine();
        int  contador=0;

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
           contador++;

        }
        System.out.println("Existem " +contador+ " músicas neste ficheiro.");
        System.out.println(" ");
        sc.close();
    }


    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:/Users/Administrator/Desktop/FichaPratica07/exercicio_09.csv");
        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        int opcao;

do{
    System.out.println("*********** Programa ***********");

    System.out.println("Opção 1 - Qual o género que pretende pesquisar para saber as músicas que temos desse género? ");
    System.out.println("Opção 2 - Qual o artista que pretende pesquisar? ");
    System.out.println("Opção 3 - Pesquisar a música com maior duração ");
    System.out.println("Opção 4 - Pesquisar uma música com uma duração acima de um valor específico ");
    System.out.println("Opção 5 - Pesquisar o número de músicas no ficheiro ");
    System.out.println("Opção 0 - Para sair ");

    opcao = input.nextInt();


    switch (opcao){
        case 1:

            System.out.println("****Músicas por género****");
            System.out.println(" ");
            String genero = input.next();
            musicasGenero(genero);
            break;

        case 2:
            System.out.println("****Artista pesquisado****");
            System.out.println(" ");
            String artista = input.next();
            artistaMusica(artista);
            break;

        case 3:
            System.out.println("****Música com maior duração****");
            System.out.println(" ");
            musicaMaiorDuracao();
            break;

        case 4:
            System.out.println("****Músicas com duração acima de um valor específico****");
            System.out.println("**** Insira com o formato -> mm:ss <- ****");
            System.out.println(" ");
            String duracao= input.next();
            pesquisarDuracaoAcima(duracao);
            break;


        case 5:
            System.out.println("****Números de músicas no ficheiro****");
            System.out.println(" ");
            numeroMusicas();
            break;

        case 0: // Sair
            System.out.println("Obrigado! Até à próxima! :D");
            break;

        default:
            System.out.println("***** Opção Inválida *****");
    }
}while (opcao!=0);
    }
}
