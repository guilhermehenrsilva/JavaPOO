
package poo;


public class Carro {
    public String Modelo;
    public String Cor;
    public Boolean parado;
    
    public void status (){
        
        System.out.println("Modelo? " + this.Modelo);
        System.out.println("Cor? " + this.Cor);
        System.out.println("Carro está parado? " + this.parado);
        
    }
    
    public void andar (){
        if(this.parado == true) {
            System.out.println("Não é possivel andar!");
        } else {
            System.out.println("Estamos Andando");
        }
    }
    
    public void freiar(){
        this.parado = false;
    }
    
    public void parar(){
        this.parado = false;
    }
}    
