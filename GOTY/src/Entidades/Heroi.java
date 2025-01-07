package Entidades;


import AudioEcor.Cor;
import Itens.ArmaPrincipal;
import Itens.Consumivel;
import Itens.Pocao;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import Jogo.Jogo;
import static FuncoesAux.funcAux.limparConsola;
import static FuncoesAux.funcAux.primaEnter;

public class Heroi extends Entidade{

    private int nivel;
    private int ouro;
    private ArmaPrincipal armaPrincipal;
    private ArrayList<Consumivel>inventario;

    /**
     * Construtor da classe Heroi
     * @param nome nome do Heroi
     * @param maxHp hp máximo do Heroi
     * @param hp hp atual do Heroi
     * @param forca força do Heroi
     * @param nivel nivel do Heroi
     * @param ouro ouro do Heroi
     * @param armaPrincipal arma principal do Heroi
     */
    public Heroi(String nome, int maxHp, int hp, int forca, int nivel, int ouro, ArmaPrincipal armaPrincipal) {
        super(nome, maxHp, hp, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.armaPrincipal = armaPrincipal;
        this.inventario = new ArrayList<Consumivel>();
    }

    public int getNivel() {
        return nivel;
    }
    public int getOuro() {
        return ouro;
    }

    public ArmaPrincipal getArmaPrincipal() {
        return armaPrincipal;
    }

    public ArrayList<Consumivel> getInventario() {
        return inventario;
    }
    /**
     * Função para gastar ouro
     * @param quantidade quantidade de ouro a gastar
     */
    public void gastarOuro(int quantidade) {
        if (ouro >= quantidade) {
            ouro -= quantidade;
        } else {
            System.out.println("Ouro insuficiente.");
        }
    }
    /**
     * Função para ganhar ouro
     * @param quantidade quantidade de ouro a ganhar
     */
    public void ganharOuro(int quantidade) {
        ouro += quantidade;
    }

    /**
     * Função para atribuir a arma principal
     * @param armaPrincipal arma principal a atribuir
     */
    public void setArmaPrincipal(ArmaPrincipal armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }
    /**
     * Função para atacar um NPC
     * @param npc NPC a atacar
     * @throws FileNotFoundException caso o ficheiro não seja encontrado
     * @throws InterruptedException caso a thread seja interrompida
     */
    public void atacar(NPC npc) throws FileNotFoundException, InterruptedException {
        getArmaPrincipal().resetarAtaqueEspecial();
    }
    /**
     * Função para ganhar experiência,ouro,nivel,hp e força depois de derrotar um NPC
     * @param npc NPC derrotado
     */
    public void seGanhar(NPC npc) {
        System.out.println("\n"+Cor.ConsoleColors.GREEN_BACKGROUND + "Parabéns! Derrotaste o " + npc.getNome() + "!" + Cor.ConsoleColors.RESET);
        setOuro(getOuro() + npc.getOuro());
        setNivel(getNivel() + 1);
        setMaxHp(getVidaMax() + 10);
        setForca(getForca() + 1);
        primaEnter();
        limparConsola();
    }
    /**
     * Função para usar uma poção
     */ 
    public void usarPocao() {
        if (inventario.isEmpty()) {
            System.out.println("Você não tem poções no inventário!");
            return;
        }

        System.out.println("\nPoções disponíveis:");
        ArrayList<Integer> indicesPocoes = new ArrayList<>();

        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i) instanceof Pocao) {
                System.out.println((indicesPocoes.size() + 1) + ". " + inventario.get(i).getNome());
                indicesPocoes.add(i);
            }
        }

        if (indicesPocoes.isEmpty()) {
            System.out.println("Você não tem poções no inventário!");
            return;
        }

        System.out.println("0. Cancelar");
        System.out.print("Escolha uma poção: ");
        Scanner input = new Scanner(System.in);
        int escolha = input.nextInt();

        if (escolha == 0) return;
        if (escolha < 1 || escolha > indicesPocoes.size()) {
            System.out.println("Escolha inválida!");
            return;
        }

        int indiceEscolhido = indicesPocoes.get(escolha - 1);
        Pocao pocao = (Pocao) inventario.get(indiceEscolhido);

        // Verificar se vai exceder a vida máxima
        int curaEfetiva = pocao.getCurarVida();
        if (getHp() + curaEfetiva > getVidaMax()) {
            int excesso = (getHp() + curaEfetiva) - getVidaMax();
            System.out.println("Atenção: Você irá desperdiçar " + excesso + " pontos de cura.");
            System.out.println("Deseja continuar? (1-Sim/2-Não)");
            if (input.nextInt() != 1) return;
        }
        // Aplicar efeitos da poção
        curar(pocao.getCurarVida());
        setForca(getForca() + pocao.getAumentoForca());

        System.out.println("Você usou " + pocao.getNome());
        System.out.println("Vida atual: " + getHp() + "/" + getVidaMax());
        System.out.println("Força atual: " + getForca());

        // Remover a poção do inventário
        inventario.remove(indiceEscolhido);
    }
    /**
     * Função para mostrar os detalhes do Heroi
     */
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println(Cor.ConsoleColors.GREEN_BOLD + "Nível: " + Cor.ConsoleColors.RESET + getNivel());
        System.out.println(Cor.ConsoleColors.YELLOW_BOLD + "Ouro: " + Cor.ConsoleColors.RESET + getOuro());
        System.out.println(Cor.ConsoleColors.PURPLE_BOLD + "Força total (Arma + Heroi): " + Cor.ConsoleColors.RESET + (getForca()+getArmaPrincipal().getAtaque()));
    }
}
