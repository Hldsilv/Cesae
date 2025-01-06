package Itens;

import AudioEcor.Cor;

public class Pocao extends Consumivel {
    private int curarVida;
    private int aumentoForca;

    /**
     * Construtor da classe Pocao
     * @param nome nome da Pocao
     * @param preco preço da Pocao
     * @param curarVida quantidade de vida que a Pocao cura
     * @param aumentoForca quantidade de força que a Pocao aumenta
     */
    public Pocao(String nome, int preco, int curarVida, int aumentoForca) {
        super(nome, preco);
        this.curarVida = curarVida;
        this.aumentoForca = aumentoForca;
    }

    public int getCurarVida() {
        return curarVida;
    }

    public int getAumentoForca() {
        return aumentoForca;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.print(Cor.ConsoleColors.RED_BOLD + "\tVida a Curar: " + Cor.ConsoleColors.RESET + curarVida + "\t|");
        System.out.print(Cor.ConsoleColors.PURPLE_BOLD + "\tAumento de Força: " + Cor.ConsoleColors.RESET + aumentoForca + "\n");
    }
}
