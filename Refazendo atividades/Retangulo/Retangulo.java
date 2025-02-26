package Retangulo;

public class Retangulo {

    // Atributos da classe Retangulo
    private int base;
    private int altura;

    // Construtor
    public Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    // Métodos "Get" que retornam o valor do atributo 
    public int getBase(){
        return base;
    }

    public int getAltura(){
        return altura;
    }

    // Métodos "Set" que alteram o valor do atributo
    public void setBase(int valor){
        this.base = valor;
    }

    public void setAltura(int valor){
        this.altura = valor;
    }

    // Método para calcular área do Triângulo
    public int calcularArea(){
        return base * altura;
    }

    // Método para calcular perímetro do Triângulo
    public int calcularPerimetro(){
        return (altura * 2) + base;
    }
}
