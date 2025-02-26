package Carro;

public class Carro {
    
    // Criação de atributos da classe Carro
    private double combustivel;
    private double consumo;

    // Construtor
    public Carro(double combustivel, double consumo){
        this.combustivel = combustivel;
        this.consumo = consumo;
    }

    // Criação dos métodos "Get" que retornam o valor do atributo
    public double getCombustivel() {
        return combustivel;
    }

    public double getConsumo() {
        return consumo;
    }

    // Criação dos métodos "Set" que alteram o valor do atributo
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    // Criação do método andar
    public void andar(double distancia){
        combustivel -= distancia / consumo;
    }

    // Criação do método abastecer
    public void abastecer(double valor){
        combustivel += valor;
    }
}
