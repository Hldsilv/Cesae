package FichaExtraCiclos;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int maior, menor, numAtual, numAnt;

        System.out.println("Introduza um número");
        numAnt = input.nextInt();
        maior = numAnt;
        menor = numAnt;

        do {
            System.out.println("Introduza um número");
            numAtual = input.nextInt();

            if (numAtual > maior) {
                maior = numAtual;
            }

            if (numAtual != 0 && numAtual < menor) {
                menor = numAtual;
            }
            numAnt = numAtual;


        }
        while (numAtual != 0);
        System.out.println("maior" + maior);
        System.out.println("menor" + menor);
    }
}



