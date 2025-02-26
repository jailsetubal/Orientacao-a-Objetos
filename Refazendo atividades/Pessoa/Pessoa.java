package Pessoa;

public class Pessoa {
    
    // Criação de atributos da classe Pessoa
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    // Construtor
    public Pessoa(String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    // Criação dos métodos "Get" que retornam o valor do atributo
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }
    
    public double getPeso(){
        return peso;
    }

    public double getAltura(){
        return altura;
    }

    // Criação do método envelhecer
    public void envelhecer(){
        if (idade < 21){
            System.out.println("Até os 21 anos você cresce 0.5cm por ano");
            this.idade +=1;
            this.altura += 0.05;
        } else{
            System.out.println("Velho demais, você já cresceu o que tinha pra crescer");
        }
        
    }

    // Criação dos método engordar e emagrecer
    public double engordar(double kgs){
        return peso += kgs;
    }

    public double emagrecer(double kgs){
        return peso -= kgs;
    }

    public double crescer(double cm){
        return altura += cm;
    }
}
