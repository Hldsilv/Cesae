package FichaPratica06;

import java.util.Scanner;

public class Ex_03 {

   //ex A
    static boolean par(int num){
        boolean par= true;
                if(num % 2 != 0){
                    par =false;
                }
        //em vez de fazer o que está em cima podia fazer só retun num%2==0; e ele verifica logo se é true ou false,
        // neste caso estou a dizer que é true, se nao der 0 ele assume false
    return par;
    }

    //ex B
    static boolean positivo(int num){

        return num>0;
    }

    //exc

    static boolean primo(int num){
        boolean primo=true;
        int contadordiv=0,resto;
        for(int i=1; i<=num;i++){
           resto = num % i;
                    if(resto==0){
                        contadordiv++;
                    }
        }
        if (contadordiv!=2){
            primo=false;
        }
    return primo;
    }
    //ex D
    static boolean perfeito(int num){
        boolean perfeito=true;
        int guarda=0;

        for(int i=1; i<num; i++){
            if(num%i==0){
               guarda=guarda+i;
            }

        }
        if(guarda!=num){
            perfeito=false;
        }
        return  perfeito;
    }
    //Ex E
    static boolean triangular(int num){

        boolean triangular=false;
        for (int i=1; i<=num;i++) {

            int op = i * (i + 1) / 2;
            if (op == num) {
                triangular = true;
                break;
            }
        }
        return  triangular;

    }
//        for (int i=0; i<=num;i++){  outra maneira de fazer o exercicio E (teria que ter int op=0)
//            op =  op + i;
//            if(op==num){
//                triangular=true;
//            }
//        }
    public static void main(String[] args) {

    }
}

