package Itens;

import AudioEcor.Cor;

public class ConsumivelCombate extends Consumivel{
    private int ataqueInstantaneo;

    /**
     * Construtor da classe ConsumivelCombate
     * @param nome nome do ConsumivelCombate
     * @param preco preço do ConsumivelCombate
     * @param ataqueInstantaneo força do ataque instantâneo do ConsumivelCombate
     */
    public ConsumivelCombate(String nome, int preco, int ataqueInstantaneo) {
        super(nome, preco);
        this.ataqueInstantaneo = ataqueInstantaneo;
    }

    public int getAtaqueInstantaneo() {
        return ataqueInstantaneo;
    }
    /**
     * Função para mostrar os detalhes do ConsumivelCombate
     */
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println(Cor.ConsoleColors.RED_BOLD + "\tAtaque Instantâneo: " + Cor.ConsoleColors.RESET + ataqueInstantaneo);
    }
}
