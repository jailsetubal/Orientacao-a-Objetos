package ContaCorrente;

public class ContaCorrente {

    // Criação de atributos da classe Conta Corrente
    private int nConta;
    private String nomeTitular;
    private double saldo;

    // Construtor
    public ContaCorrente(int nConta, String nomeTitular, double saldo){
        this.nConta = nConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    // Criação dos métodos "Get" que retornam o valor do atributo
    public int getConta(){
        return nConta;
    }

    public String getTitular(){
        return nomeTitular;
    }

    public double getSaldo(){
        return saldo;
    }

    // Criação do método Depósito e Saque
    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (saldo > 0){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque. \nSeu saldo é: R$" + saldo);
        }
    }


}
