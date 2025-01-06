package Jogo;

import Entidades.NPC;
import Entidades.Vendedor;
import Itens.ItemHeroi;

import java.util.ArrayList;

public class Sala {

    private String descricao;
    private Sala opcao1;
    private String descricaoOpcao1;
    private Sala opcao2;
    private String descricaoOpcao2;
    private NPC inimigo;
    private ArrayList<ItemHeroi> itensNoChao;
    private Vendedor vendedor;

    /**
     * Construtor da classe Sala
     * @param descricao descrição da Sala
     * @param opcao1 ligação com a sala opcao1
     * @param descricaoOpcao1 descrição da opção 1
     * @param opcao2 ligação com a sala opcao2
     * @param descricaoOpcao2 descrição da opção 2
     * @param inimigo inimigo da Sala
     */
    public Sala(String descricao, Sala opcao1, String descricaoOpcao1, Sala opcao2, String descricaoOpcao2) {
        this.descricao = descricao;
        this.opcao1 = opcao1;
        this.descricaoOpcao1 = descricaoOpcao1;
        this.opcao2 = opcao2;
        this.descricaoOpcao2 = descricaoOpcao2;
        this.inimigo = inimigo;
        this.itensNoChao = new ArrayList<>();
    }

    public String getDescricao() {
        return descricao;
    }

    public Sala getOpcao1() {
        return opcao1;
    }

    public Sala getOpcao2() {
        return opcao2;
    }

    public String getDescricaoOpcao1() {
        return descricaoOpcao1;
    }

    public String getDescricaoOpcao2() {
        return descricaoOpcao2;
    }

    public void adicionarInimigo(NPC inimigo) {
        this.inimigo = inimigo;
    }

    public NPC getInimigo() {
        return inimigo;
    }

    public void adicionarItem(ItemHeroi item) {
        itensNoChao.add(item);
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<ItemHeroi> getItensNoChao() {
        return itensNoChao;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
}