package Itens;

import java.util.ArrayList;

public class ItemHeroi {
    private String nome;
    private int preco;
    private ArrayList<String>heroisPermitidos;

    public ItemHeroi(String nome, int preco, ArrayList<String> heroisPermitidos) {
        this.nome = nome;
        this.preco = preco;
        this.heroisPermitidos = new ArrayList<>();
    }
}
