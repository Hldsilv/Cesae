package Jogo;

import AudioEcor.Audio;
import AudioEcor.Cor;
import Entidades.*;
import Itens.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import static FuncoesAux.funcAux.*;

public class Jogo {
    private ArrayList<ArmaPrincipal> armas;
    private ArrayList<Pocao> pocoes;
    private ArrayList<ConsumivelCombate> consumiveisCombate;
    private Vendedor vendedor;

    /**
     * Função para mostrar a introdução do jogo
     */ 
    public void mostrarIntroducao() {
        Audio.playMusic("Ficheiros/Audio/Skyrim.wav");
        limparConsola();
        System.out.println("Bem-vindo à Grande Aventura em Luméria!\n");
        System.out.println("Há muito tempo, o reino de Luméria era uma de conhecimento e harmonia, protegido por cristais mágicos que irradiavam luz e poder por toda a terra. \nMas a paz foi quebrada quando um desses cristais, o Coração de Auria, desapareceu misteriosamente.");
        System.out.println("Sem o Coração, a luz de Luméria começou a enfraquecer. O reino mergulhou numa noite perpétua, e forças sombrias aproveitaram para espalhar o caos. \nAs aldeias estão a ser destruídas, monstros surgem das sombras e o povo já quase perdeu a esperança.");
        System.out.println("És um dos poucos que recusam aceitar este desafio. Boa sorte a recuperar o Coração de Auria e restaurar a luz a Luméria.");
        System.out.println("\nEscolhe sabiamente, pois as tuas escolhas irão moldar o destino do reino.");
        primaEnter();
    }

    /**
     * Função para criar o personagem
     * @return Heroi criado
     */
    public Heroi criarPersonagem() {
        Scanner input = new Scanner(System.in);
        int opcao, dificuldade;

        do {
            System.out.println("\nEscolhe o tipo de herói:\n" +
                    " \n" + Cor.ConsoleColors.BLUE_BOLD  + "[1] \uD83D\uDDE1\uFE0F Cavaleiro \uD83D\uDDE1\uFE0F - Um guerreiro honrado e implacável em combate corpo a corpo. Treinado para proteger os fracos, enfrenta qualquer perigo com coragem inabalável.\n");
            System.out.println(Cor.ConsoleColors.PURPLE_BOLD + "[2] \uD83C\uDFF9 Feiticeiro \uD83C\uDFF9 - Um caçador astuto, movendo-se silenciosamente na escuridão. Com ataques à distância e reflexos rápidos, é mortal e imprevisível.\n");
            System.out.println(Cor.ConsoleColors.YELLOW_BOLD + "[3] \uD83D\uDD2E Arqueiro \uD83D\uDD2E - Um mestre das artes arcanas, capaz de manipular a energia mágica para lançar feitiços poderosos. Com conhecimento antigo e habilidades místicas.\n" + Cor.ConsoleColors.RESET);
            opcao = input.nextInt();
        } while (opcao < 1 || opcao > 3);

        do {
            System.out.println("Escolhe a dificuldade: \n" + Cor.ConsoleColors.GREEN_BOLD + "\n[1] Fácil\n\n" + Cor.ConsoleColors.RED_BOLD + "[2] Difícil" + Cor.ConsoleColors.RESET);
            dificuldade = input.nextInt();
        } while (dificuldade < 1 || dificuldade > 2);

        int pontos = (dificuldade == 1) ? 300 : 220;
        int hp, forca;

        do {
            System.out.println("Tens " + pontos + " pontos para distribuir.");
            System.out.println("Cada ponto de vida vale 1 ponto.");
            System.out.println("Cada ponto de força vale 5 pontos.");
            System.out.println("Escolhe os pontos de vida (HP): ");
            hp = input.nextInt();

            System.out.println("Escolhe os pontos de força: ");
            forca = input.nextInt();

            if (hp + (forca * 5) != pontos) {
                System.out.println("Distribuição inválida! Tenta novamente.");
            }
        } while (hp + (forca * 5) != pontos);


        int ouro = (dificuldade == 1) ? 20 : 15;

        switch (opcao) {
            case 1:
                // Equipamento inicial do Cavaleiro
                ArmaPrincipal espadaInicial = new ArmaPrincipal("Espada Inicial", 0, 1, 5);
                return new Cavaleiro("Cavaleiro", hp, hp, forca, 1, ouro, espadaInicial);


            case 2:
                // Equipamento inicial do Feiticeiro
                ArmaPrincipal cajadoInicial = new ArmaPrincipal("Cajado Inicial", 0, 1, 5);
                return new Feiticeiro("Feiticeiro", hp, hp, forca, 1, ouro, cajadoInicial);

            case 3:
                // Equipamento inicial do Arqueiro
                ArmaPrincipal arcoInicial = new ArmaPrincipal("Arco Inicial", 0, 1, 5);
                return new Arqueiro("Arqueiro", hp, hp, forca, 1, ouro, arcoInicial);
        }
        return null;
    }

