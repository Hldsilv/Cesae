package Itens;

import AudioEcor.Cor;

import java.util.ArrayList;

public class ItemHeroi {
    private String nome;
    private int preco;
    private ArrayList<String>heroisPermitidos;

    /**
     * Construtor da classe ItemHeroi
     * @param nome nome do ItemHeroi
     * @param preco preço do ItemHeroi
     */
    public ItemHeroi(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
        this.heroisPermitidos = new ArrayList<String>();
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public ArrayList<String> getHeroisPermitidos() {
        return heroisPermitidos;
    }

    public void adicionarHeroiPermitido(String nomeHeroi) {
        if (!heroisPermitidos.contains(nomeHeroi)) {
            heroisPermitidos.add(nomeHeroi);
        }
    }

    public boolean podeUsar(String nomeHeroi) {
        return heroisPermitidos.isEmpty() || heroisPermitidos.contains(nomeHeroi);
        // Se a lista de heróis permitidos estiver vazia, qualquer herói pode usar
    }

    public void mostrarDetalhes() {
        System.out.print(Cor.ConsoleColors.CYAN_BOLD + "Nome do Item: " + Cor.ConsoleColors.RESET + String.format("%-25s", nome) + "|");
        System.out.print(Cor.ConsoleColors.YELLOW_BOLD + " Preço: " + Cor.ConsoleColors.RESET + preco + " ouro  |");
        System.out.print(Cor.ConsoleColors.PURPLE_BOLD + " Herois permitidos: " + Cor.ConsoleColors.RESET + String.format("%-13s", getHeroisPermitidos()) + "|");
    }



}
