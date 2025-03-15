
package poo;

// Definição da classe Carro (Abstração)
class Carro {
    private String marca;     // Atributo encapsulado (Encapsulamento)
    private String modelo;    // Atributo encapsulado (Encapsulamento)
    private int ano;          // Atributo encapsulado (Encapsulamento)
    private String cor;       // Atributo encapsulado (Encapsulamento)
    int velocidade;   // Atributo encapsulado (Encapsulamento)

    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidade = 0;
    }

    public void acelerar(int quantidade) {
        this.velocidade += quantidade;
    }

    public void frear(int quantidade) {
        this.velocidade -= quantidade;
    }

    public int obterVelocidade() {
        return this.velocidade;
    }
}

