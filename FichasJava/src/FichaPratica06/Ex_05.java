package FichaPratica06;

public class Ex_05 {

    static int maior(int[] vetor) {

        int i = 1, maior = vetor[0];
        while (i < vetor.length) {

            if (maior < vetor[i]) {
                maior = vetor[i];
            }
            i++;
        }
        return maior;
    }

    //Ex B
    static int menor(int[] vetor) {

        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {

            if (menor > vetor[i]) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    //Ex C
    static boolean crescente(int[] vetor) {

        int compara = vetor[0];
        boolean crescente = true;

        for (int i = 1; i < vetor.length; i++) {

            if (compara > vetor[i]) {
                crescente = false;
                break;
            }
            if (compara < vetor[i]) {
                compara = vetor[i];
            }
        }
        return crescente;
    }

//outra maneira de fazer o C
//    for (int i = 1; i < vetor.length; i++) {
//        if (vetor[i] < vetor[i - 1]) { //se o vetor da frente for menor que o de trás dá logo false
//            return false; // Se encontrar um elemento menor que o anterior
//        }
//    }
//    return true; // Se não encontrou elementos fora da ordem


    public static void main(String[] args) {

    }
}
