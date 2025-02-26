package GerenciarFuncionario;

import java.util.Scanner;

public class ConstrutorGerenciarFuncionario {
    public static void main(String[] args) {   
        
    // Criação de array do objeto funcionário
    GerenciarFuncionario[] func = new GerenciarFuncionario[3];
    boolean sair = false;
    
    // Inicializando looping
    while (!sair) {

        System.out.println("\nDigite 1 para cadastrar\n" 
                + "2 para conceder aumento\n"
                + "Qualquer outro digito para sair");

        int escolha = new Scanner(System.in).nextInt();
        switch (escolha){
            case 1:
                System.out.println("Digite o nome e o salário");
                String n = new Scanner(System.in).nextLine();
                double s = new Scanner(System.in).nextDouble();
                GerenciarFuncionario fulano = new GerenciarFuncionario(n, s);
                boolean cheio = true;
                for (int i = 0 ; i < func.length; i++){
                    if (func[i] == null){
                        cheio = false;
                        func[i] = fulano;
                        System.out.println("Funcionário cadastrado com sucesso");
                        break;
                    }   
                }
                if (cheio){
                    System.out.println("Limite de cadastro atingido");
                }
                break;
            case 2:
                System.out.println("Digite o nome do funcionário");
                String nome = new Scanner(System.in).nextLine();
                boolean achei = false;
                for (int i = 0; i < func.length ; i++){
                    if (func[i].getNome().equals(nome)){
                        achei = true;
                        System.out.println("Digite a porcentagem do aumento a ser recebido: ");
                        double aumento = new Scanner(System.in).nextDouble();
                        func[i].aumentarSalario(aumento);
                        System.out.println("Salário ajustado:" + func[i].getSalario());
                        break;
                    }
                }
                if (!achei){
                    System.out.println("Este funcionário não está cadastrado");
                } 
                break;
            default:
                sair = true;
                break;
            
        }
    }
}
}