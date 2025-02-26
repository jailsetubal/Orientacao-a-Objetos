package Quadrado;

public class Quadrado {
    
    // Atributos da classe Quadrado
    private int lado;

    // Construtor
    public Quadrado(int lado){
        this.lado = lado;
    }

    // Método "Get" que retorna o valor do atributo Lado
    public int getLado(){
        return lado;
    }

    // Método "Set" que altera o valor do atributo Lado
    public void setLado(int lado){
        this.lado = lado;
    }

    // Método para calcular a área de um quadrado
    public int calcularArea(){
        return lado * lado;
    }
}
