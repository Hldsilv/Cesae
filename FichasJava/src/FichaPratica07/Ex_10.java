package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_10 {

    public static void informacoesMatriz() throws FileNotFoundException {

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

for (int i =0; i< matriz.length;i++){
    for (int j=0; j< matriz[0].length; j++){
        System.out.print(matriz[i][j]+ " | ");
    }
    System.out.println(" ");
}


    }



    public static void main(String[] args) throws FileNotFoundException {


        informacoesMatriz();
        File file = new File("C:/Users/cesae/Desktop/Programação/FichaPratica07/exercicio_09.csv");
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
                                System.out.println("Opção 1 - Imprimir todos os formandos");

                            case 2:
                                System.out.println("****Criar Formando****");


                            case 3:
                                System.out.println("****Dado um curso, imprima todos os seus formandos (nome e matrícula), no final deve aparecer a contagem de formandos inscritos nesse curso)****");


                            case 4:
                                System.out.println("****Imprimir o aluno mais velho****");

                            case 5:
                                System.out.println("****Imprimir alunos que estão inscritos em mais de um curso****");

                            case 6:
                                System.out.println("****Número de formandos no ficheiro****");


                            case 0: // Sair
                                System.out.println("Obrigado! Até à próxima! :D");
                                break;
                            default:
                                System.out.println("***** Opção Inválida *****");

                        }
                    } while(opcao1!=0);

                case 2:
                    System.out.println("****Criar Formando****");


                case 3:
                    System.out.println("****Editar Formando****");


                case 4:
                    System.out.println("****Eliminar Formando****");


                case 0: // Sair
                    System.out.println("Obrigado! Até à próxima! :D");
                    break;
                default:
                    System.out.println("***** Opção Inválida *****");
            }
        }while (opcao!=0);
    }

    }
}
