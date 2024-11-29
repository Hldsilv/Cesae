package FichaPratica07;

import java.io.*;
import java.util.Scanner;

public class Ex_10 {

    public static String [][] informacoesMatriz() throws FileNotFoundException {

    File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_10.csv");
    Scanner sc = new Scanner(file);

    int numeroDeLinhas = 0;
    int numeroDeColunas;

//ler quantas colunas tem a primeira linha
    String linha = sc.nextLine();
    numeroDeLinhas++;
    numeroDeColunas = linha.split(",").length;

    //contar o numero de linhas
while(sc.hasNextLine()){
    linha = sc.nextLine();
    numeroDeLinhas++;

}

      String [][] matriz = new String [numeroDeLinhas] [numeroDeColunas]; //criar a matriz com o numero de linhas e numero de colunas

        //resetar o scanner para começar na primeira linha
        sc = new Scanner(file);
        int linhaAtual = 0;

        //por cada string que esteja dentro do index[i], coloca na matriz
while   (sc.hasNextLine()){
    linha = sc.nextLine();
    String[] itensDaLinha= linha.split(",");



    for (int i =0; i< numeroDeColunas; i++){
        matriz[linhaAtual][i] = itensDaLinha[i];
    }
    linhaAtual++;

}
sc.close();

//for (int i =0; i< matriz.length;i++){
//    for (int j=0; j< matriz[0].length; j++){
//        System.out.print(matriz[i][j]+ " | ");
//    }
//    System.out.println(" ");
//}
return matriz;

    }

    public static void imprimirFormandos () throws FileNotFoundException {

        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_10.csv");
        Scanner sc = new Scanner(file);

        String linha = sc.nextLine();

        while(sc.hasNextLine()){
           linha = sc.nextLine();
            System.out.println(linha);
        }

    }

    public static void informacoesFormando(int matricula) throws FileNotFoundException {

        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_10.csv");
        Scanner sc = new Scanner(file);


        String linha = sc.nextLine();

        while(sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha= linha.split(",");
            String numero = itensDaLinha[1];

            if(Integer.parseInt(numero) == matricula ){
                System.out.println(linha);


            }
        }
    }

    public static void informacaoCurso(String curso) throws FileNotFoundException {

        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_10.csv");
        Scanner sc = new Scanner(file);

        String linha = sc.nextLine();
        int contador=0;

        while(sc.hasNextLine()){
            linha = sc.nextLine();
            String[] itensDaLinha= linha.split(",");
            String cursoo = itensDaLinha[2];
            String nome= itensDaLinha[0];
            String matricula = itensDaLinha[1];

            if(cursoo.equals(curso)){
                System.out.println(curso+ " Tem o formando: "+nome+ " com a matrícula " +matricula);
                contador++;
            }
        }
        System.out.println("Existem "+contador+" formandos no curso de "+curso);
    }

    public static void alunoMaisVelho() throws FileNotFoundException {

        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_10.csv");
        Scanner sc = new Scanner(file);

        int maior=0, idade;
        String nomeMaisVelho = "";

        String linha = sc.nextLine();
        while (sc.hasNextLine()){

            linha =sc.nextLine();
            String[] itensDaLinha= linha.split(",");

            String nome = itensDaLinha[0];
            idade = Integer.parseInt(itensDaLinha[4]);

            if (idade>maior){
                maior = idade;
                nomeMaisVelho = nome;
            }
        }
        System.out.println("A pessoa mais velha é " +nomeMaisVelho +" com " + maior+ " anos.");
    }

    public static void maisQueUmCurso(String [][] matriz) throws FileNotFoundException {

//        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_10.csv");
//        Scanner sc = new Scanner(file);
//
//        String linha = sc.nextLine();
//        String nomeAluno = "";
//
//
//        while(sc.hasNextLine()){
//            linha = sc.nextLine();
//            String[] itensDaLinha= linha.split(",");
//            String cursoo = itensDaLinha[2];
//            String nome= itensDaLinha[0];
//
//
//            for(int i=0; i< matriz.length; i++) {
//
//                if(matriz[i][0].equals(nome)) {
//                nomeAluno = nome;
//                    System.out.println(nomeAluno);
//
//                }
//
//            }
//
//        }

        }


public static int totalFormandos() throws FileNotFoundException {
    File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_10.csv");
       Scanner sc = new Scanner(file);

        String linha = sc.nextLine();
        int contador = 0;

        while(sc.hasNextLine()){
            linha = sc.nextLine();
            contador++;
        }
    System.out.println("O número de formandos é: "+contador);
return contador;

    }

    public static void criarFormando(String mensagem) throws IOException {
        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_10.csv");
        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        FileWriter fw = new FileWriter(file,true);
        fw.append(mensagem+"\n");

        fw.close();

    }

    public static void main(String[] args) throws IOException {


        informacoesMatriz();
        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_10.csv");
        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        int opcao, opcao1;

        do{
            System.out.println("*********** Programa ***********");

            System.out.println("Opção 1 - Pesquisas ");
            System.out.println("Opção 2 - Criar Formando  ");
            System.out.println("Opção 3 - Editar Formando  ");
            System.out.println("Opção 4 - Eliminar Formando ");
            System.out.println("Opção 0 - Sair ");

            opcao = input.nextInt();


            switch (opcao){
                case 1:

                    do {
                        System.out.println("****Pesquisa****");

                        System.out.println("Opção 1 - Imprimir todos os formandos");
                        System.out.println("Opção 2 - Dado um número de matrícula, retorne todas as informações do formando  ");
                        System.out.println("Opção 3 - Dado um curso, imprima todos os seus formandos (nome e matrícula), no final deve aparecer a contagem de formandos inscritos nesse curso  ");
                        System.out.println("Opção 4 - Imprimir o aluno mais velho ");
                        System.out.println("Opção 5 - Imprimir alunos que estão inscritos em mais de um curso. ");
                        System.out.println("Opção 6 - Número de formandos no ficheiro ");
                        System.out.println("Opção 0 - Sair ");


                        opcao1 = input.nextInt();

                        switch (opcao1) {
                            case 1:
                                System.out.println("*************** TODOS OS FORMANDOS ***************");
                                imprimirFormandos();
                                break;

                            case 2:
                                System.out.println("*************** INFORMAÇÕES DO FORMANDO ***************");
                                System.out.println("Qual o número de matrícula que deseja pesquisar?");
                                int matricula = input.nextInt();
                                informacoesFormando(matricula);
                                break;

                            case 3:
                                System.out.println("Qual o curso que deseja pesquisar?");
                                input.nextLine();
                                String curso = input.nextLine();
                                informacaoCurso(curso);
                                break;
                            case 4:
                                System.out.println("****Imprimir o aluno mais velho****");
                                input.nextLine();
                                alunoMaisVelho();
                                break;

                            case 5:
                                System.out.println("****Imprimir alunos que estão inscritos em mais de um curso****");

                                break;
                            case 6:
                                System.out.println("****Número de formandos no ficheiro****");
                                input.nextLine();
                                totalFormandos();
                                break;

                            case 0: // Sair
                                System.out.println("Obrigado! Até à próxima! :D");
                                break;
                            default:
                                System.out.println("***** Opção Inválida *****");

                        }
                    } while(opcao1!=0);

                case 2:
                    System.out.println("****Criar Formando****");
                    System.out.print("Insira novo formando: ");
                    String mensagemUtilizador = input.nextLine();
                    criarFormando(mensagemUtilizador);
                    break;
                case 3:
                    System.out.println("****Editar Formando****");

                    break;
                case 4:
                    System.out.println("****Eliminar Formando****");

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

