package ContaInvestimento;

public class ContaInvestimento {

    // Criação de atributos da classe Conta Corrente
    private int nConta;
    private String nomeTitular;
    private double saldo;
    private double taxaJuros;

    // Construtor
    public ContaInvestimento(int nConta, String nomeTitular, double saldo, double taxaJuros){
        this.nConta = nConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.taxaJuros = taxaJuros;
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

    // Criação do método que aidicona juros a conta
    public void adicionarJuros(){
        saldo += (saldo / 100) * taxaJuros;
    }


}
