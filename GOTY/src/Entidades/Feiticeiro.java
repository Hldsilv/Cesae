package Entidades;

import AudioEcor.Audio;
import AudioEcor.Cor;
import Itens.ArmaPrincipal;
import Itens.Consumivel;
import Itens.ConsumivelCombate;

import java.io.FileNotFoundException;
import java.util.Scanner;
import static FuncoesAux.funcAux.*;

public class Feiticeiro extends Heroi {
    Scanner input = new Scanner(System.in);

    /**
     * Construtor da classe Feiticeiro
     * @param nome nome do Feiticeiro
     * @param maxHp hp máximo do Feiticeiro
     * @param hp hp atual do Feiticeiro
     * @param forca força do Feiticeiro
     * @param nivel nivel do Feiticeiro
     * @param ouro ouro do Feiticeiro
     * @param armaPrincipal arma principal do Feiticeiro
     */
    public Feiticeiro(String nome, int maxHp, int hp, int forca, int nivel, int ouro, ArmaPrincipal armaPrincipal) {
        super(nome, maxHp, hp, forca, nivel, ouro, armaPrincipal);
    }

    @Override
    public void atacar(NPC npc) throws InterruptedException, FileNotFoundException {
        System.out.println("\nO Feiticeiro enfrenta o inimigo!\n");
        mostrarDetalhesCombate(this, npc);
        primaEnter();

        while (true) {
            System.out.println("\nEscolha o tipo de ataque:");
            System.out.println("1. Ataque Normal");
            System.out.println("2. Ataque Especial");
            System.out.println("3. Ataque Consumível");

            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    limparConsola();
                    int danoNormal = getForca() + getArmaPrincipal().getAtaque();
                    npc.setHp(npc.getHp() - danoNormal);
                    System.out.println("\nO Feiticeiro ataca! O inimigo perde " + danoNormal + " pontos de vida.\n");
                    mostrarDetalhesCombate(this, npc);
                    primaEnter();
                    break;

                case 2:
                    if (!getArmaPrincipal().isUsouAtaqueEspecial()) {
                        limparConsola();
                        int danoEspecial = getForca() + getArmaPrincipal().getAtaqueEspecial();
                        npc.setHp(npc.getHp() - danoEspecial);
                        System.out.println("\nO Feiticeiro usa Ataque Especial! O inimigo perde " + danoEspecial + " pontos de vida.\n");
                        getArmaPrincipal().setUsouAtaqueEspecial(true);
                        mostrarDetalhesCombate(this, npc);
                        primaEnter();
                    } else {
                        limparConsola();
                        System.out.println(Cor.ConsoleColors.RED_BACKGROUND + "Já usaste o Ataque Especial nesta luta!\n" + Cor.ConsoleColors.RESET);
                        mostrarDetalhesCombate(this, npc);
                        primaEnter();
                        continue;
                    }
                    break;

                case 3:
                    if (getInventario().isEmpty()) {
                        limparConsola();
                        System.out.println("Não tens itens consumíveis!\n");
                        mostrarDetalhesCombate(this, npc);
                        primaEnter();
                        continue;
                    }

                    System.out.println("\nConsumíveis disponíveis:");
                    for (int i = 0; i < getInventario().size(); i++) {
                        if (getInventario().get(i) instanceof ConsumivelCombate) {
                            System.out.println((i + 1) + ". " + getInventario().get(i).getNome() +
                                        "\t|\tAtaque: " +((ConsumivelCombate) getInventario().get(i)).getAtaqueInstantaneo());
                        }
                    }
                    System.out.println("0. Cancelar");
                    System.out.print("Escolha um consumível: ");
                    int escolha = input.nextInt();

                    if (escolha == 0) {
                        primaEnter();
                        continue;
                    }

                    if (escolha < 1 || escolha > getInventario().size()) {
                        System.out.println("Escolha inválida!");
                        primaEnter();
                        continue;
                    }
                    
                    Consumivel itemEscolhido = getInventario().get(escolha - 1);
                    if (itemEscolhido instanceof ConsumivelCombate) {
                        ConsumivelCombate consumivel = (ConsumivelCombate) itemEscolhido;
                        int danoConsumivel = (int)(consumivel.getAtaqueInstantaneo());
                        npc.setHp(npc.getHp() - danoConsumivel);
                        System.out.println("\nUsaste " + consumivel.getNome() + "! O inimigo perde " +
                                          danoConsumivel + " pontos de vida.\n");
                        getInventario().remove(escolha - 1);
                    } else {
                        System.out.println("Este item não pode ser usado em combate!");
                        primaEnter();
                        continue;
                    }
                    break;

                default:
                    System.out.println("Escolha inválida.");
                    continue;
            }

            if (npc.getHp() > 0) {
                setHp(getHp() - npc.getForca());
                limparConsola();
                System.out.println("\nO inimigo ataca! O Feiticeiro perde " + npc.getForca() + " pontos de vida.\n");
                mostrarDetalhesCombate(this, npc);
                primaEnter();
            }

            if (npc.getHp() <= 0) {
                seGanhar(npc);
                break;
            }
            if (getHp() <= 0) {
                Audio.stopMusic();
                System.out.println("\nFoste derrotado pelo "+ npc.getNome()+"!\n");
                System.out.println("Fim de jogo!");
                primaEnter();
                encerrarPrograma();
                fecharProgramaAnimacao();
                System.exit(0);  // Encerra o programa
            }
        }
    }
}

