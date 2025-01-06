package Entidades;

import AudioEcor.Audio;
import AudioEcor.Cor;
import Itens.ArmaPrincipal;
import Itens.Consumivel;
import Itens.ConsumivelCombate;

import java.io.FileNotFoundException;
import java.util.Scanner;
import static FuncoesAux.funcAux.*;

public class Cavaleiro extends Heroi {

    Scanner input = new Scanner(System.in);

    /**
     * Construtor da classe Cavaleiro
     * @param nome nome do Cavaleiro
     * @param maxHp hp máximo do Cavaleiro
     * @param hp hp atual do Cavaleiro
     * @param forca força do Cavaleiro
     * @param nivel nivel do Cavaleiro
     * @param ouro ouro do Cavaleiro
     * @param armaPrincipal arma principal do Cavaleiro
     */ 
    public Cavaleiro(String nome, int maxHp, int hp, int forca, int nivel, int ouro, ArmaPrincipal armaPrincipal) {
        super(nome, maxHp, hp, forca, nivel, ouro, armaPrincipal);
    }

    @Override
    public void atacar(NPC npc) throws FileNotFoundException, InterruptedException {

        System.out.println("\nO Cavaleiro enfrenta o inimigo!\n");
        mostrarDetalhesCombate(this, npc);
        primaEnter();
        limparConsola();
        setHp(getHp() - (int) (npc.getForca() * 0.8));
        System.out.println("O inimigo ataca! O Cavaleiro perde " + (int) (npc.getForca() * 0.8) + " pontos de vida.\n");
        mostrarDetalhesCombate(this, npc);
        while (true) {
            // Verificar se o herói morreu
            if (getHp() <= 0) { 
                Audio.stopMusic();
                System.out.println(Cor.ConsoleColors.RED_BOLD + "\nFoste derrotado pelo "+ npc.getNome()+"!\n" + Cor.ConsoleColors.RESET);
                System.out.println("Fim de jogo!");
                primaEnter();
                encerrarPrograma();
                fecharProgramaAnimacao();
                System.exit(0);  // Encerra o programa
            }

            if (npc.getHp() <= 0) {
                seGanhar(npc);
                break;
            }

            System.out.println("\nEscolhe o tipo de ataque:");
            System.out.println("1. Ataque Normal");
            System.out.println("2. Ataque Especial");
            System.out.println("3. Ataque Consumível");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    // Ataque Normal
                    limparConsola();
                    int danoNormal = getForca() + getArmaPrincipal().getAtaque();
                    npc.setHp(npc.getHp() - danoNormal);
                    System.out.println("\nO Cavaleiro ataca! O inimigo perde " + danoNormal + " pontos de vida.\n");
                    mostrarDetalhesCombate(this, npc);
                    primaEnter();
                    break;

                case 2:
                    // Ataque Especial
                    if (!getArmaPrincipal().isUsouAtaqueEspecial()) {
                        limparConsola();
                        int danoEspecial = getForca() + getArmaPrincipal().getAtaqueEspecial();
                        npc.setHp(npc.getHp() - danoEspecial);
                        System.out.println("\nO Cavaleiro usa Ataque Especial! O inimigo perde " + danoEspecial + " pontos de vida.\n");
                        getArmaPrincipal().setUsouAtaqueEspecial(true);
                        mostrarDetalhesCombate(this, npc);
                        primaEnter();
                    } else {
                        limparConsola();
                        System.out.println("Já usaste o Ataque Especial nesta luta!\n");
                        mostrarDetalhesCombate(this, npc);
                        continue;
                    }
                    break;

                case 3:
                    // Ataque Consumível
                    if (getInventario().isEmpty()) {
                        limparConsola();
                        System.out.println("Não tens itens consumíveis!\n");
                        mostrarDetalhesCombate(this, npc);
                        continue;
                    }

                    // Mostrar consumíveis disponíveis
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
                        continue;
                    }
                    // Verificar se a escolha é válida
                    if (escolha < 1 || escolha > getInventario().size()) {
                        System.out.println("Escolha inválida!");
                        return;
                    }

                    Consumivel itemEscolhido = getInventario().get(escolha - 1);

                    // Verificar se o item é um consumível de combate
                    if (itemEscolhido instanceof ConsumivelCombate) {
                        ConsumivelCombate consumivel = (ConsumivelCombate) itemEscolhido;
                        npc.setHp(npc.getHp() - consumivel.getAtaqueInstantaneo());
                        System.out.println("\nUsaste " + consumivel.getNome() + "! O inimigo perde " +
                                consumivel.getAtaqueInstantaneo() + " pontos de vida.\n");
                        // Remover o item do inventário após o uso
                        getInventario().remove(escolha - 1);
                    } else {
                        System.out.println("Este item não pode ser usado em combate!");
                        return;
                    }
                    break;

                default:
                    System.out.println("Escolha inválida.");
                    return;
            }

            if (npc.getHp() > 0) {
                setHp(getHp() - (int) (npc.getForca() * 0.8));
                limparConsola();
                System.out.println("\nO inimigo ataca! O Cavaleiro perde " + (int) (npc.getForca() * 0.8) + " pontos de vida.\n");
                mostrarDetalhesCombate(this, npc);
            }
        }
    }
}
