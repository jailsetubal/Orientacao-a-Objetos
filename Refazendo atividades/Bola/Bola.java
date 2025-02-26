package Bola;

public class Bola {

    // Atributos da classe Bola
    private String cor;

    // Construtor
    public Bola(String cor){
        this.cor = cor;
    }

    // Método "Get" que retorna o atributo Cor
    public String getCor(){
        return cor;
    }

    // Método "Set" que altera o atributo Cor
    public void setCor(String novaCor){
        this.cor = novaCor;
    }
}