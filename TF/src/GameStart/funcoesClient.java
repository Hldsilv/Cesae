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
            System.out.println("Contacto invalido, insira pelo menos 9 dígitos");
            System.out.println("\nInsira Contacto: ");
            contacto = input.nextLine();
        }

        System.out.println("\nInsira Email: ");
        String email = input.nextLine();
        while(email.length()<5){
            System.out.println("Email inválido, insira pelo menos 5 caracteres");
            System.out.println("\nInsira Email: ");
            email = input.nextLine();
        }


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
        System.out.println("**********************************************************************************************************\n");
    }

    /**
     * Imprime o catalogo de jogos sem duplicados.
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void imprimirCatalogoJogos() throws FileNotFoundException {
        Scanner sc = importarFicheiroVendas();

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
            limparConsola();

            switch (opcao) {
                case 1:
                    limparConsola();
                    //Poderia ter criado uma função única com tudo o que tem dentro de cada case, mas uso diferentes números de asteriscos para ter uma apresentação mais bonita.
                    //Foi por isso que só coloquei na função o caminho do catalogo grafico, premir enter e limpar consola.
                    System.out.println("************************ CALL OF DUTTY ************************\n");
                    ficheiroCatalogo("callOfDuty.txt");

                    break;

                case 2:
                    limparConsola();
                    System.out.println("*************************************************** FIFA ***************************************************\n");
                    ficheiroCatalogo("fifa.txt");
                    break;

                case 3:
                    limparConsola();
                    System.out.println("******** HOLLOW KNIGHT ********\n");
                    ficheiroCatalogo("hollowKnight.txt");
                    break;

                case 4:
                    limparConsola();
                    System.out.println("************* MINECRAFT *************\n");
                    ficheiroCatalogo("minecraft.txt");
                    break;

                case 5:
                    limparConsola();
                    System.out.println("************************ MORTAL KOMBAT ************************\n");
                    ficheiroCatalogo("mortalKombat.txt");
                    break;

                case 6:
                    limparConsola();
                    System.out.println("********** OVERCOOKED **********\n");
                    ficheiroCatalogo("overcooked.txt");
                    break;

                case 7:
                    limparConsola();
                    System.out.println("******************************** WITCHER 3 ********************************\n");
                    ficheiroCatalogo("witcher3.txt");
                    break;

                case 0: // Sair
                    break;
                default:
                    opcaoInvalida();
                    break;
            }
        } while (opcao != 0);


    }

    /**
     * Imprime o jogo mais recente
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void imprimirJogoMaisRecente() throws FileNotFoundException {
        Scanner sc = importarFicheiroVendas();

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
                System.out.println(array[array.length-1-i]);
                break;
            }
        }
        System.out.println("\n********************************************************************************************************************************");
        sc.close();
    }

    /** Pergunta a editora a pesquisar e mostra as categorias e os jogos que essa editora tem, seguindo a lógica do menuCatalogoGráfico
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void catalogoEditoras() throws FileNotFoundException {
        Scanner sc = importarFicheiroVendas();
        Scanner input = new Scanner(System.in);

        String[] categorias = new String[contarLinhasFicheiro()];
        String[] jogos = new String[contarLinhasFicheiro()];
        String linha = sc.nextLine();
        System.out.println("Editora a Pesquisar: ");
        String edi = input.nextLine();
        boolean encontrado = false;

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
                        encontrado=true;
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
        if(!encontrado){
            System.out.println("\nEditora não encontrada\n");
        }
        System.out.println("\n***************************************");
        sc.close();
    }

    /** Pergunta a categora a pesquisar e mostra as editoras e os respectivos jogos que essa categoria tem, seguindo a lógica do menuCatalogoGráfico
     * @throws FileNotFoundException Caso não encontre o ficheiro
     */
    public static void catalogoCategoria() throws FileNotFoundException {
        Scanner sc = importarFicheiroVendas();
        Scanner input = new Scanner(System.in);

        String[] editoras = new String[contarLinhasFicheiro()];
        String[] jogos = new String[contarLinhasFicheiro()];
        String linha = sc.nextLine();
        System.out.println("Categoria a Pesquisar: ");
        String cat = input.nextLine();
        boolean encontrado = false;

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
                        encontrado=true;
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
        if(!encontrado){
            System.out.println("\nCategoria não encontrada\n");
        }
        System.out.println("\n***********************************");
        sc.close();
    }
}

