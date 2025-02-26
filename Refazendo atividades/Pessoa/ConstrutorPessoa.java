package Pessoa;

public class ConstrutorPessoa {
    public static void main(String[] args) {
        
        // Criação do objeto Pessoa
        Pessoa guy = new Pessoa("Jail", 19, 74.5, 1.89);

        // Utilizando os Gets
        System.out.println("\n" + guy.getNome());
        System.out.println(guy.getIdade());
        System.out.println(guy.getPeso());
        System.out.println(guy.getAltura());

        // Utilização dos métodos Envelhecer, engordar, emagrecer e crescer
        guy.crescer(0.06);
        guy.envelhecer();
        guy.engordar(9.5);
        guy.emagrecer(2.0);

        // Utilizando os Gets após atualizações
        System.out.println(guy.getNome());
        System.out.println(guy.getIdade());
        System.out.println(guy.getPeso());
        System.out.println(guy.getAltura());
    }

    
}
