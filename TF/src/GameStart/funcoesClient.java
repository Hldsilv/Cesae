package GameStart;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static GameStart.funcoesAuxiliares.*;


public class funcoesClient {
    /**
     * Regista um novo cliente, pedindo o nome, contacto
     */
    public static void registarCliente() {

        Scanner input = new Scanner(System.in);

        System.out.println("\nInsira Nome: ");
        String nomeCliente = input.nextLine();

        while (nomeCliente.length() < 4) {
            System.out.println("Nome de Cliente inválido, insira pelo menos 4 caracteres");
            System.out.println("\nInsira Nome: ");
            nomeCliente = input.nextLine();
        }

        System.out.println("\nInsira Contacto: ");
        String contacto = input.nextLine();

        while(contacto.length()<9){
            System.out.println("Contacto invalido, tem que ter 9 dígitos");
            System.out.println("\nInsira Contacto: ");
            contacto = input.nextLine();
        }

        System.out.println("\nInsira Email: ");
        String email = input.nextLine();
        while(email.length()<5){
            System.out.println("Email inválido, insira menos 5 caracteres");
            System.out.println("\nInsira Email: ");
            email = input.nextLine();
        }

        //ver erros de input
        System.out.println("\n******************************************************");
        System.out.println("\nCliente Inserido com Sucesso: "+ nomeCliente + " | " + contacto + " | " + email+"\n");
    }

    /**
     * Procura o estcionamento sabendo que os lugares vagos são todos os números triangulares múltiplos de 5 num limite de 121 lugares.
     */
    public static void procurarEstacionamento() {


        for (int i = 1; i <= 121; i++) {

            int triangular = i * (i + 1) / 2;

            if (triangular > 121) {
                break;
            }
            if (triangular % 5 == 0) {

                System.out.println("\nLugar vago : " + triangular+"\n");
            }
        }
        System.out.println("***********************************\n");
    }

    /**
     * Imprime o catalogo de jogos sem duplicados. é criado um array para comparar se o jogo repete ou não e o ciclo for para fazer essa comparação
     * se o jogo for igual, dá break e o ciclo começa de novo e ele vai comparar, é igual ao jogo[0], se for dá break e reincia o ciclo.
     *
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void imprimirCatalogoJogos() throws FileNotFoundException {
        Scanner sc = importarFicheiro();

        String[] array = new String[contarLinhasFicheiro()];
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
        System.out.println("\n*************************************************");
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
            limparConsola();
            imprimirFicheiro("GameStartF/catalogosGraficosMenu.txt");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    limparConsola();
                    System.out.println("************************ CALL OF DUTTY ************************\n");
                    imprimirFicheiro("GameStartF/CatalogoGrafico/callofDuty.txt");
                    primaEnter();
                    limparConsola();
                    break;

                case 2:
                    limparConsola();
                    System.out.println("************************ FIFA ************************\n");
                    imprimirFicheiro("GameStartF/CatalogoGrafico/fifa.txt");
                    primaEnter();
                    limparConsola();
                    break;

                case 3:
                    limparConsola();
                    System.out.println("************************ HOLLOW KNIGHT ************************\n");
                    imprimirFicheiro("GameStartF/CatalogoGrafico/hollowKnight.txt");
                    primaEnter();
                    limparConsola();
                    break;

                case 4:
                    limparConsola();
                    System.out.println("************************ MINECRAFT ************************\n");
                    imprimirFicheiro("GameStartF/CatalogoGrafico/minecraft.txt");
                    primaEnter();
                    limparConsola();
                    break;

                case 5:
                    limparConsola();
                    System.out.println("************************ MORTAL KOMBAT ************************\n");
                    imprimirFicheiro("GameStartF/CatalogoGrafico/mortalKombat.txt");
                    primaEnter();
                    limparConsola();
                    break;

                case 6:
                    limparConsola();
                    System.out.println("************************ OVERCOOKED ************************\n");
                    imprimirFicheiro("GameStartF/CatalogoGrafico/overcooked.txt");
                    primaEnter();
                    limparConsola();
                    break;

                case 7:
                    limparConsola();
                    System.out.println("************************ WITCHER 3 ************************\n");
                    imprimirFicheiro("GameStartF/CatalogoGrafico/witcher3.txt");
                    primaEnter();
                    limparConsola();
                    break;

                case 0: // Sair
                    break;
                default:
                    System.out.println("******************** Opção Inválida ********************");
                    break;
            }
        } while (opcao != 0);


    }

    /**
     * Imprime o jogo mais recente
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void imprimirJogoMaisRecente() throws FileNotFoundException {
        Scanner sc = importarFicheiro();

        String[] array = new String[contarLinhasFicheiro()];
        String linha = sc.nextLine();

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha = linha.split(";");
            String jogos = itensDaLinha[7];

            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    array[i] = jogos;
                    break;
                }
                if (array[i].equals(jogos)) {
                    break;
                }
        }
    }
        for (int i=0; i< array.length; i++){
            if (array[array.length-1-i] != null) {
                System.out.println(array[array.length-1 -i]);
                break;
            }
        }
        sc.close();
    }

    /** Pergunta a editora a pesquisar e mostra as categorias e os jogos que essa editora tem, seguindo a lógica do menuCatalogoGráfico
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void catalogoEditoras() throws FileNotFoundException {
        Scanner sc = importarFicheiro();
        Scanner input = new Scanner(System.in);

        String[] categorias = new String[contarLinhasFicheiro()];
        String[] jogos = new String[contarLinhasFicheiro()];
        String linha = sc.nextLine();
        System.out.println("Editora a Pesquisar: ");
        String edi = input.nextLine();

        System.out.println("\n************** " + edi + " **************\n");

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha = linha.split(";");
            String editora = itensDaLinha[5];
            String categoria = itensDaLinha[6];
            String jogo = itensDaLinha[7];

            if (editora.equalsIgnoreCase(edi)) {

                for (int i = 0; i < categorias.length; i++) {
                    if (categorias[i] == null) {
                        categorias[i] = categoria;
                        System.out.println("\n__" + categoria + "__");
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
        System.out.println("\n***************************************");
        sc.close();
    }

    /** Pergunta a categora a pesquisar e mostra as editoras e os respectivos jogos que essa categoria tem, seguindo a lógica do menuCatalogoGráfico
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void catalogoCategoria() throws FileNotFoundException {
        Scanner sc = importarFicheiro();
        Scanner input = new Scanner(System.in);

        String[] editoras = new String[contarLinhasFicheiro()];
        String[] jogos = new String[contarLinhasFicheiro()];
        String linha = sc.nextLine();
        System.out.println("Categoria a Pesquisar: ");
        String cat = input.nextLine();

        System.out.println("\n************** " + cat + " **************\n");

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha = linha.split(";");
            String editora = itensDaLinha[5];
            String categoria = itensDaLinha[6];
            String jogo = itensDaLinha[7];

            if (categoria.equalsIgnoreCase(cat)) {
                for (int i = 0; i < editoras.length; i++) {
                    if (editoras[i] == null) {
                        editoras[i] = editora;
                        System.out.println("\n__" + editora + "__");
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
        System.out.println("\n***********************************");
        sc.close();
    }
}

