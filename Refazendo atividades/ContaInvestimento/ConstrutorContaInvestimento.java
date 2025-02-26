package ContaInvestimento;

public class ConstrutorContaInvestimento {
    public static void main(String[] args) {
        
        // Criação do objeto Conta Corrente
        ContaInvestimento novaConta = new ContaInvestimento(123, "Jail", 0, 5);

        // Utilizando método Depósitar
        novaConta.depositar(2600.00);

        // Mostrando saldo da conta
        System.out.println("\n" + novaConta.getSaldo());

        // Utilizando o método Saque
        novaConta.sacar(600);

        // Mostrando saldo atualizado
        System.out.println(novaConta.getSaldo());

        // Adicionando juros a conta e mostrando saldo atualizado
        novaConta.adicionarJuros();
        System.out.println("\n" + novaConta.getSaldo());
        novaConta.adicionarJuros();
        System.out.println("\n" + novaConta.getSaldo());
        novaConta.adicionarJuros();
        System.out.println("\n" + novaConta.getSaldo());
        novaConta.adicionarJuros();
        System.out.println("\n" + novaConta.getSaldo());
        novaConta.adicionarJuros();
        System.out.println("\n" + novaConta.getSaldo());
    }
}
