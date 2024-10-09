package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int num, aleatorio;
        System.out.println("Introduza o número: ");
        aleatorio = input.nextInt();
        System.out.print("Adivinhe o número: ");
        num = input.nextInt();


        if (num > aleatorio) {
            System.out.println("Muito alto");
        } else if (num == aleatorio) {
            System.out.println("Acertou");
        } else {
            System.out.println("Muito baixo");
        }

        if(num!=aleatorio){
        System.out.print("Adivinhe o número: ");
        num = input.nextInt();


        if (num > aleatorio) {
            System.out.println("Muito alto");
            System.out.println("Ficaste sem tentativas");
        } else if (num == aleatorio) {
            System.out.println("Acertou");
        } else {
            System.out.println("Muito baixo");
            System.out.println("Ficaste sem tentativas");
        }

        }
    }
}