    /**
     * Função para inicializar os itens e inimigos
     */
    private void inicializarItensEInimigos() {
        // Inicializando as listas
        this.armas = new ArrayList<>();
        this.pocoes = new ArrayList<>();
        this.consumiveisCombate = new ArrayList<>();

        // Armas balanceadas

        addArma(new ArmaPrincipal("Espada Lendária", 50, 20, 35), "Cavaleiro");
        addArma(new ArmaPrincipal("Arco Élfico", 50, 18, 32), "Arqueiro");
        addArma(new ArmaPrincipal("Cajado Arcano", 50, 15, 40), "Feiticeiro");

        // Poções balanceadas
        addPocao(new Pocao("Poção de Cura Pequena", 15, 30, 0));
        addPocao(new Pocao("Poção de Cura Pequena", 15, 30, 0));
        addPocao(new Pocao("Poção de Cura", 20, 45, 0));
        addPocao(new Pocao("Poção de Cura", 20, 45, 0));
        addPocao(new Pocao("Poção Mista", 30, 20, 2));
        addPocao(new Pocao("Poção Mista grande", 35, 20, 2));
        addPocao(new Pocao("Poção de Grande Cura", 35, 60, 0));


        // Consumíveis de Combate balanceados
        addConsumivelCombate(new ConsumivelCombate("Bomba de Fogo", 15, 60));
        addConsumivelCombate(new ConsumivelCombate("Flecha Explosiva", 25, 80));
        addConsumivelCombate(new ConsumivelCombate("Explosivo ", 10, 50));
        addConsumivelCombate(new ConsumivelCombate("Granada ", 20, 70));


        // Vendedor e adicionar itens à loja
        this.vendedor = new Vendedor("Mercador Misterioso");
        for (ArmaPrincipal arma : armas) {
            vendedor.adicionarItem(arma);
        }
        for (Pocao pocao : pocoes) {
            vendedor.adicionarItem(pocao);
        }
        for (ConsumivelCombate consumivel : consumiveisCombate) {
            vendedor.adicionarItem(consumivel);
        }

        Collections.shuffle(vendedor.getLoja());
    }

    /**
     * Função para adicionar uma arma à lista de armas
     * @param arma arma a adicionar
     * @param heroiPermitido herói permitido para usar a arma
     */
    private void addArma(ArmaPrincipal arma, String heroiPermitido) {
        arma.adicionarHeroiPermitido(heroiPermitido);
        armas.add(arma);
    }

    /**
     * Função para adicionar uma poção à lista de poções
     * @param pocao poção a adicionar
     */
    private void addPocao(Pocao pocao) {
        pocoes.add(pocao);
    }
    /**
     * Função para adicionar um consumível de combate à lista de consumíveis de combate do 
     * @param consumivel consumível de combate a adicionar
     */
    private void addConsumivelCombate(ConsumivelCombate consumivel) {
        consumiveisCombate.add(consumivel);
    }

