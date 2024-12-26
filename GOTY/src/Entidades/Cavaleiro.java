package Entidades;

import Itens.Consumivel;

import java.util.ArrayList;

public class Cavaleiro extends Heroi {

    public Cavaleiro(String nome, int maxHp, int hp, int forca, int nivel, int ouro, ArmaPrincipal armaPrincipal, ArrayList<Consumivel> inventario) {
        super(nome, maxHp, hp, forca, nivel, ouro, armaPrincipal, inventario);
    }

    public void atacar(NPC npc) {
        System.out.println("O Cavaleiro enfrenta o inimigo!");

        // Inimigo ataca primeiro
        int danoInimigo = (int) (npc.getForca() * 0.8); // 80% da força do NPC
        this.hp -= danoInimigo;
        System.out.println("O inimigo ataca! O Cavaleiro perde " + danoInimigo + " pontos de vida.");

        if (this.hp <= 0) {
            System.out.println("O Cavaleiro foi derrotado!");
            return;
        }

        // Cavaleiro ataca
        int danoHeroi = this.forca + armaPrincipal.getAtaque();
        npc.setHp(npc.getHp() - danoHeroi);
        System.out.println("O Cavaleiro ataca! O inimigo perde " + danoHeroi + " pontos de vida.");

        if (npc.getHp() <= 0) {
            System.out.println("O inimigo foi derrotado!");
            this.ouro += npc.getOuro();
            this.nivel++;
            this.hp += 10;
            this.forca++;
        }
    }



}
