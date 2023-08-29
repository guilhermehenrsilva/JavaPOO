 
package poo;

public class ExemploCarro {
    // Método para mostrar a velocidade de um carro
    public static void mostrarVelocidade(Carro carro) {
        System.out.println("Velocidade: " + carro.obterVelocidade() + " km/h");
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2023, "Prata");
        CarroEsportivo carro2 = new CarroEsportivo("Ferrari", "F458", 2023, "Vermelho", 500);

        carro1.acelerar(50);
        carro2.acelerar(50);
        
        System.out.println("Velocidade carro1: " + carro1.obterVelocidade() + " km/h");
        mostrarVelocidade(carro1); // Polimorfismo: passando um objeto Carro
      
        System.out.println("Velocidade carro2: " + carro2.obterVelocidade() + " km/h");
        mostrarVelocidade(carro2); // Polimorfismo: passando um objeto CarroEsportivo
        
        
    }
}