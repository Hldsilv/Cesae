package Ex_03;

public class Retangulo {

    private int largura;
    private int altura;


    /**
     * Construtor para Retangulo
     * @param largura largura do Retangulo
     * @param altura altura do Retangulo
     */
    Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;

    }

    /**
     * Calcula a area do retangulo
     * @return area largura * altura
     */
    public int area(){
        return this.largura*this.altura;
}

    /**
     * Calcula o perimetro do retangulo
     * @return perimetro
     */
    public int perimetro(){
        return 2* (this.largura+this.altura);
}
}
