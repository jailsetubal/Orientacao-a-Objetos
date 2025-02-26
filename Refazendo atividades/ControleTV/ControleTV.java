package ControleTV;

public class ControleTV {
    // Atributos da classe ControleTV
    private int canal;
    private int volume;

    // Construtor
    public ControleTV(int canal, int volume){
        this.canal = canal;
        this.volume = volume;
    }

    // Criação dos métodos "Get" que retornam o valor do atributo
    public int getCanal(){
        return canal;
    }

    public int getVolume(){
        return volume;
    }

    // Criação do método "Set" que altera o valor do atributo
    public void setCanal(int valor){
        this.canal = valor;
    }

    //Criação dos métodos aumentar e diminuir volume
    public int aumentarVolume(){
        return this.volume +=1;
    }

    public int reduzirVolume(){
        return this.volume -=1;
    }
}
