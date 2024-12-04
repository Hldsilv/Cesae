package Ex_04;

public class Circulo {

    private double raio ;


    /**
     * Construtor para Circulo
     * @param raio raido do circulo
     */
    Circulo(double raio){
        this.raio = raio;

    }
    /**
     * Calcula a area do circulo
     * @return area raio * pi ao quadrado
     */
    public double area() {
        return this.raio*this.raio*3.14;
    }

    /**
     * Calcula o perimetro do circulo
     * @return perimetro 2 * raio * pi
     */
    public double perimetro() {
        return this.raio*3.14*2;

    }
}
