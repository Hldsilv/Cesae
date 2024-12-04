package Ex_06;

public class Calculadora {



    public Calculadora (){


    }
    public void somar(int num1, int num2){
        int soma = num1+num2;
        System.out.println("A soma é " +soma);
    }
    public void subtrair(int num1, int num2){
        int subtracao = num1-num2;
        System.out.println("A subtração é " +subtracao);
    }
    public void multiplicacao(int num1, int num2){
        int multi= num1*num2;
        System.out.println("A multiplicação é " +multi);
    }
    public void divisao ( int num1, int num2){
        int div= num1/num2;
        System.out.println("A divisão é: " +div);
    }

}
