package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_09 {


    public static void musicasGenero(String genero) throws FileNotFoundException {
        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_09.csv");
        Scanner sc = new Scanner(file);

        String linha= sc.nextLine();


        while (sc.hasNextLine()){
            linha = sc.nextLine();
            String[] itensDaLinha= linha.split(",");

            String musica = itensDaLinha[0];
            if(genero.equals(itensDaLinha[2])){
                System.out.println(musica);
            }

        }

    }
    public static void artistaMusica(String artista ) throws FileNotFoundException {
        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_09.csv");
        Scanner sc = new Scanner(file);

        String linha = sc.nextLine();


    }
    public static void main(String[] args) throws FileNotFoundException {

//        Escreva um programa que leia um ficheiro CSV contendo informações de músicas (nome, artista, género,
//                duração) para uma matriz.
//                a. Crie um menu com opções, sendo que cada uma delas albergará as seguintes alíneas.
//        b. Pesquisar por músicas de um determinado género.
//                c.Pesquisar músicas de um determinado artista.
//                d. Pesquisar música com maior duração.
//        e. Pesquisar músicas com duração acima de um valor especificado.
//                f.Número de músicas no ficheiro.

        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_09.csv");
        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        int opcao;

do{
    System.out.println("*********** Programa ***********");

    System.out.println("Opção 1 - Qual o género que pretende pesquisar para saber as músicas que temos desse género: ");
    System.out.println("Opção 2 - Qual o artista que pretende pesquisar: ");
    System.out.println("Opção 3 - Pesquisar a música com maior duração: ");
    System.out.println("Opção 4 - Pesquisar uma música com uma duração acima de um valor específico: ");
    System.out.println("Opção 5 -  Pesquisar o número de músicas no ficheiro: ");

    opcao = input.nextInt();


    switch (opcao){
        case 1:

            System.out.println("****Músicas por género****");
            String genero = input.next();
            musicasGenero(genero);

        case 2:
            System.out.println("****Artista pesquisado****");


        case 3:
            System.out.println("****Músicas com maior duração****");

        case 4:
            System.out.println("****Músicas com duração acima de um valor específico****");

        case 5:
            System.out.println("****Números de músicas no ficheiro****");

        case 0: // Sair
            System.out.println("Obrigado! Até à próxima! :D");
            break;
        default:
            System.out.println("***** Opção Inválida *****");
    }
}while (opcao!=0);
    }
}
