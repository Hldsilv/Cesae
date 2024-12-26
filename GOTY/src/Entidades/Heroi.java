package Entidades;

import ENUMS.TiposDeArmas;
import Itens.Consumivel;

import java.util.ArrayList;

public class Heroi extends Entidade{

    private int nivel;
    private int ouro;
    private TiposDeArmas armaPrincipal;
    private ArrayList<Consumivel>inventario;

    public Heroi(String nome, int maxHp, int hp, int forca, int nivel, int ouro, TiposDeArmas armaPrincipal, ArrayList<Consumivel> inventario) {
        super(nome, maxHp, hp, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.armaPrincipal = armaPrincipal;
        this.inventario = new ArrayList<>();
    }

    public int getNivel() {
    return nivel;
    }
    public int getOuro() {
    return ouro;
    }

    public TiposDeArmas getArmaPrincipal() {
    return armaPrincipal;
    }

    public ArrayList<Consumivel> getInventario() {
    return inventario;
    }

    public void atacar(NPC npc){

    }
    public void usarPocao() {
        // lógica para usar poção
    }


}
