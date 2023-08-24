
package aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta  c1 = new Caneta();
        c1.cor = " Azul";
       // c1.ponta= 0.5f ;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        
        Caneta c2 = new Caneta();
        
        c2.modelo = "BIC Cristal";
        c2.cor = "Azul";
       // c2.ponta = 0.5f ;
        c2.carga = 80;
        c2.tampada = false;
        c2.rabiscar();
        
        
        
    }
    
}
