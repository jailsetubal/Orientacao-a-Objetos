package Bola;

public class ConstrutorBola {
    public static void main(String[] args) {

        // Criação do objeto Bola
        Bola ball = new Bola("\nPreta");

        // Retorna a cor da Bola
        System.out.println(ball.getCor());

        //Altera a cor da bola
        ball.setCor("Vermelho");

        //Retorna a cor da bola
        System.out.println(ball.getCor());
    }
}
