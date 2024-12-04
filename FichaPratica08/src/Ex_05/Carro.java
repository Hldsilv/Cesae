package Ex_05;

public class Carro {
    private String marca;
    private String modelo;
    private int anoDeFabrico;


 Carro (String marca, String modelo, int anoDeFabrico){
    this.marca = marca;
    this.modelo =modelo;
    this.anoDeFabrico = anoDeFabrico;
}

  public void ligar(){
      System.out.println("O carro está ligado");
  }


}
