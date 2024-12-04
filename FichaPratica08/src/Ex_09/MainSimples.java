package Ex_09;

public class MainSimples {
    public static void main(String[] args) {

        // Instanciar o produto
        Produto bolacha = new Produto("Bolacha Oreo",2.5);
        bolacha.exibirDetalhes();

        // Comprar 10 unidades
        bolacha.comprar(10);
        bolacha.exibirDetalhes();

        // Venda falhada - só temos 10
        bolacha.vender(22);
        bolacha.exibirDetalhes();

        // Venda efetuada - temos 10
        bolacha.vender(2);
        bolacha.exibirDetalhes();
    }
}
