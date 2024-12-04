package Ex_09;

public class Produto {
    private String nome;
    private double preco;
    private int stock = 0;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void comprar(int quantidade) {
        this.stock += quantidade;
    }

    public void vender(int quantidade) {
        if (this.stock >= quantidade) {
            this.stock -= quantidade;
            System.out.println("Venda Efetuada: " + quantidade);
        }else{
            System.out.println("Quebra de Stock. Venda não executada!");
        }
    }



    public void exibirDetalhes(){
        System.out.println("Produto: "+this.nome+"\t| Preço: "+this.preco+"\t| Stock: "+this.stock);
    }
}