    /**
     * Função para iniciar a aventura
     * @param heroi herói a iniciar a aventura
     */
    public void iniciarAventura(Heroi heroi) throws FileNotFoundException, InterruptedException {
        System.out.println();
        heroi.mostrarDetalhes();
        primaEnter();
        limparConsola();
        System.out.println("Estás numa pequena vila, situada à beira de um bosque sombrio.");
        System.out.println("As casas, feitas de madeira antiga, rangem suavemente sob a brisa fria que anuncia a noite.");
        System.out.println("O som do riacho ao longe mistura-se com o murmúrio dos aldeões, preocupados com o destino incerto.");
        System.out.println();
        System.out.println("Nesta vila, recebeste a missão de recuperar o lendário Coração de Auria.");
        System.out.println("Os aldeões olham para ti com esperança, mas também com medo.");
        System.out.println();
        System.out.println("És um(a) " + heroi.getClass().getSimpleName() + ", o herói escolhido para enfrentar esta tarefa.");
        System.out.println("Olhas uma última vez para a vila que deixas para trás e preparas-te para entrar no desconhecido.");
        primaEnter();
        limparConsola();
        inicializarItensEInimigos();
        salas(heroi);
    }

    /**
     * Função para criar as salas e os inimigos
     * @param heroi herói a criar as salas e os inimigos
     */
    private void salas(Heroi heroi) throws FileNotFoundException, InterruptedException {
        ItemHeroi itemSala9 = null;

        Sala sala10 = new Sala(
                "Sala 10: ",
                null, null,
                null, null
        );
        NPC dragao = new NPC("Dragão", 400, 400, 20);
        dragao.setOuro(100);
        sala10.adicionarInimigo(dragao);

        Sala sala9 = new Sala(
                "Sala 9: No final do desfiladeiro, avistas um santuário antigo com marcas de batalhas.",
                sala10, "Entrar no santuário.",
                sala10, "Continuar a explorar a floresta."
        );
        Random random = new Random();
        int chance = random.nextInt(100);
        if (chance < 40) {
            NPC bruxa = new NPC("Bruxa", 275, 275, 17);
            bruxa.setOuro(40);
            sala9.adicionarInimigo(bruxa);
        } else {
            itemSala9 = getItemAleatorio(heroi);
            sala9.adicionarItem(itemSala9);
        }

        Sala sala8 = new Sala(
                "Sala 8: Depois de atravessar a ponte, encontras uma entrada secreta para uma masmorra.",
                sala10, "Descer para explorar a masmorra.",
                sala10, "Continuar a explorar a floresta."
        );
        sala8.setVendedor(vendedor);

        Sala sala7 = new Sala(
                "Sala 7: Começas a ouvir um som estranho e...",
                sala8, "Avistas uma ponte longinqua e decides ir até lá.",
                sala9, "Descer um desfiladeiro."
        );
        NPC ogre = new NPC("Ogre", 200, 200, 15);
        ogre.setOuro(50);
        sala7.adicionarInimigo(ogre);

        Sala sala5 = new Sala(
                "Sala 5: Entretanto encontras umas ruínas antigas...",
                sala7, "Subir as ruínas para uma vista melhor.",
                sala7, "Entrar em uma passagem escondida nas ruínas."
        );
        sala5.setVendedor(vendedor);

        Sala sala6 = new Sala(
                "Sala 6: Estás a andar e de repente ouves um som estranho.",
                sala5, "Ir em direção ao som de uma melodia.",
                sala5, "Seguir pegadas deixadas no chão."
        );
        NPC esqueleto = new NPC("Esqueleto", 150, 150, 12);
        esqueleto.setOuro(30);
        sala6.adicionarInimigo(esqueleto);

        Sala sala4 = new Sala(
                "Sala 4:Há um campo aberto com uma árvore solitária.\n\n" +
                        "Após seguir o rio, entras para um campo aberto, onde encontras uma única árvore num campo deserto. \nO vento sopra suavemente e de repente vês algumas marcas no chão que indicam que algo (ou alguém) passou por ali recentemente.\n",
                sala7, "Investigar a árvore solitária.",
                sala7, "Seguir as marcas no chão."
        );
        ItemHeroi itemSala4 = getItemAleatorio(heroi);
        sala4.adicionarItem(itemSala4);

        Sala sala3 = new Sala(
                "Sala 3: No final do rio, encontras uma caverna escura.\n",
                sala6, "Entrar na caverna",
                sala6, "Explorar um túnel lateral"
        );
        ItemHeroi itemSala3 = getItemAleatorio(heroi);
        sala3.adicionarItem(itemSala3);

        Sala sala2 = new Sala(
                "Sala2: Chegaste a um rio de água cristalina e encontras pegadas frescas que sugerem que algo esteve aqui recentemente.",
                sala4, "Seguir o curso do rio",
                sala5, "Atravessar o rio, explorando o lado desconhecido."
        );
        NPC goblin = new NPC("Goblin", 100, 100, 8);
        goblin.setOuro(20);
        sala2.adicionarInimigo(goblin);

        Sala sala1 = new Sala(
                "Sala1 :Antes de sair da tua aldeia para a grande aventura...",
                sala2, "Seguir um caminho que desaparece na floresta.",
                sala3, "Ir em direção a uma luz misteriosa."
        );
        sala1.setVendedor(vendedor);

        // Começa o jogo
        Sala salaAtual = sala1;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println(Cor.ConsoleColors.CYAN_BOLD + "\n" + salaAtual.getDescricao() + Cor.ConsoleColors.RESET);
            
            if (salaAtual == sala9) {
                // Verificar se há inimigo
                if (salaAtual.getInimigo() != null) {
                    System.out.println(Cor.ConsoleColors.RED_BOLD + "\n⚔️ Encontraste um " + salaAtual.getInimigo().getNome() + "!" + Cor.ConsoleColors.RESET);
                    primaEnter();
                    limparConsola();
                    heroi.atacar(salaAtual.getInimigo());
                    heroi.mostrarDetalhes();
                    primaEnter();
                }
                // Verificar se há item
                if (itemSala9 != null) {
                    System.out.println(Cor.ConsoleColors.YELLOW_BOLD + "\n✨ Encontraste um item: " + itemSala9.getNome() + Cor.ConsoleColors.RESET);
                    if (itemSala9 instanceof ArmaPrincipal) {
                        System.out.println(Cor.ConsoleColors.PURPLE_BOLD + "Queres equipar a nova arma? (1-Sim/2-Não)" + Cor.ConsoleColors.RESET);
                        int escolha = input.nextInt();
                        if (escolha == 1) {
                            heroi.setArmaPrincipal((ArmaPrincipal) itemSala9);
                            System.out.println(Cor.ConsoleColors.GREEN_BOLD + "Nova arma equipada!" + Cor.ConsoleColors.RESET);
                        }
                    } else if (itemSala9 instanceof Consumivel) {
                        heroi.getInventario().add((Consumivel) itemSala9);
                        System.out.println(Cor.ConsoleColors.GREEN_BOLD + "Item adicionado ao inventário!" + Cor.ConsoleColors.RESET);
                    }
                    itemSala9 = null;
                    primaEnter();
                    limparConsola();
                }
            }
            // itens encontrados
            if (salaAtual == sala4) {
                System.out.println("\nEncontraste um item: " + itemSala4.getNome());
                if (itemSala4 instanceof ArmaPrincipal) {
                    System.out.println("Queres equipar a nova arma? (1-Sim/2-Não)");
                    int escolha = input.nextInt();
                    if (escolha == 1) {
                        heroi.setArmaPrincipal((ArmaPrincipal) itemSala4);
                        System.out.println("Nova arma equipada!");
                    }
                } else if (itemSala4 instanceof Consumivel) {
                    heroi.getInventario().add((Consumivel) itemSala4);
                    System.out.println("Item adicionado ao inventário!");
                }
                itemSala4 = null;
                primaEnter();
                limparConsola();
            }

            if (salaAtual == sala3) {
                int chanceEncontrar = random.nextInt(100);

                if (chanceEncontrar < 90) { 
                    System.out.println("\nEncontraste um item escondido: " + itemSala3.getNome());
                    if (itemSala3 instanceof ArmaPrincipal) {
                        System.out.println("Queres equipar a nova arma? (1-Sim/2-Não)");
                        int escolha = input.nextInt();
                        if (escolha == 1) {
                            heroi.setArmaPrincipal((ArmaPrincipal) itemSala3);
                            System.out.println("Nova arma equipada!");
                        }
                    } else if (itemSala3 instanceof Consumivel) {
                        heroi.getInventario().add((Consumivel) itemSala3);
                        System.out.println("Item adicionado ao inventário!");
                    }
                    itemSala3 = null;
                    primaEnter();
                    limparConsola();
                }
            }

                // Verificar se há inimigo na sala atual
                if (salaAtual.getInimigo() != null) {
                    Audio.stopMusic();
                    Audio.playMusic("Ficheiros/Audio/fight.wav");
                    System.out.println("\n⚔️ Encontraste um " + salaAtual.getInimigo().getNome() + "!" + Cor.ConsoleColors.RESET);
                    primaEnter();
                    limparConsola();
                    heroi.atacar(salaAtual.getInimigo());
                    heroi.mostrarDetalhes();
                    primaEnter();
                    Audio.stopMusic();
                    Audio.playMusic("Ficheiros/Audio/Skyrim.wav");
                }

                // Verificar se há vendedor na sala
                if (salaAtual.getVendedor() != null) {
                    System.out.println(Cor.ConsoleColors.PURPLE_BOLD + "\n Um vendedor misterioso aparece!" + Cor.ConsoleColors.RESET);
                    primaEnter();
                    limparConsola();

                    while (true) {
                        vendedor.imprimirLoja();
                        System.out.println(Cor.ConsoleColors.YELLOW_BOLD + "\nTens disponível " + heroi.getOuro() + " de Ouro.\n" + Cor.ConsoleColors.RESET);
                        System.out.println(Cor.ConsoleColors.CYAN_BOLD + "Qual o item que desejas comprar? (0 para sair)\n" + Cor.ConsoleColors.RESET);
                        int escolhaLoja = input.nextInt();

                        if (escolhaLoja == 0) {
                            System.out.println(Cor.ConsoleColors.BLUE_BOLD + "Saindo da loja..." + Cor.ConsoleColors.RESET);
                            primaEnter();
                            limparConsola();
                            break;
                        }

                        if (escolhaLoja > 0) {
                            vendedor.vender(heroi, escolhaLoja);
                        } else {
                            System.out.println(Cor.ConsoleColors.RED_BOLD + "Escolha inválida. Tente novamente." + Cor.ConsoleColors.RESET);
                        }
                        primaEnter();
                    }
                }
                System.out.println(Cor.ConsoleColors.YELLOW_BOLD + "\n Inventário de Poções:" + Cor.ConsoleColors.RESET);
                ArrayList<Consumivel> inventario = heroi.getInventario();
                boolean temPocoes = false;

                for (int i = 0; i < inventario.size(); i++) {
                    if (inventario.get(i) instanceof Pocao) {
                        System.out.println(Cor.ConsoleColors.GREEN_BOLD + (i + 1) + " - " + inventario.get(i).getNome() + Cor.ConsoleColors.RESET);
                        Pocao pocao = (Pocao) inventario.get(i);
                        System.out.println(Cor.ConsoleColors.RED_BOLD + "   ❤️ Cura: " + pocao.getCurarVida() + Cor.ConsoleColors.RESET + 
                                         Cor.ConsoleColors.PURPLE_BOLD + " | ⚔️ Força: +" + pocao.getAumentoForca() + Cor.ConsoleColors.RESET);
                        temPocoes = true;
                    }
                }

                if (!temPocoes) {
                    System.out.println(Cor.ConsoleColors.RED_BOLD + "❌ Não tens poções no inventário!" + Cor.ConsoleColors.RESET);
                } else {
                    while (true) {
                        System.out.println(Cor.ConsoleColors.CYAN_BOLD + "\n Desejas usar alguma poção? (1-Sim/0-Não)" + Cor.ConsoleColors.RESET);
                        int escolhaPocao = input.nextInt();
                        
                        if (escolhaPocao != 1) break;
                        
                        heroi.usarPocao();
                        if (heroi.getInventario().isEmpty()) break;
                    }
                }
                primaEnter();
                limparConsola();

                // Mostrar opções para salas
                if (salaAtual.getOpcao1() != null) {
                    System.out.println(Cor.ConsoleColors.CYAN_BOLD + "\n[1] " + Cor.ConsoleColors.BLUE_BOLD + salaAtual.getDescricaoOpcao1() + Cor.ConsoleColors.RESET);
                }
                if (salaAtual.getOpcao2() != null) {
                    System.out.println(Cor.ConsoleColors.CYAN_BOLD + "\n[2] " + Cor.ConsoleColors.BLUE_BOLD + salaAtual.getDescricaoOpcao2() + Cor.ConsoleColors.RESET);
                }

                System.out.print(Cor.ConsoleColors.YELLOW_BOLD + "\n👉 Escolha uma opção: " + Cor.ConsoleColors.RESET);
                int escolha = input.nextInt();

                if (escolha == 1) {
                    salaAtual = salaAtual.getOpcao1();
                    heroi.getArmaPrincipal().setUsouAtaqueEspecial(false);  // Reset do ataque especial
                } else if (escolha == 2) {
                    salaAtual = salaAtual.getOpcao2();
                    heroi.getArmaPrincipal().setUsouAtaqueEspecial(false);  // Reset do ataque especial
                } else {
                    System.out.println("Escolha inválida. Tente novamente.");
                }
                //final do jogo
                if (salaAtual == sala10) {
                    Audio.stopMusic();
                    Audio.playMusic("Ficheiros/Audio/fight.wav");
                    System.out.println(Cor.ConsoleColors.RED_BOLD + "\n Prepara-te para a batalha final!" + Cor.ConsoleColors.RESET);
                    System.out.println(Cor.ConsoleColors.RED_BOLD + "O Dragão de Auria aparece diante de ti!" + Cor.ConsoleColors.RESET);
                    primaEnter();
                    limparConsola();
                    
                    // Batalha com o dragão
                    if (salaAtual.getInimigo() != null) {
                        System.out.println(Cor.ConsoleColors.RED_BOLD + "\nRAAAAAWWWRRRRR!" + Cor.ConsoleColors.RESET);
                        primaEnter();
                        limparConsola();
                        heroi.atacar(salaAtual.getInimigo());
                        
                        // Se o herói sobreviveu à batalha
                        if (heroi.getHp() > 0) {
                            Audio.stopMusic();
                            Audio.playMusic("Ficheiros/Audio/Skyrim.wav");
                            System.out.println(Cor.ConsoleColors.GREEN_BOLD + "\nParabéns! Derrotaste o Dragão e completaste a tua missão!" + Cor.ConsoleColors.RESET);
                            System.out.println("\nLuméria está salva graças à tua bravura!");
                            encerrarPrograma();
                            primaEnter();
                            break;
                        }
                    }
                }
            }
        }

        /**
         * Função para obter um item aleatório nas salas
         * @return ItemHeroi aleatório
         */
        public ItemHeroi getItemAleatorio(Heroi heroi) {
            Random random = new Random();
            int listaEscolhida = random.nextInt(3);

            switch (listaEscolhida) {
                case 0: // Armas
                    if (!armas.isEmpty()) {
                        for (ArmaPrincipal arma : armas) {
                            if (arma.getHeroisPermitidos().contains(heroi.getNome())) {
                                return arma;
                            }
                        }
                    }
                    break;
                case 1: // Poções
                    if (!pocoes.isEmpty()) {
                        return pocoes.get(random.nextInt(pocoes.size()));
                    }
                    break;
                case 2: // Consumíveis de Combate
                    if (!consumiveisCombate.isEmpty()) {
                        return consumiveisCombate.get(random.nextInt(consumiveisCombate.size()));
                    }
                    break;
            }
            return null;
        }
    }