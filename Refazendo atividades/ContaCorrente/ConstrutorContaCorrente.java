package ContaCorrente;

public class ConstrutorContaCorrente {
    public static void main(String[] args) {
        
        // Criação do objeto Conta Corrente
        ContaCorrente novaConta = new ContaCorrente(123, "Jail", 0);

        // Utilizando método Depósitar
        novaConta.depositar(2600.00);

        // Mostrando saldo da conta
        System.out.println("\n" + novaConta.getSaldo());

        // Utilizando o método Saque
        novaConta.sacar(600);

        // Mostrando saldo atualizado
        System.out.println(novaConta.getSaldo());
    }   
}
