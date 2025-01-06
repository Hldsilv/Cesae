package Entidades;

import AudioEcor.Cor;

public class NPC extends Entidade {
    private int ouro;

    /**
     * Construtor da classe NPC
     * @param nome nome do NPC
     * @param maxHp hp máximo do NPC
     * @param hp hp atual do NPC
     * @param forca força do NPC
     */
    public NPC(String nome, int maxHp, int hp, int forca) {
        super(nome, maxHp, hp, forca);
        this.ouro=ouro;
    }

    public int getOuro() {
        return ouro;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println(Cor.ConsoleColors.YELLOW_BOLD + "Ouro: " + Cor.ConsoleColors.RESET + getOuro());
    }
}
