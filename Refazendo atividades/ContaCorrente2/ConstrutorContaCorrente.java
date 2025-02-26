package ContaCorrente2;

import java.util.Scanner;

public class ConstrutorContaCorrente {
    public static void main(String[] args) {
        ContaCorrente[] conta = new ContaCorrente[3];
        boolean sair = false;
        while (!sair){
            System.out.println("1: Criar conta\n"
            + "2: Logar em uma conta\n"
            + "Qualquer outra opção para sair\n");
            
            int escolha = new Scanner(System.in).nextInt();

            switch(escolha) {
                
                case 1:
                    System.out.println("Informe o Numero da conta:\n"
                    + "Informe seu nome: "
                    + "Saldo R$0.00");

                    int nc = new Scanner(System.in).nextInt();
                    String name = new Scanner(System.in).nextLine();
                    ContaCorrente fulano = new ContaCorrente(nc, name, 0);
                    boolean cheio = true;

                    for (int i = 0 ; i < conta.length ; i++){
                        if (conta[i] == null){
                            cheio = false;
                            conta[i] = fulano;
                            System.out.println("Conta criada com sucesso");
                            break;
                        }
                    }
                    if (cheio){
                        System.out.println("Limite de criação de contas atingido");
                        } 
                    break;

                case 2:
                    System.out.println("Informe o nome do titular");
                    String nt = new Scanner(System.in).nextLine();
                    boolean achei = false;
                    for (int i = 0 ; i < conta.length ; i++){
                        if (conta[i].getTitular().equals(nt)){
                            achei = true;
                            boolean exit = false;
                            while (!exit) {
                                System.out.println("Digite 1 para Depositar:"
                                + "2 para Sacar"
                                + "Qualquer outra opção para sair!");
                                int choice = new Scanner(System.in).nextInt();

                                switch (choice){
                                    case 1:
                                        System.out.println("Informe quanto deseja depositar: R$");
                                        double value = new Scanner(System.in).nextDouble();
                                        conta[i].depositar(value);
                                        System.out.println("Valor depositado com sucesso");
                                        break;

                                    case 2:
                                        System.out.println("Informe o valor que deseja sacar: ");
                                        double saque = new Scanner(System.in).nextDouble();
                                        if (conta[i].getSaldo() > saque){
                                            conta[i].sacar(saque);
                                            System.out.println("Saque efetuado com sucesso");
                                            break;

                                        } else {
                                            System.out.println("Valor indisponível para saque");
                                        } break;
                                    default:
                                        exit = true;
                                        break;

                                }
                                    

                            }
                        }
                    } default:
                        sair = true;
                        break;
                
            }
            
            
        }
    }    
}
