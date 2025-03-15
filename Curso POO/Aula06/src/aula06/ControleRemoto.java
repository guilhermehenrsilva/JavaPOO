package aula06;

public class ControleRemoto implements Controlador {
    // atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
     
    //metodos especiais 

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
                
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean Tocando) {
        this.tocando = tocando;
    }
    
    //metodo abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setTocando(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está Ligado? " + this.getLigado());
        System.out.println("Está Tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0 ;i <= this.getVolume(); i+=10){
            System.out.print("[]");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu ....");
    }

    @Override
    public void maisVolume() {
    }

    @Override
    public void menosVolume() {
    }

    @Override
    public void ligarMudo() {
    }

    @Override
    public void desligarMudo() {
    }

    @Override
    public void play() {
    }

    @Override
    public void pause() {
    }
    
    
    
    
}
