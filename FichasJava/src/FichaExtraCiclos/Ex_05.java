package FichaExtraCiclos;

public class Ex_05 {
    public static void main(String[] args) {


        for (int i =1; i<6;i++){


                for (int j=1;j<i;j++){
                    System.out.print(i);
                }
            System.out.println(i);
        }

        //PERCEBER ESTE E O PROXIMO!!!!!
        for (int j = 1; j <= 5; j++) {
            // Imprimir espaços em branco
            for (int k = j; k < 5; k++) {
                System.out.print(" "); // Espaço em branco
            }
            // Imprimir o número correspondente
            for (int k = 1; k <= (2 * j - 1); k++) {
                System.out.print(j); // Imprime o número da linha
            }
            // Mover para a próxima linha
            System.out.println();
        }

        for (int j = 1; j <= 5; j++) {
            // Imprimir espaços em branco
            for (int k = j; k < 5; k++) {
                System.out.print(" "); // Espaço em branco
            }
            // Imprimir números decrescentes
            for (int k = j; k >= 1; k--) {
                System.out.print(k); // Imprime números de j até 1
            }
            // Imprimir números crescentes
            for (int k = 2; k <= j; k++) {
                System.out.print(k); // Imprime números de 2 até j
            }
            // Mover para a próxima linha
            System.out.println();
        }

        }
    }

