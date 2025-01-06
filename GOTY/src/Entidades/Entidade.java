package Entidades;

import AudioEcor.Cor;

public class Entidade {
    private String nome;
    private int maxHp;
    private int hp;
    private int forca;

    /**
     * Construtor da classe Entidade
     * @param nome nome da Entidade
     * @param maxHp hp máximo da Entidade
     * @param hp hp atual da Entidade
     * @param forca força da Entidade
     */
    public Entidade(String nome, int maxHp, int hp, int forca) {
        this.nome = nome;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public int getVidaMax() {
        return maxHp;
    }

    public int getHp() {
        return hp;
    }

    public int getForca() {
        return forca;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void curar(int pontos) {

        this.hp += pontos;
        if (this.hp > this.maxHp) {
            this.hp = this.maxHp;
        }
    }
    public boolean estaVivo() {
        return this.hp > 0;
    }

    public void mostrarDetalhes() {
        System.out.println(Cor.ConsoleColors.CYAN_BOLD + "Classe: " + Cor.ConsoleColors.RESET + this.nome);
        System.out.println(Cor.ConsoleColors.RED_BOLD + "Vida: " + Cor.ConsoleColors.RESET + this.hp + " | " + this.maxHp);
    }

}
