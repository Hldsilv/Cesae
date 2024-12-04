package Ex_03;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo(10,10);


        System.out.println("Area do retangulo" +retangulo1.area());
        System.out.println("Perimetro do retangulo" +retangulo1.perimetro());
    }
}
