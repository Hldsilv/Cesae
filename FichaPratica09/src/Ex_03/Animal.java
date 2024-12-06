package Ex_03;

public class Animal {

        private String nome;
        private String especie;
        private String paisOrigem;
        private double pesoKg;
        private String[] alimentacao;

        public Animal(String nome, String especie, String paisOrigem, double pesoKg, String[] alimentacao) {
            this.nome = nome;
            this.especie = especie;
            this.paisOrigem = paisOrigem;
            this.pesoKg = pesoKg;
            this.alimentacao = alimentacao;
        }

        public void comer(String alimento, double pesoGr) {
            for (int i = 0; i < this.alimentacao.length; i++) {
                if (this.alimentacao[i].equalsIgnoreCase(alimento)) {
                    // Gostou do alimento
                    System.out.println(this.nome + " comeu " + alimento);
                    this.pesoKg += pesoGr / 1000;
                    return;
                }
            }

            System.out.println(this.nome + " não gosta de " + alimento);

        }

        public void exibirDetalhes() {
            System.out.println(this.nome + " | " + this.especie + " | " + this.paisOrigem + " | " + this.pesoKg + " Kg.");
        }
}
