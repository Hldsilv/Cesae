package GameStart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class functionsClient {
    /**
     * Regista um novo cliente, pedindo o nome, contacto
     */
    public static void registarCliente() {


        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("Insira Nome: ");
        String nomeCliente = input.nextLine();

        System.out.println("Insira Contacto: ");
        int contacto = input.nextInt();
        input.nextLine(); // Limpa o buffer

        System.out.println("Insira Email: ");
        String email = input.nextLine();

        if (nomeCliente.isEmpty()) {
            System.out.println("Erro: Nome inválido!");
            return;
        }
        if (!email.contains("@") && !email.contains(".")) {
            System.out.println("Erro: Email inválido!");
            return;
        }
        System.out.println();
        System.out.println("Cliente Inserido com Sucesso: " + nomeCliente + " | " + contacto + " | " + email);
        System.out.println();

    }

    /**
     * Procura o estcionamento sabendo que os lugares vagos são todos os números triangulares múltiplos de 5 num limite de 121 lugares.
     */
    public static void procurarEstacionamento() {
//não está bem

        for (int i = 1; i <= 121; i++) {

            int triangular = i * (i + 1) / 2;

            if (triangular > 121) {

                break;
            }
            if (triangular % 5 == 0) {
                System.out.println(" ");
                System.out.println("Lugar vago : " + triangular);
            }
        }
        System.out.println("***********************************");

    }

    /**
     * Imprime o catalogo de jogos sem duplicados. é criado um array para comparar se o jogo repete ou não e o ciclo for para fazer essa comparação
     * se o jogo for igual, dá break e o ciclo começa de novo e ele vai comparar, é igual ao jogo[0], se for dá break e reincia o ciclo.
     *
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void imprimirCatalogoJogos() throws FileNotFoundException {
        File scannerFicheiro = new File("GameStartF/GameStart_Vendas.csv");
        Scanner sc = new Scanner(scannerFicheiro);

        String[] array = new String[127];
        String linha = sc.nextLine();

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha = linha.split(";");
            String jogos = itensDaLinha[7];

            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    array[i] = jogos;
                    System.out.println(jogos);
                    break;
                }
                if (array[i].equals(jogos)) {
                    break;
                }
            }
        }
        sc.close();
    }

    /**
     * menu de catalogos gráficos e imprime os mesmos
     *
     * @throws FileNotFoundException caso não encontre o ficheiro
     */
    public static void menuCatalogoGrafico() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao;
        do {
            System.out.println();
            System.out.println("****Catálogos Gráficos****");
            System.out.println();
            System.out.println("Opção 1 - Call of Dutty");
            System.out.println("Opção 2 - Fifa ");
            System.out.println("Opção 3 - Hollow Knight");
            System.out.println("Opção 4 - Minecraft ");
            System.out.println("Opção 5 - Overcooked ");
            System.out.println("Opção 6 - Witcher 3 ");
            System.out.println("Opção 0 - Sair ");


            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("********* CALL OF DUTTY *********");
                    System.out.println();
                    imprimirFicheiro("GameStartF/CatalogoGrafico/callofDuty.txt");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("********* FIFA *********");
                    System.out.println();
                    imprimirFicheiro("GameStartF/CatalogoGrafico/fifa.txt");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("********* HOLLOW KNIGHT *********");
                    System.out.println();
                    imprimirFicheiro("GameStartF/CatalogoGrafico/hollowKnight.txt");
                    System.out.println();

                    break;

                case 4:
                    System.out.println("********* MINECRAFT *********");
                    System.out.println();
                    imprimirFicheiro("GameStartF/CatalogoGrafico/minecraft.txt");
                    System.out.println();
                    break;

                case 5:
                    System.out.println("********* MORTAL KOMBAT *********");
                    System.out.println();
                    imprimirFicheiro("GameStartF/CatalogoGrafico/mortalKombat.txt");
                    System.out.println();
                    break;

                case 6:
                    System.out.println("********* WITCHER 3 *********");
                    System.out.println();
                    imprimirFicheiro("GameStartF/CatalogoGrafico/witcher3.txt");
                    System.out.println();
                    break;

                case 0: // Sair
                    break;
                default:
                    System.out.println("***** Opção Inválida *****");
                    break;
            }
        } while (opcao != 0);


    }

    /**
     * Imprime um ficheiro
     *
     * @param path caminho onde está o ficheiro
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static void imprimirFicheiro(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        while (scannerFicheiro.hasNextLine()) {
            System.out.println(scannerFicheiro.nextLine());
        }

        scannerFicheiro.close();
    }

    public static void imprimirJogoMaisRecente() {

    }

    /** Pergunta a editora a pesquisar e mostra as categorias e os jogos que essa editora tem, seguindo a lógica do menuCatalogoGráfico
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void catalogoEditoras() throws FileNotFoundException {
        File scannerFicheiro = new File("GameStartF/GameStart_Vendas.csv");
        Scanner sc = new Scanner(scannerFicheiro);
        Scanner input = new Scanner(System.in);

        String[] categorias = new String[127];
        String[] jogos = new String[127];
        String linha = sc.nextLine();
        System.out.println("Editora a Pesquisar: ");
        String edi = input.next();
        System.out.println();
        System.out.println("***** " + edi + " *****");
        System.out.println();

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha = linha.split(";");
            String editora = itensDaLinha[5];
            String categoria = itensDaLinha[6];
            String jogo = itensDaLinha[7];

            if (edi.equals(editora)) {

                for (int i = 0; i < categorias.length; i++) {
                    if (categorias[i] == null) {
                        categorias[i] = categoria;
                        System.out.println();
                        System.out.println("__" + categoria + "__");
                        break;
                    }
                    if (categorias[i].equals(categoria)) {
                        break;
                    }
                }
                for (int j = 0; j < jogos.length; j++) {
                    if (jogos[j] == null) {
                        jogos[j] = jogo;
                        System.out.println(jogo);
                        break;
                    }
                    if (jogos[j].equals(jogo)) {
                        break;
                    }

                }

            }
        }
        sc.close();
    }

    /** Pergunta a categora a pesquisar e mostra as editoras e os respectivos jogos que essa categoria tem, seguindo a lógica do menuCatalogoGráfico
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void catalogoCategoria() throws FileNotFoundException {
        File scannerFicheiro = new File("GameStartF/GameStart_Vendas.csv");
        Scanner sc = new Scanner(scannerFicheiro);
        Scanner input = new Scanner(System.in);

        String[] editoras = new String[127];
        String[] jogos = new String[127];
        String linha = sc.nextLine();
        System.out.println("Categoria a Pesquisar: ");
        String cat = input.next();

        System.out.println();
        System.out.println("***** " + cat + " *****");
        System.out.println();

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha = linha.split(";");
            String editora = itensDaLinha[5];
            String categoria = itensDaLinha[6];
            String jogo = itensDaLinha[7];

            if (cat.equals(categoria)) {
                for (int i = 0; i < editoras.length; i++) {
                    if (editoras[i] == null) {
                        editoras[i] = editora;
                        System.out.println();
                        System.out.println("__" + editora + "__");
                        break;
                    }
                    if (editoras[i].equals(editora)) {
                        break;
                    }
                }
                for (int j = 0; j < jogos.length; j++) {
                    if (jogos[j] == null) {
                        jogos[j] = jogo;
                        System.out.println(jogo);
                        break;
                    }
                    if (jogos[j].equals(jogo)) {
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}



