
package poo;

    // Classe derivada que herda de Carro (Herança)
    class CarroEsportivo extends Carro {
    private int potencia;

    public CarroEsportivo(String marca, String modelo, int ano, String cor, int potencia) {
        super(marca, modelo, ano, cor);
        this.potencia = potencia;
    }

  
    // Polimorfismo: Sobrescreve o método acelerar da classe base
    @Override
    public void acelerar(int quantidade) {
        this.velocidade += quantidade * this.potencia;
    }
}
