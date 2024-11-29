package FichaPratica01;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

<<<<<<< Updated upstream
        double  valor1, valor2, valor3, desconto= 0.10, valortotal;

        System.out.print("Introduza o valor do primeiro produto: ");
        valor1 = input.nextInt();

        System.out.print("Introduza o valor do segundo produto: ");
        valor2 = input.nextInt();

        System.out.print("Introduza o valor do terceiro produto: ");
        valor3 = input.nextInt();

        valortotal = (valor1 + valor2 + valor3) * desconto;
        valortotal= valor1 + valor2 + valor3 - valortotal;
        System.out.println("O valor total é: " + valortotal);

=======
        double valor1, valor2, valor3,desconto, total;

        System.out.println("Introduza o preço do primeiro produto: ");
        valor1 = input.nextInt();

        System.out.println("Introduza o preço do segundo produto: ");
        valor2 = input.nextInt();

        System.out.println("Introduza o preço do terceiro produto: ");
        valor3 = input.nextInt();

    desconto = (valor1 + valor2 + valor3) * 0.1;
        //System.out.println(+desconto);

    total = valor1 + valor2 + valor3 - desconto;

        System.out.println("O valor a pagar com desconto é: " + total + " euros");
>>>>>>> Stashed changes



    }
}
