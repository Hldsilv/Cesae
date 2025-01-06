package Entidades;

import Itens.ArmaPrincipal;
import Itens.Consumivel;
import Itens.ItemHeroi;

import java.util.ArrayList;
import java.util.Collections;


public class Vendedor {

    private String nome;
    private ArrayList<ItemHeroi> loja;

    /**
     * Construtor da classe Vendedor
     * @param nome nome do Vendedor
     */
    public Vendedor(String nome) {
        this.nome = nome;
        this.loja = new ArrayList<ItemHeroi>();
    }

public String getNome(){
        return nome;
}

    public ArrayList<ItemHeroi> getLoja() {
        return loja;
    }

    public void imprimirLoja() {
        System.out.println(nome + " está a vender os seguintes itens:\n");

        for (int i = 0; i < loja.size() && i < 10; i++) {
            System.out.print(i+1+ "-");
            loja.get(i).mostrarDetalhes();
        }
    }

    // Vende um item para o herói
    public void vender(Heroi heroi, int indice) {
        if (indice < 1 || indice > loja.size()) {
            System.out.println("Item inválido.");
            return;
        }

        ItemHeroi itemEscolhido = loja.get(indice - 1);


        // Verificar se o herói pode usar o item
        if (itemEscolhido instanceof ArmaPrincipal) {
            ArmaPrincipal arma = (ArmaPrincipal) itemEscolhido;
            if (!arma.podeUsar(heroi.getNome())) {
                System.out.println("Não podes usar esta arma.");
                return;
            }
        }
        if (heroi.getOuro() >= itemEscolhido.getPreco()) {
            heroi.gastarOuro(itemEscolhido.getPreco());

            // Se o item for uma arma, substitui a arma principal do herói
            if (itemEscolhido instanceof ArmaPrincipal) {
                ArmaPrincipal novaArma = (ArmaPrincipal) itemEscolhido;
                heroi.setArmaPrincipal(novaArma);  // Metodo setArmaPrincipal no herói para substituir a arma
                System.out.println("Você comprou a " + novaArma.getNome() + " por " + novaArma.getPreco() + " ouro. A tua arma foi substituída.");
            } else {
                // Se não for uma arma, adiciona o item no inventário do herói
                heroi.getInventario().add((Consumivel) itemEscolhido);
                System.out.println("Você comprou " + itemEscolhido.getNome() + " por " + itemEscolhido.getPreco() + " ouro.");
            }

            loja.remove(indice - 1); // Remove o item da loja após a compra
        } else {
            System.out.println("Ouro insuficiente para comprar " + itemEscolhido.getNome() + ".");
        }
    }

    public void adicionarItem(ItemHeroi item) {
        loja.add(item);
    }

}
