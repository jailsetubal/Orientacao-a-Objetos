package GerenciarFuncionario;

public class GerenciarFuncionario {

    // Criação de atributos da classe Funcionário
    private String nome;
    private double salario;

    // Construtor
    public GerenciarFuncionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    // Criação dos métodos "Get" que retornam o valor do atributo
    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    // Criação do método que calcula o aumento do salário com base no valor informado em porcentagem
    public double aumentarSalario(double percentualAumento){
        return salario += ((salario / 100) * percentualAumento);
    }
    
}
