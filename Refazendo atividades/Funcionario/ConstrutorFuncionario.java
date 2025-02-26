package Funcionario;

public class ConstrutorFuncionario {
    public static void main(String[] args) {
        
        // Criação do objeto Funcionário
        Funcionario func = new Funcionario("\nJail", 2600.00);

        // Mostrando nome e salário do funcionário
        System.out.println(func.getNome());
        System.out.println(func.getSalario());

        // Concedendo aumento através do método aumentarSalario
        func.aumentarSalario(10);

        // Mostrando salário após aumento
        System.out.println(func.getSalario());
    }
    
}
